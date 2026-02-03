package defpackage;

import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dihb implements hnx {
    final /* synthetic */ AccessibilityManager a;
    final /* synthetic */ fdap b;

    public dihb(AccessibilityManager accessibilityManager, fdap fdapVar) {
        this.a = accessibilityManager;
        this.b = fdapVar;
    }

    @Override // defpackage.hnx
    public final void a() {
        AccessibilityManager accessibilityManager = this.a;
        if (accessibilityManager != null) {
            final fdap fdapVar = this.b;
            accessibilityManager.removeAccessibilityStateChangeListener(new AccessibilityManager.AccessibilityStateChangeListener() { // from class: dihc
                @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                public final /* synthetic */ void onAccessibilityStateChanged(boolean z) {
                    fdapVar.invoke(Boolean.valueOf(z));
                }
            });
        }
    }
}
