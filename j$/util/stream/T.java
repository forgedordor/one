package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes9.dex */
public final class T extends CountedCompleter {
    public final AbstractC0050a a;
    public Spliterator b;
    public final long c;
    public final ConcurrentHashMap d;
    public final Q e;
    public final T f;
    public G0 g;

    public T(AbstractC0050a abstractC0050a, Spliterator spliterator, Q q) {
        super(null);
        this.a = abstractC0050a;
        this.b = spliterator;
        this.c = AbstractC0065d.e(spliterator.estimateSize());
        this.d = new ConcurrentHashMap(Math.max(16, AbstractC0065d.g << 1));
        this.e = q;
        this.f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long j = this.c;
        boolean z = false;
        T t = this;
        while (spliterator.estimateSize() > j && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            T t2 = new T(t, spliteratorTrySplit, t.f);
            T t3 = new T(t, spliterator, t2);
            t.addToPendingCount(1);
            t3.addToPendingCount(1);
            t.d.put(t2, t3);
            if (t.f != null) {
                t2.addToPendingCount(1);
                if (t.d.replace(t.f, t, t2)) {
                    t.addToPendingCount(-1);
                } else {
                    t2.addToPendingCount(-1);
                }
            }
            if (z) {
                spliterator = spliteratorTrySplit;
                t = t2;
                t2 = t3;
            } else {
                t = t3;
            }
            z = !z;
            t2.fork();
        }
        if (t.getPendingCount() > 0) {
            E e = new E(8);
            AbstractC0050a abstractC0050a = t.a;
            InterfaceC0170y0 interfaceC0170y0E = abstractC0050a.E(abstractC0050a.t(spliterator), e);
            t.a.M(spliterator, interfaceC0170y0E);
            t.g = interfaceC0170y0E.build();
            t.b = null;
        }
        t.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        G0 g0 = this.g;
        if (g0 != null) {
            g0.forEach(this.e);
            this.g = null;
        } else {
            Spliterator spliterator = this.b;
            if (spliterator != null) {
                this.a.M(spliterator, this.e);
                this.b = null;
            }
        }
        T t = (T) this.d.remove(this);
        if (t != null) {
            t.tryComplete();
        }
    }

    public T(T t, Spliterator spliterator, T t2) {
        super(t);
        this.a = t.a;
        this.b = spliterator;
        this.c = t.c;
        this.d = t.d;
        this.e = t.e;
        this.f = t2;
    }
}
