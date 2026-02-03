package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eedr implements View.OnAttachStateChangeListener {
    final /* synthetic */ HideBottomViewOnScrollBehavior a;

    public eedr(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.a = hideBottomViewOnScrollBehavior;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = this.a;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = hideBottomViewOnScrollBehavior.b;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = hideBottomViewOnScrollBehavior.a) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        hideBottomViewOnScrollBehavior.b = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
