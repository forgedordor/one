package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adlw {
    public static final void a(final adlg adlgVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1676042989);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.F(adlgVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ico icoVar = ics.e;
            ics icsVarC = egq.c(icoVar, 1.0f);
            ibx ibxVar = ibw.k;
            ecq ecqVar = ecr.c;
            ixm ixmVarA = edl.a(ecqVar, ibxVar, hmlVarC, 48);
            int iA = adlh.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarC);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar4);
            e(adlgVar.d, hmlVarC, 0);
            egt.a(egq.e(icoVar, 16.0f), hmlVarC);
            dthx.b(String.valueOf(adlgVar.e), egq.d(icoVar, 1.0f), glz.a(hmlVarC).a, 0L, null, null, 0L, new khk(3), 0L, 2, false, 1, 0, null, null, hmlVarC, 48, 3120, 120312);
            egt.a(egq.e(icoVar, 128.0f), hmlVarC);
            ixm ixmVarA2 = edl.a(ecqVar, ibxVar, hmlVarC, 48);
            int iA2 = adlh.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icoVar);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA2, fdatVar);
            hsk.b(hmlVarC, hxiVarAk2, fdatVar2);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB2, fdatVar4);
            hmlVarC.v(1849434622);
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new fdae() { // from class: adlp
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            egc egcVar = dtdc.a;
            dtdi.d((fdae) objS, null, false, null, dtdc.e(0L, ije.e, hmlVarC, 13), null, null, adku.d, hmlVarC, 805306374, 494);
            String strC = jqu.c(R.string.expiry_info, new Object[]{30}, hmlVarC);
            jyq jyqVar = glz.d(hmlVarC).l;
            long j = glz.a(hmlVarC).q;
            hmlVar2 = hmlVarC;
            dthx.b(strC, null, ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.6f, ije.f(j)), 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, jyqVar, hmlVar2, 0, 3120, 55290);
            hmlVar2.n();
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: adlq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    adlw.a(adlgVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015 A[PHI: r11
      0x0015: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:3:0x0007, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.hml r10, final int r11) {
        /*
            r0 = -1151604162(0xffffffffbb5bea3e, float:-0.0033556367)
            hml r7 = r10.c(r0)
            if (r11 != 0) goto L15
            boolean r10 = r7.I()
            r11 = 0
            if (r10 != 0) goto L11
            goto L15
        L11:
            r7.s()
            goto L42
        L15:
            r10 = 1849434622(0x6e3c21fe, float:1.4556069E28)
            r7.v(r10)
            r10 = r7
            hmw r10 = (defpackage.hmw) r10
            java.lang.Object r0 = r10.S()
            java.lang.Object r1 = defpackage.hmk.a
            if (r0 != r1) goto L2e
            adlj r0 = new adlj
            r0.<init>()
            r10.af(r0)
        L2e:
            r1 = r0
            fdae r1 = (defpackage.fdae) r1
            r10.ab()
            fdat r6 = defpackage.adku.e
            r8 = 1572870(0x180006, float:2.20406E-39)
            r9 = 62
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            defpackage.dtfk.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L42:
            hpx r10 = r7.L()
            if (r10 == 0) goto L4f
            adlk r0 = new adlk
            r0.<init>()
            r10.d = r0
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adlw.b(hml, int):void");
    }

    public static final void c(final adlg adlgVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(404880728);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(adlgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarD = egq.d(icoVar, 1.0f);
            ixm ixmVarA = ecz.a(ibw.e, false);
            int iA = adlh.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarD);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            dtdn.a(egq.e(egq.o(icoVar, 228.0f), 228.0f), evn.b(16.0f), null, null, null, hxe.d(-1774530480, new adls(adlgVar), hmlVarC), hmlVarC, 196614, 28);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: adlo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    adlw.c(adlgVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final fdpl fdplVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(-683220617);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.F(fdplVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dpn dpnVarA = dpc.a(0, hmlVarC, 6, 0);
            adlg adlgVar = (adlg) hsb.b(fdplVar, null, null, hmlVarC, 2).a();
            if (adlgVar == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: adll
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i3 = i;
                            adlw.d(fdplVar, (hml) obj, hpy.a(i3 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            boolean zBooleanValue = ((Boolean) hsb.b(adlgVar.f, false, null, hmlVarC, 2).a()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) hsb.b(adlgVar.g, false, null, hmlVarC, 2).a()).booleanValue();
            ics icsVarA = dkl.a(egq.c(ics.e, 1.0f), glz.a(hmlVarC).F, ikj.a);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new fdap() { // from class: adlm
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        jtoVar.getClass();
                        jtl.a(jtoVar);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            dtgq.a(jsh.c(icsVarA, false, (fdap) objS), adku.c, null, null, null, 0, 0L, 0L, new eee(), hxe.d(-2075999544, new adlu(dpnVarA, adlgVar, zBooleanValue, zBooleanValue2), hmlVarC), hmlVarC, 805306416, 252);
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: adln
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i3 = i;
                    adlw.d(fdplVar, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final List list, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1667281278);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dtdn.a(null, null, dtdj.b(glz.a(hmlVarC).D, 0L, hmlVarC, 14), null, null, hxe.d(1727258864, new adlv(list), hmlVarC), hmlVarC, 196608, 27);
            hmlVarC = hmlVarC;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: adli
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    adlw.e(list, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
