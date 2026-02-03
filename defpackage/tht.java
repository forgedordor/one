package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tht {
    public static final void a(final tin tinVar, final ftn ftnVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(618433333);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(tinVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(ftnVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ejy ejyVarA = ekb.a(0, hmlVarC, 3);
            hmlVarC.v(-1633490746);
            boolean z = (i2 & 14) == 4;
            boolean z2 = (i2 & 112) == 32;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if ((z2 | z) || objS == hmk.a) {
                objS = new fdap() { // from class: thf
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        eio eioVar = (eio) obj;
                        eioVar.getClass();
                        List list = tinVar.a;
                        eioVar.a(list.size(), null, new thr(list), new hxd(802480018, true, new ths(list, ftnVar)));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            boolean z3 = z;
            eig.a(null, ejyVarA, null, false, null, null, null, false, null, (fdap) objS, hmlVarC, 0, 509);
            if (tinVar.b) {
                hmlVarC.v(-1633490746);
                boolean zD = hmlVarC.D(ejyVarA) | z3;
                Object objS2 = hmwVar.S();
                if (zD || objS2 == hmk.a) {
                    objS2 = new thq(ejyVarA, tinVar, null);
                    hmwVar.af(objS2);
                }
                hmwVar.ab();
                hob.g(ejyVarA, (fdat) objS2, hmlVarC);
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: thg
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    tin tinVar2 = tinVar;
                    int i4 = i;
                    tht.a(tinVar2, ftnVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final tio tioVar, final ftn ftnVar, hml hmlVar, final int i) {
        int i2;
        tioVar.getClass();
        ftnVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1169255637);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(tioVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(ftnVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else if (tioVar instanceof tin) {
            a((tin) tioVar, ftnVar, hmlVarC, i2 & 112);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: thh
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    tio tioVar2 = tioVar;
                    int i4 = i;
                    tht.b(tioVar2, ftnVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
