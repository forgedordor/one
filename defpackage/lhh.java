package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class lhh extends AccessibilityNodeProvider {
    final lhj a;

    public lhh(lhj lhjVar) {
        this.a = lhjVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        lhg lhgVarA = this.a.a(i);
        if (lhgVarA == null) {
            return null;
        }
        return lhgVarA.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        lhg lhgVarB = this.a.b(i);
        if (lhgVarB == null) {
            return null;
        }
        return lhgVarB.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.d(i, i2, bundle);
    }
}
