package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpmt implements fdat {
    final /* synthetic */ dpmg a;

    public dpmt(dpmg dpmgVar) {
        this.a = dpmgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ViewParent parent = ((View) hmlVar.e(AndroidCompositionLocals_androidKt.f)).getParent();
            knm knmVar = parent instanceof knm ? (knm) parent : null;
            Window windowA = knmVar != null ? knmVar.a() : null;
            hmlVar.v(5004770);
            boolean zF = hmlVar.F(windowA);
            Object objF = hmlVar.f();
            if (zF || objF == hmk.a) {
                objF = new dpmn(windowA, null);
                hmlVar.y(objF);
            }
            hmlVar.o();
            hob.g(windowA, (fdat) objF, hmlVar);
            dpmw.b(hxe.d(-1303494789, new dpms(this.a), hmlVar), hmlVar, 48);
        }
        return fctx.a;
    }
}
