package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diho {
    public static final boolean a(boolean z, hml hmlVar) {
        hmlVar.v(-1962223493);
        boolean z2 = false;
        if (z && b(hmlVar)) {
            z2 = true;
        }
        hmlVar.o();
        return z2;
    }

    public static final boolean b(hml hmlVar) {
        hmlVar.v(1674911942);
        Object systemService = ((Context) hmlVar.e(AndroidCompositionLocals_androidKt.b)).getSystemService("accessibility");
        final AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        hmlVar.v(1849434622);
        Object objF = hmlVar.f();
        Object obj = hmk.a;
        if (objF == obj) {
            boolean z = false;
            if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                z = true;
            }
            Object hplVar = new hpl(Boolean.valueOf(z), hsi.a);
            hmlVar.y(hplVar);
            objF = hplVar;
        }
        final hox hoxVar = (hox) objF;
        hmlVar.o();
        hmlVar.v(-1633490746);
        boolean zF = hmlVar.F(accessibilityManager);
        Object objF2 = hmlVar.f();
        if (zF || objF2 == obj) {
            objF2 = new fdap() { // from class: dihl
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    ((hny) obj2).getClass();
                    final hox hoxVar2 = hoxVar;
                    final fdap fdapVar = new fdap() { // from class: dihj
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj3) {
                            Boolean bool = (Boolean) obj3;
                            bool.booleanValue();
                            hoxVar2.b(bool);
                            return fctx.a;
                        }
                    };
                    AccessibilityManager accessibilityManager2 = accessibilityManager;
                    if (accessibilityManager2 != null) {
                        accessibilityManager2.addAccessibilityStateChangeListener(new AccessibilityManager.AccessibilityStateChangeListener() { // from class: dihk
                            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                            public final void onAccessibilityStateChanged(boolean z2) {
                                fdapVar.invoke(Boolean.valueOf(z2));
                            }
                        });
                    }
                    return new dihm(accessibilityManager2, fdapVar);
                }
            };
            hmlVar.y(objF2);
        }
        hmlVar.o();
        hob.c(accessibilityManager, (fdap) objF2, hmlVar);
        boolean zBooleanValue = ((Boolean) hoxVar.a()).booleanValue();
        hmlVar.o();
        return zBooleanValue;
    }
}
