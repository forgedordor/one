package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jii implements View.OnAttachStateChangeListener {
    final /* synthetic */ jir a;

    public jii(jir jirVar) {
        this.a = jirVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        jir jirVar = this.a;
        AccessibilityManager accessibilityManager = jirVar.d;
        accessibilityManager.addAccessibilityStateChangeListener(jirVar.e);
        accessibilityManager.addTouchExplorationStateChangeListener(jirVar.f);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        jir jirVar = this.a;
        jirVar.h.removeCallbacks(jirVar.E);
        AccessibilityManager accessibilityManager = jirVar.d;
        accessibilityManager.removeAccessibilityStateChangeListener(jirVar.e);
        accessibilityManager.removeTouchExplorationStateChangeListener(jirVar.f);
    }
}
