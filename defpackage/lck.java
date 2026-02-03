package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lck extends View.AccessibilityDelegate {
    final lcl a;

    public lck(lcl lclVar) {
        this.a = lclVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.g(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        lhj lhjVarA = this.a.a(view);
        if (lhjVarA != null) {
            return (AccessibilityNodeProvider) lhjVarA.b;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.b(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        lhg lhgVar = new lhg(accessibilityNodeInfo);
        int[] iArr = ley.a;
        Boolean bool = (Boolean) new lef(Boolean.class).d(view);
        lhgVar.N(bool != null && bool.booleanValue());
        Boolean bool2 = (Boolean) new lei(Boolean.class).d(view);
        lhgVar.C(bool2 != null && bool2.booleanValue());
        lhgVar.J(ley.h(view));
        lhgVar.R((CharSequence) new leh(CharSequence.class).d(view));
        this.a.c(view, lhgVar);
        accessibilityNodeInfo.getText();
        List listQ = lcl.Q(view);
        for (int i = 0; i < listQ.size(); i++) {
            lhgVar.i((lhd) listQ.get(i));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.d(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.h(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.i(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.a.e(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.f(view, accessibilityEvent);
    }
}
