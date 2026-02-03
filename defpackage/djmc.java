package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djmc implements fdat {
    final /* synthetic */ boolean a;
    final /* synthetic */ ics b;
    final /* synthetic */ fdau c;

    public djmc(boolean z, ics icsVar, fdau fdauVar) {
        this.a = z;
        this.b = icsVar;
        this.c = fdauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Window windowA;
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(1985221482);
            if (this.a) {
                ViewParent parent = ((View) hmlVar.e(AndroidCompositionLocals_androidKt.f)).getParent();
                knm knmVar = parent instanceof knm ? (knm) parent : null;
                if (knmVar != null && (windowA = knmVar.a()) != null) {
                    windowA.setDimAmount(1.0f);
                }
            }
            hmlVar.o();
            gvk.c(this.b, dtcj.c(hmlVar), dtcj.a(hmlVar), 0L, 6.0f, 0.0f, null, hxe.d(-419454138, new djmb(this.c), hmlVar), hmlVar, 104);
        }
        return fctx.a;
    }
}
