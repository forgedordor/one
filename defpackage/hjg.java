package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjg implements AccessibilityManager$AccessibilityServicesStateChangeListener {
    public final hox a;
    public final hox b;

    public hjg() {
        hsi hsiVar = hsi.a;
        this.a = new hpl(false, hsiVar);
        this.b = new hpl(false, hsiVar);
    }

    public final void a(boolean z) {
        this.a.b(Boolean.valueOf(z));
    }

    public final void b(boolean z) {
        this.b.b(Boolean.valueOf(z));
    }

    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        a(hji.c(accessibilityManager));
        b(hji.d(accessibilityManager));
    }
}
