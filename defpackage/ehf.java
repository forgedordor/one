package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehf {
    public static final ehg b(hml hmlVar) {
        final ehg ehgVar;
        final View view = (View) hmlVar.e(AndroidCompositionLocals_androidKt.f);
        WeakHashMap weakHashMap = ehg.a;
        synchronized (weakHashMap) {
            Object ehgVar2 = weakHashMap.get(view);
            if (ehgVar2 == null) {
                ehgVar2 = new ehg(view);
                weakHashMap.put(view, ehgVar2);
            }
            ehgVar = (ehg) ehgVar2;
        }
        boolean zF = hmlVar.F(ehgVar) | hmlVar.F(view);
        Object objF = hmlVar.f();
        if (zF || objF == hmk.a) {
            objF = new fdap() { // from class: ehd
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ehg ehgVar3 = ehgVar;
                    View view2 = view;
                    if (ehgVar3.i == 0) {
                        efg efgVar = ehgVar3.j;
                        int[] iArr = ley.a;
                        len.k(view2, efgVar);
                        if (view2.isAttachedToWindow()) {
                            view2.requestApplyInsets();
                        }
                        view2.addOnAttachStateChangeListener(efgVar);
                        lgb.d(view2, efgVar);
                    }
                    ehgVar3.i++;
                    return new ehe(ehgVar3, view2);
                }
            };
            hmlVar.y(objF);
        }
        hob.c(ehgVar, (fdap) objF, hmlVar);
        return ehgVar;
    }
}
