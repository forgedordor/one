package defpackage;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwdo implements fdat {
    final /* synthetic */ cwem a;

    public cwdo(cwem cwemVar) {
        this.a = cwemVar;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            cwem cwemVar = this.a;
            cwfq cwfqVar = cwemVar.f;
            boolean z = (cwfqVar != null ? cwfqVar.e : null) == cwhe.c;
            ViewParent parent = ((View) hmlVar.e(AndroidCompositionLocals_androidKt.f)).getParent();
            parent.getClass();
            knm knmVar = (knm) parent;
            hmlVar.v(1849434622);
            Object objF = hmlVar.f();
            Object obj3 = hmk.a;
            if (objF == obj3) {
                hpl hplVar = new hpl(Float.valueOf(0.0f), hsi.a);
                hmlVar.y(hplVar);
                objF = hplVar;
            }
            hox hoxVar = (hox) objF;
            hmlVar.o();
            Boolean boolValueOf = Boolean.valueOf(z);
            hmlVar.v(-1746271574);
            boolean zE = hmlVar.E(z) | hmlVar.F(knmVar);
            Object objF2 = hmlVar.f();
            if (zE || objF2 == obj3) {
                objF2 = new cwdn(z, hoxVar, knmVar, null);
                hmlVar.y(objF2);
            }
            hmlVar.o();
            hob.g(boolValueOf, (fdat) objF2, hmlVar);
            cweb.b(cwemVar, cwemVar.d, cwemVar.c == cwen.c, hmlVar, 0);
        }
        return fctx.a;
    }
}
