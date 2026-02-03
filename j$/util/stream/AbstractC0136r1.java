package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.r1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0136r1 extends CountedCompleter implements InterfaceC0128p2 {
    public final Spliterator a;
    public final AbstractC0050a b;
    public final long c;
    public final long d;
    public final long e;
    public int f;
    public int g;

    public AbstractC0136r1(Spliterator spliterator, AbstractC0050a abstractC0050a, int i) {
        this.a = spliterator;
        this.b = abstractC0050a;
        this.c = AbstractC0065d.e(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    public abstract AbstractC0136r1 a(Spliterator spliterator, long j, long j2);

    public /* synthetic */ void accept(double d) {
        AbstractC0171y1.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        AbstractC0136r1 abstractC0136r1A = this;
        while (spliterator.estimateSize() > abstractC0136r1A.c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            abstractC0136r1A.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            AbstractC0136r1 abstractC0136r1 = abstractC0136r1A;
            abstractC0136r1.a(spliteratorTrySplit, abstractC0136r1A.d, jEstimateSize).fork();
            abstractC0136r1A = abstractC0136r1.a(spliterator, abstractC0136r1.d + jEstimateSize, abstractC0136r1.e - jEstimateSize);
        }
        AbstractC0136r1 abstractC0136r12 = abstractC0136r1A;
        abstractC0136r12.b.M(spliterator, abstractC0136r12);
        abstractC0136r12.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final void k(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ boolean q() {
        return false;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC0171y1.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC0171y1.l();
        throw null;
    }

    public AbstractC0136r1(AbstractC0136r1 abstractC0136r1, Spliterator spliterator, long j, long j2, int i) {
        super(abstractC0136r1);
        this.a = spliterator;
        this.b = abstractC0136r1.b;
        this.c = abstractC0136r1.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }
}
