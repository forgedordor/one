package defpackage;

import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wdo implements fdaw {
    final /* synthetic */ wdq a;

    public wdo(wdq wdqVar) {
        this.a = wdqVar;
    }

    @Override // defpackage.fdaw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zD;
        dplv dplvVar = (dplv) obj;
        ics icsVar = (ics) obj2;
        wel welVar = (wel) obj3;
        hml hmlVar = (hml) obj4;
        int iIntValue = ((Number) obj5).intValue();
        dplvVar.getClass();
        icsVar.getClass();
        welVar.getClass();
        View view = (View) hmlVar.e(AndroidCompositionLocals_androidKt.f);
        hpt hptVar = dpjg.a;
        dpir dpirVar = (dpir) hmlVar.e(hptVar);
        hmlVar.v(998292142);
        ics icsVarE = dplvVar.e(icsVar, hmlVar);
        hmlVar.v(998276057);
        boolean z = false;
        boolean z2 = (wem.a(welVar, hmlVar) && this.a.l(welVar, hmlVar)) ? false : true;
        hmlVar.o();
        if (z2) {
            icsVarE = icsVarE.a(efy.j(ics.e, 0.0f, 0.0f, 0.0f, 10.0f, 7));
        }
        if (((eoth) ((arlm) this.a.a).a.b()).a("bugle.infer_keyboard_opening_from_insets_in_direct_send")) {
            hmlVar.v(882330902);
            zD = dpip.d(hmlVar);
            hmlVar.o();
        } else {
            hmlVar.v(882395692);
            hmlVar.v(1163809961);
            dpir dpirVar2 = (dpir) hmlVar.e(hptVar);
            if (dpirVar2 != null && dpip.c(dpirVar2)) {
                z = true;
            }
            hmlVar.o();
            hmlVar.o();
            zD = z;
        }
        if (zD) {
            ico icoVar = ics.e;
            fctx fctxVar = fctx.a;
            hmlVar.v(-1633490746);
            boolean zF = hmlVar.F(dpirVar) | hmlVar.F(view);
            Object objF = hmlVar.f();
            if (zF || objF == hmk.a) {
                objF = new wdn(dpirVar, view);
                hmlVar.y(objF);
            }
            hmlVar.o();
            icsVarE = icsVarE.a(itf.a(icoVar, fctxVar, (PointerInputEventHandler) objF));
        }
        hmlVar.o();
        wbi.b(dplvVar, icsVarE, welVar, hmlVar, (iIntValue & 896) | (iIntValue & 14) | 512);
        return fctx.a;
    }
}
