package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ljh extends lhj {
    final /* synthetic */ lji a;

    public ljh(lji ljiVar) {
        this.a = ljiVar;
    }

    @Override // defpackage.lhj
    public final lhg a(int i) {
        return new lhg(AccessibilityNodeInfo.obtain(this.a.j(i).a));
    }

    @Override // defpackage.lhj
    public final lhg b(int i) {
        int i2 = i == 2 ? this.a.c : this.a.d;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i2);
    }

    @Override // defpackage.lhj
    public final boolean d(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        lji ljiVar = this.a;
        if (i == -1) {
            return ljiVar.b.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            View view = ljiVar.b;
            if ((!view.isFocused() && !view.requestFocus()) || (i3 = ljiVar.d) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                ljiVar.r(i3);
            }
            if (i == Integer.MIN_VALUE) {
                return false;
            }
            ljiVar.d = i;
            ljiVar.o(i, true);
            ljiVar.t(i, 8);
            return true;
        }
        if (i2 == 2) {
            return ljiVar.r(i);
        }
        if (i2 != 64) {
            return i2 != 128 ? ljiVar.s(i, i2) : ljiVar.q(i);
        }
        AccessibilityManager accessibilityManager = ljiVar.a;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i4 = ljiVar.c) == i) {
            return false;
        }
        if (i4 != Integer.MIN_VALUE) {
            ljiVar.q(i4);
        }
        ljiVar.c = i;
        ljiVar.b.invalidate();
        ljiVar.t(i, 32768);
        return true;
    }
}
