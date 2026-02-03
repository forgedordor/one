package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wcp {
    public static final wcg a(hsf hsfVar) {
        return (wcg) hsfVar.a();
    }

    public static final void b(final djrr djrrVar, fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        final fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-615835388);
        if (i3 == 0) {
            i2 = (true != hmlVarC.B(djrrVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
        } else {
            fdaeVar2 = fdaeVar;
            dtfk.b(fdaeVar2, null, false, null, null, hxe.d(-1581196510, new wco(djrrVar), hmlVarC), hmlVarC, ((i2 >> 3) & 14) | 1572864, 62);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: wch
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djrr djrrVar2 = djrrVar;
                    int i4 = i;
                    wcp.b(djrrVar2, fdaeVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final dpme dpmeVar, ics icsVar, final wel welVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2 = icsVar;
        int i3 = i & 48;
        hml hmlVarC = hmlVar.c(-1966014864);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar2) ? 16 : 32) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? hmlVarC.D(welVar) : hmlVarC.F(welVar)) ? 128 : 256;
        }
        if ((i2 & 145) == 144 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hsf hsfVarA = hro.a(welVar.a, hmlVarC);
            final View view = (View) hmlVarC.e(AndroidCompositionLocals_androidKt.f);
            final dpir dpirVar = (dpir) hmlVarC.e(dpjg.a);
            int i4 = adc.a;
            icsVar2 = icsVar;
            dtct.a(hxe.d(1338311732, new wck(hsfVarA), hmlVarC), icsVar2, hxe.d(-386530506, new wcm(adc.a(hmlVarC), hsfVarA), hmlVarC), hxe.d(455404127, new wcn(hsfVarA), hmlVarC), 0.0f, null, dtil.b(ije.g, 0L, glz.a(hmlVarC).q, glz.a(hmlVarC).q, glz.a(hmlVarC).q, hmlVarC, 18), null, hmlVarC, (i2 & 112) | 3462, 176);
            boolean z = (dpirVar != null ? dpirVar.f() : null) == dpjd.a;
            hmlVarC.v(-1633490746);
            boolean zF = hmlVarC.F(dpirVar) | hmlVarC.F(view);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdae() { // from class: wci
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dpir dpirVar2 = dpirVar;
                        if (dpirVar2 != null) {
                            dpirVar2.g(view, false);
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            acx.a(z, (fdae) objS, hmlVarC, 0, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: wcj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dpme dpmeVar2 = dpmeVar;
                    ics icsVar3 = icsVar2;
                    int i5 = i;
                    wcp.c(dpmeVar2, icsVar3, welVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
