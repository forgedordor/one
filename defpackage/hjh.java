package defpackage;

import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjh implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final hox a = new hpl(false, hsi.a);

    public final void a(boolean z) {
        this.a.b(Boolean.valueOf(z));
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        a(z);
    }
}
