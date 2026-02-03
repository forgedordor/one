package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evv {
    public static final void a(final ics icsVar, hml hmlVar, final int i, final int i2) {
        int i3;
        hml hmlVarC = hmlVar.c(694251107);
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if (hmlVarC.J((i3 & 3) != 2, 1 & i3)) {
            if (i2 != 0) {
                icsVar = ics.e;
            }
            egt.a(icj.g(egq.m(icsVar, 20.710678f, 25.0f), evu.a), hmlVarC);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: evo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    evv.a(icsVar, (hml) obj, hpy.a(i4 | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final fih fihVar, final ics icsVar, long j, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(1776202187);
        boolean z = true;
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(fihVar) : hmlVarC.F(fihVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if (hmlVarC.J((i2 & 147) != 146, i2 & 1)) {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                j = 9205357640488583168L;
            } else {
                hmlVarC.s();
            }
            hmlVarC.l();
            int i3 = i2 & 14;
            if (i3 != 4 && ((i2 & 8) == 0 || !hmlVarC.F(fihVar))) {
                z = false;
            }
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (z || objS == hmk.a) {
                objS = new fdap() { // from class: evp
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((jto) obj).e(fjy.a, new fjx(ezl.a, fihVar.a(), 2, true));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            fhv.b(fihVar, ibw.b, hxe.d(-1653527038, new evr(j, jsh.c(icsVar, false, (fdap) objS)), hmlVarC), hmlVarC, i3 | 432);
        } else {
            hmlVarC.s();
        }
        final long j2 = j;
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: evq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fih fihVar2 = fihVar;
                    ics icsVar2 = icsVar;
                    evv.c(fihVar2, icsVar2, j2, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
