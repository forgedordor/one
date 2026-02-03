package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes9.dex */
public final class d4 extends AbstractC0065d {
    public final AbstractC0050a h;
    public final IntFunction i;
    public final boolean j;
    public long k;
    public long l;

    public d4(AbstractC0050a abstractC0050a, AbstractC0050a abstractC0050a2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC0050a2, spliterator);
        this.h = abstractC0050a;
        this.i = intFunction;
        this.j = EnumC0094i3.ORDERED.x(abstractC0050a2.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // j$.util.stream.AbstractC0065d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a() {
        /*
            r5 = this;
            boolean r0 = r5.b()
            if (r0 != 0) goto L1c
            boolean r1 = r5.j
            if (r1 == 0) goto L1c
            j$.util.stream.i3 r1 = j$.util.stream.EnumC0094i3.SIZED
            j$.util.stream.a r2 = r5.h
            int r3 = r2.c
            int r1 = r1.e
            r3 = r3 & r1
            if (r3 != r1) goto L1c
            j$.util.Spliterator r1 = r5.b
            long r1 = r2.t(r1)
            goto L1e
        L1c:
            r1 = -1
        L1e:
            j$.util.stream.a r3 = r5.a
            java.util.function.IntFunction r4 = r5.i
            j$.util.stream.y0 r1 = r3.E(r1, r4)
            j$.util.stream.a r2 = r5.h
            j$.util.stream.b4 r2 = (j$.util.stream.b4) r2
            boolean r3 = r5.j
            if (r3 == 0) goto L32
            if (r0 != 0) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            j$.util.stream.c4 r0 = r2.g(r1, r0)
            j$.util.stream.a r2 = r5.a
            j$.util.Spliterator r3 = r5.b
            r2.M(r3, r0)
            j$.util.stream.G0 r1 = r1.build()
            long r2 = r1.count()
            r5.k = r2
            long r2 = r0.s()
            r5.l = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.d4.a():java.lang.Object");
    }

    @Override // j$.util.stream.AbstractC0065d
    public final AbstractC0065d c(Spliterator spliterator) {
        return new d4(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0065d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0065d abstractC0065d = this.d;
        if (abstractC0065d != null) {
            if (this.j) {
                d4 d4Var = (d4) abstractC0065d;
                long j = d4Var.l;
                this.l = j;
                if (j == d4Var.k) {
                    this.l = j + ((d4) this.e).l;
                }
            }
            d4 d4Var2 = (d4) abstractC0065d;
            long j2 = d4Var2.k;
            d4 d4Var3 = (d4) this.e;
            this.k = j2 + d4Var3.k;
            G0 g0C = d4Var2.k == 0 ? (G0) d4Var3.f : d4Var3.k == 0 ? (G0) d4Var2.f : AbstractC0171y1.C(this.h.D(), (G0) ((d4) this.d).f, (G0) ((d4) this.e).f);
            if (b() && this.j) {
                g0C = g0C.e(this.l, g0C.count(), this.i);
            }
            this.f = g0C;
        }
        super.onCompletion(countedCompleter);
    }

    public d4(d4 d4Var, Spliterator spliterator) {
        super(d4Var, spliterator);
        this.h = d4Var.h;
        this.i = d4Var.i;
        this.j = d4Var.j;
    }
}
