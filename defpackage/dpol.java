package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpol {
    public static final void a(final boolean z, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-652192402);
        if (i3 == 0) {
            i2 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            View view = (View) hmlVarC.e(AndroidCompositionLocals_androidKt.f);
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(view);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                ViewParent parent = view.getParent();
                knm knmVar = parent instanceof knm ? (knm) parent : null;
                Window windowA = knmVar != null ? knmVar.a() : null;
                objS = windowA != null ? new lhb(windowA, view) : null;
                hmwVar.af(objS);
            }
            final lhb lhbVar = (lhb) objS;
            hmwVar.ab();
            if (lhbVar == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: dpoc
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i4 = i;
                            dpol.a(z, (hml) obj, hpy.a(i4 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            hmlVarC.v(-1633490746);
            boolean zF = hmlVarC.F(lhbVar) | ((i2 & 14) == 4);
            Object objS2 = hmwVar.S();
            if (zF || objS2 == hmk.a) {
                objS2 = new dpoj(z, lhbVar, null);
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            hob.g(boolValueOf, (fdat) objS2, hmlVarC);
            fctx fctxVar = fctx.a;
            hmlVarC.v(5004770);
            boolean zF2 = hmlVarC.F(lhbVar);
            Object objS3 = hmwVar.S();
            if (zF2 || objS3 == hmk.a) {
                objS3 = new fdap() { // from class: dpod
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((hny) obj).getClass();
                        lhb lhbVar2 = lhbVar;
                        boolean zD2 = lhbVar2.d();
                        boolean zC = lhbVar2.c();
                        lhbVar2.b(false);
                        lhbVar2.a(false);
                        return new dpok(lhbVar2, zD2, zC);
                    }
                };
                hmwVar.af(objS3);
            }
            hmwVar.ab();
            hob.c(fctxVar, (fdap) objS3, hmlVarC);
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: dpoe
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dpol.a(z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dpmg dpmgVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1625947891);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dpmgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        byte[] bArr = null;
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(null) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dpos dposVar = dpmgVar.b;
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new dfw(true);
                hmwVar.af(objS);
            }
            dfw dfwVar = (dfw) objS;
            hmwVar.ab();
            hmlVarC.v(-1633490746);
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            boolean z2 = (i2 & 112) == 32;
            Object objS2 = hmwVar.S();
            if ((z2 | z) || objS2 == obj) {
                fcww fcwwVar = new fcww(7);
                fcwwVar.add(new dpmz(bArr));
                fcwwVar.add(new dpnb(bArr));
                fcwwVar.add(new dpnd(bArr));
                fcwwVar.add(new dpnk(bArr));
                fcwwVar.add(new dpng(bArr));
                fcwwVar.add(new dpno(bArr));
                objS2 = new dpnr(fcva.a(fcwwVar), dfwVar);
                hmwVar.af(objS2);
            }
            dpnr dpnrVar = (dpnr) objS2;
            hmwVar.ab();
            fctx fctxVar = fctx.a;
            hmlVarC.v(5004770);
            Object objS3 = hmwVar.S();
            if (i4 == 4 || objS3 == obj) {
                objS3 = new dpof(dpmgVar, null);
                hmwVar.af(objS3);
            }
            hmwVar.ab();
            hob.g(fctxVar, (fdat) objS3, hmlVarC);
            gvk.c(dposVar.a, null, glz.a(hmlVarC).p, 0L, 0.0f, 0.0f, null, hxe.d(-1649688242, new dpoi(dpnrVar, dpmgVar), hmlVarC), hmlVarC, 122);
            a(!((Boolean) dfwVar.b()).booleanValue(), hmlVarC, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpob
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int i5 = i;
                    dpol.b(dpmgVar, (hml) obj2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
