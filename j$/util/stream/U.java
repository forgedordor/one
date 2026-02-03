package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes9.dex */
public final class U extends CountedCompleter {
    public Spliterator a;
    public final InterfaceC0128p2 b;
    public final AbstractC0050a c;
    public long d;

    public U(AbstractC0050a abstractC0050a, Spliterator spliterator, InterfaceC0128p2 interfaceC0128p2) {
        super(null);
        this.b = interfaceC0128p2;
        this.c = abstractC0050a;
        this.a = spliterator;
        this.d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.d;
        if (jE == 0) {
            jE = AbstractC0065d.e(jEstimateSize);
            this.d = jE;
        }
        boolean zX = EnumC0094i3.SHORT_CIRCUIT.x(this.c.f);
        InterfaceC0128p2 interfaceC0128p2 = this.b;
        boolean z = false;
        U u = this;
        while (true) {
            if (zX && interfaceC0128p2.q()) {
                break;
            }
            if (jEstimateSize <= jE || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            U u2 = new U(u, spliteratorTrySplit);
            u.addToPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
            } else {
                U u3 = u;
                u = u2;
                u2 = u3;
            }
            z = !z;
            u.fork();
            u = u2;
            jEstimateSize = spliterator.estimateSize();
        }
        u.c.h(spliterator, interfaceC0128p2);
        u.a = null;
        u.propagateCompletion();
    }

    public U(U u, Spliterator spliterator) {
        super(u);
        this.a = spliterator;
        this.b = u.b;
        this.d = u.d;
        this.c = u.c;
    }
}
