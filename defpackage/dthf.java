package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dthf {
    public static final void a(final boolean z, final fdap fdapVar, ics icsVar, final boolean z2, gvu gvuVar, hml hmlVar, final int i) {
        int i2;
        fdap fdapVar2;
        ics icsVar2;
        gvu gvuVar2;
        final ics icsVar3;
        final gvu gvuVar3;
        hml hmlVarC = hmlVar.c(-789572113);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            fdapVar2 = fdapVar;
            i2 |= true != hmlVarC.F(fdapVar2) ? 16 : 32;
        } else {
            fdapVar2 = fdapVar;
        }
        int i3 = i2 | 3456;
        if ((i & 24576) == 0) {
            i3 |= true != hmlVarC.E(z2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        int i4 = i3 | 1572864;
        if ((599187 & i4) == 599186 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar3 = icsVar;
            gvuVar3 = gvuVar;
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                ico icoVar = ics.e;
                hmlVarC.v(640814011);
                long jC = dtdu.c(10, hmlVarC);
                long jC2 = dtdu.c(26, hmlVarC);
                long j = ije.g;
                long jC3 = dtdu.c(11, hmlVarC);
                long jC4 = dtdu.c(24, hmlVarC);
                long jC5 = dtdu.c(39, hmlVarC);
                long jC6 = dtdu.c(24, hmlVarC);
                long jC7 = dtdu.c(39, hmlVarC);
                long jC8 = dtdu.c(35, hmlVarC);
                long jH = ijg.h(ijg.f(ije.d(jC8), ije.c(jC8), ije.b(jC8), 1.0f, ije.f(jC8)), glz.a(hmlVarC).p);
                long jC9 = dtdu.c(18, hmlVarC);
                long jH2 = ijg.h(ijg.f(ije.d(jC9), ije.c(jC9), ije.b(jC9), 0.12f, ije.f(jC9)), glz.a(hmlVarC).p);
                long jC10 = dtdu.c(18, hmlVarC);
                long jH3 = ijg.h(ijg.f(ije.d(jC10), ije.c(jC10), ije.b(jC10), 0.38f, ije.f(jC10)), glz.a(hmlVarC).p);
                long jC11 = dtdu.c(18, hmlVarC);
                long jH4 = ijg.h(ijg.f(ije.d(jC11), ije.c(jC11), ije.b(jC11), 0.38f, ije.f(jC11)), glz.a(hmlVarC).p);
                long jC12 = dtdu.c(39, hmlVarC);
                long jH5 = ijg.h(ijg.f(ije.d(jC12), ije.c(jC12), ije.b(jC12), 0.12f, ije.f(jC12)), glz.a(hmlVarC).p);
                long jC13 = dtdu.c(18, hmlVarC);
                long jH6 = ijg.h(ijg.f(ije.d(jC13), ije.c(jC13), ije.b(jC13), 0.12f, ije.f(jC13)), glz.a(hmlVarC).p);
                long jC14 = dtdu.c(39, hmlVarC);
                gvu gvuVar4 = new gvu(jC, jC2, j, jC3, jC4, jC5, jC6, jC7, jH, jH2, j, jH3, jH4, jH5, jH6, ijg.h(ijg.f(ije.d(jC14), ije.c(jC14), ije.b(jC14), 0.38f, ije.f(jC14)), glz.a(hmlVarC).p));
                ((hmw) hmlVarC).ab();
                icsVar2 = icoVar;
                gvuVar2 = gvuVar4;
            } else {
                hmlVarC.s();
                icsVar2 = icsVar;
                gvuVar2 = gvuVar;
            }
            hmlVarC.l();
            gvx.a(z, fdapVar2, icsVar2, z2, gvuVar2, hmlVarC, i4 & 3735550);
            icsVar3 = icsVar2;
            gvuVar3 = gvuVar2;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dthe
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    boolean z3 = z;
                    fdap fdapVar3 = fdapVar;
                    ics icsVar4 = icsVar3;
                    int i5 = i;
                    dthf.a(z3, fdapVar3, icsVar4, z2, gvuVar3, hmlVar2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
