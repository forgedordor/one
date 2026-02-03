package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes9.dex */
public final class e4 extends AbstractC0055b {
    public final AbstractC0050a j;
    public final IntFunction k;
    public final boolean l;
    public long m;
    public boolean n;
    public volatile boolean o;

    public e4(AbstractC0050a abstractC0050a, AbstractC0050a abstractC0050a2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC0050a2, spliterator);
        this.j = abstractC0050a;
        this.k = intFunction;
        this.l = EnumC0094i3.ORDERED.x(abstractC0050a2.f);
    }

    @Override // j$.util.stream.AbstractC0065d
    public final Object a() {
        InterfaceC0170y0 interfaceC0170y0E = this.a.E(-1L, this.k);
        InterfaceC0128p2 interfaceC0128p2I = this.j.I(this.a.f, interfaceC0170y0E);
        AbstractC0050a abstractC0050a = this.a;
        boolean zI = abstractC0050a.i(this.b, abstractC0050a.N(interfaceC0128p2I));
        this.n = zI;
        if (zI) {
            g();
        }
        G0 g0Build = interfaceC0170y0E.build();
        this.m = g0Build.count();
        return g0Build;
    }

    @Override // j$.util.stream.AbstractC0065d
    public final AbstractC0065d c(Spliterator spliterator) {
        return new e4(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0055b
    public final void f() {
        this.i = true;
        if (this.l && this.o) {
            d(AbstractC0171y1.E(this.j.D()));
        }
    }

    @Override // j$.util.stream.AbstractC0055b
    public final Object h() {
        return AbstractC0171y1.E(this.j.D());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // j$.util.stream.AbstractC0065d, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r9) {
        /*
            r8 = this;
            j$.util.stream.d r0 = r8.d
            if (r0 != 0) goto L6
            goto L8b
        L6:
            j$.util.stream.e4 r0 = (j$.util.stream.e4) r0
            boolean r0 = r0.n
            j$.util.stream.d r1 = r8.e
            j$.util.stream.e4 r1 = (j$.util.stream.e4) r1
            boolean r1 = r1.n
            r0 = r0 | r1
            r8.n = r0
            boolean r0 = r8.l
            r1 = 0
            if (r0 == 0) goto L2a
            boolean r0 = r8.i
            if (r0 == 0) goto L2a
            r8.m = r1
            j$.util.stream.a r0 = r8.j
            j$.util.stream.j3 r0 = r0.D()
            j$.util.stream.Z0 r0 = j$.util.stream.AbstractC0171y1.E(r0)
            goto L88
        L2a:
            boolean r0 = r8.l
            if (r0 == 0) goto L41
            j$.util.stream.d r0 = r8.d
            j$.util.stream.e4 r0 = (j$.util.stream.e4) r0
            boolean r3 = r0.n
            if (r3 == 0) goto L41
            long r1 = r0.m
            r8.m = r1
            java.lang.Object r0 = r0.i()
            j$.util.stream.G0 r0 = (j$.util.stream.G0) r0
            goto L88
        L41:
            j$.util.stream.d r0 = r8.d
            j$.util.stream.e4 r0 = (j$.util.stream.e4) r0
            long r3 = r0.m
            j$.util.stream.d r5 = r8.e
            j$.util.stream.e4 r5 = (j$.util.stream.e4) r5
            long r6 = r5.m
            long r3 = r3 + r6
            r8.m = r3
            long r3 = r0.m
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 != 0) goto L5d
            java.lang.Object r0 = r5.i()
            j$.util.stream.G0 r0 = (j$.util.stream.G0) r0
            goto L88
        L5d:
            long r3 = r5.m
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L6a
            java.lang.Object r0 = r0.i()
            j$.util.stream.G0 r0 = (j$.util.stream.G0) r0
            goto L88
        L6a:
            j$.util.stream.a r0 = r8.j
            j$.util.stream.j3 r0 = r0.D()
            j$.util.stream.d r1 = r8.d
            j$.util.stream.e4 r1 = (j$.util.stream.e4) r1
            java.lang.Object r1 = r1.i()
            j$.util.stream.G0 r1 = (j$.util.stream.G0) r1
            j$.util.stream.d r2 = r8.e
            j$.util.stream.e4 r2 = (j$.util.stream.e4) r2
            java.lang.Object r2 = r2.i()
            j$.util.stream.G0 r2 = (j$.util.stream.G0) r2
            j$.util.stream.I0 r0 = j$.util.stream.AbstractC0171y1.C(r0, r1, r2)
        L88:
            r8.d(r0)
        L8b:
            r0 = 1
            r8.o = r0
            super.onCompletion(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.e4.onCompletion(java.util.concurrent.CountedCompleter):void");
    }

    public e4(e4 e4Var, Spliterator spliterator) {
        super(e4Var, spliterator);
        this.j = e4Var.j;
        this.k = e4Var.k;
        this.l = e4Var.l;
    }
}
