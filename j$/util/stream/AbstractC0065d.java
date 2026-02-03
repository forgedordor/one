package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* renamed from: j$.util.stream.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0065d extends CountedCompleter {
    public static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;
    public final AbstractC0050a a;
    public Spliterator b;
    public long c;
    public AbstractC0065d d;
    public AbstractC0065d e;
    public Object f;

    public AbstractC0065d(AbstractC0050a abstractC0050a, Spliterator spliterator) {
        super(null);
        this.a = abstractC0050a;
        this.b = spliterator;
        this.c = 0L;
    }

    public static long e(long j) {
        long j2 = j / g;
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    public abstract Object a();

    public final boolean b() {
        return ((AbstractC0065d) getCompleter()) == null;
    }

    public abstract AbstractC0065d c(Spliterator spliterator);

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.c;
        if (jE == 0) {
            jE = e(jEstimateSize);
            this.c = jE;
        }
        boolean z = false;
        AbstractC0065d abstractC0065d = this;
        while (jEstimateSize > jE && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            AbstractC0065d abstractC0065dC = abstractC0065d.c(spliteratorTrySplit);
            abstractC0065d.d = abstractC0065dC;
            AbstractC0065d abstractC0065dC2 = abstractC0065d.c(spliterator);
            abstractC0065d.e = abstractC0065dC2;
            abstractC0065d.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractC0065d = abstractC0065dC;
                abstractC0065dC = abstractC0065dC2;
            } else {
                abstractC0065d = abstractC0065dC2;
            }
            z = !z;
            abstractC0065dC.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC0065d.d(abstractC0065d.a());
        abstractC0065d.tryComplete();
    }

    public void d(Object obj) {
        this.f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    public AbstractC0065d(AbstractC0065d abstractC0065d, Spliterator spliterator) {
        super(abstractC0065d);
        this.b = spliterator;
        this.a = abstractC0065d.a;
        this.c = abstractC0065d.c;
    }
}
