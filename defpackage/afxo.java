package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afxo {
    public static final void a(final afvt afvtVar, hml hmlVar, final int i) {
        int i2;
        egc egdVar;
        hmw hmwVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2711155);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(afvtVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ejy ejyVarA = ekb.a(0, hmlVarC, 3);
            List list = afvtVar.b;
            ics icsVarD = list.isEmpty() ? egq.d(ics.e, 1.0f) : egq.b(egq.d(ics.e, 1.0f), 1.0f);
            hmlVarC.v(1689557782);
            if (list.isEmpty()) {
                egdVar = new egd(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                kio kioVar = (kio) hmlVarC.e(jmh.e);
                egdVar = efy.h(0.0f, 0.0f, 0.0f, kioVar.el(ehv.f(hmlVarC).a(kioVar)), 7);
            }
            hmw hmwVar2 = (hmw) hmlVarC;
            hmwVar2.ab();
            hmlVarC.v(1689566173);
            if (afvtVar.d.a) {
                icsVarD = icsVarD.a(dkl.a(ics.e, glz.a(hmlVarC).F, ikj.a));
            }
            hmwVar2.ab();
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            Object objS = hmwVar2.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new fdap() { // from class: afwy
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        eio eioVar = (eio) obj;
                        eioVar.getClass();
                        afvt afvtVar2 = afvtVar;
                        List list2 = afvtVar2.b;
                        if (!list2.isEmpty()) {
                            ejk.a(eioVar, afvtVar2.a, afve.a, 2);
                        }
                        if (afvtVar2.d.a) {
                            eioVar.a(list2.size(), new afxl(new fdat() { // from class: afww
                                @Override // defpackage.fdat
                                public final Object a(Object obj2, Object obj3) {
                                    ((Integer) obj2).intValue();
                                    afwv afwvVar = (afwv) obj3;
                                    afwvVar.getClass();
                                    return afwvVar.b();
                                }
                            }, list2), new afxm(list2), new hxd(2039820996, true, new afxn(list2, afvtVar2)));
                        } else {
                            eioVar.a(list2.size(), new afxi(new fdap() { // from class: afwx
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj2) {
                                    afwv afwvVar = (afwv) obj2;
                                    afwvVar.getClass();
                                    return afwvVar.b();
                                }
                            }, list2), new afxj(list2), new hxd(802480018, true, new afxk(list2)));
                        }
                        return fctx.a;
                    }
                };
                hmwVar2.af(objS);
            }
            hmwVar2.ab();
            boolean z = true;
            eig.a(icsVarD, ejyVarA, egdVar, false, null, null, null, false, null, (fdap) objS, hmlVarC, 0, 504);
            String str = afvtVar.a;
            hmlVarC.v(-1633490746);
            if (i4 != 4) {
                z = false;
            }
            boolean zD = z | hmlVarC.D(ejyVarA);
            Object objS2 = hmwVar2.S();
            if (zD || objS2 == hmk.a) {
                objS2 = new afxh(afvtVar, ejyVarA, null);
                hmwVar = hmwVar2;
                hmwVar.af(objS2);
            } else {
                hmwVar = hmwVar2;
            }
            hmwVar.ab();
            hob.g(str, (fdat) objS2, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: afwz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    afxo.a(afvtVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
