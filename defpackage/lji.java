package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lji extends lcl {
    private static final Rect f = new Rect(Alert.DURATION_SHOW_INDEFINITELY, Alert.DURATION_SHOW_INDEFINITELY, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final AccessibilityManager a;
    public final View b;
    private ljh k;
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private final int[] j = new int[2];
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public int e = Integer.MIN_VALUE;

    public lji(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.b = view;
        this.a = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.lcl
    public final lhj a(View view) {
        if (this.k == null) {
            this.k = new ljh(this);
        }
        return this.k;
    }

    @Override // defpackage.lcl
    public void c(View view, lhg lhgVar) {
        super.c(view, lhgVar);
        m(lhgVar);
    }

    final lhg j(int i) {
        if (i == -1) {
            View view = this.b;
            lhg lhgVar = new lhg(AccessibilityNodeInfo.obtain(view));
            int[] iArr = ley.a;
            AccessibilityNodeInfo accessibilityNodeInfo = lhgVar.a;
            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            ArrayList arrayList = new ArrayList();
            k(arrayList);
            if (accessibilityNodeInfo.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                lhgVar.j(view, ((Integer) arrayList.get(i2)).intValue());
            }
            return lhgVar;
        }
        lhg lhgVarB = lhg.b();
        lhgVarB.y(true);
        lhgVarB.A(true);
        lhgVarB.s("android.view.View");
        Rect rect = f;
        lhgVarB.o(rect);
        lhgVarB.p(rect);
        View view2 = this.b;
        lhgVarB.K(view2);
        n(i, lhgVarB);
        if (lhgVarB.e() == null && lhgVarB.d() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.h;
        lhgVarB.k(rect2);
        Rect rect3 = this.g;
        lhgVarB.l(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
        }
        int actions = lhgVarB.a.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        lhgVarB.I(view2.getContext().getPackageName());
        lhgVarB.Q(view2, i);
        if (this.c == i) {
            lhgVarB.m(true);
            lhgVarB.h(128);
        } else {
            lhgVarB.m(false);
            lhgVarB.h(64);
        }
        boolean z = this.d == i;
        if (z) {
            lhgVarB.h(2);
        } else if (lhgVarB.aa()) {
            lhgVarB.h(1);
        }
        lhgVarB.B(z);
        int[] iArr2 = this.j;
        view2.getLocationOnScreen(iArr2);
        if (rect3.equals(rect)) {
            lhgVarB.o(rect2);
            Rect rect4 = new Rect();
            rect4.set(rect2);
            if (lhgVarB.b != -1) {
                lhg lhgVarB2 = lhg.b();
                Rect rect5 = new Rect();
                for (int i3 = lhgVarB.b; i3 != -1; i3 = lhgVarB2.b) {
                    lhgVarB2.L(view2, -1);
                    lhgVarB2.o(rect);
                    n(i3, lhgVarB2);
                    lhgVarB2.k(rect5);
                    rect4.offset(rect5.left, rect5.top);
                }
            }
            view2.getLocationOnScreen(iArr2);
            rect4.offset(iArr2[0] - view2.getScrollX(), iArr2[1] - view2.getScrollY());
            lhgVarB.p(rect4);
            lhgVarB.l(rect3);
        }
        Rect rect6 = this.i;
        if (view2.getLocalVisibleRect(rect6)) {
            rect6.offset(iArr2[0] - view2.getScrollX(), iArr2[1] - view2.getScrollY());
            if (rect3.intersect(rect6)) {
                lhgVarB.p(rect3);
                if (rect3 != null && !rect3.isEmpty() && view2.getWindowVisibility() == 0) {
                    Object parent = view2.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view3 = (View) parent;
                            if (view3.getAlpha() <= 0.0f || view3.getVisibility() != 0) {
                                break;
                            }
                            parent = view3.getParent();
                        } else if (parent != null) {
                            lhgVarB.X(true);
                        }
                    }
                }
            }
        }
        return lhgVarB;
    }

    protected abstract void k(List list);

    protected abstract void n(int i, lhg lhgVar);

    public final void p(int i) {
        int i2 = this.e;
        if (i2 == i) {
            return;
        }
        this.e = i;
        t(i, 128);
        t(i2, 256);
    }

    public final boolean q(int i) {
        if (this.c != i) {
            return false;
        }
        this.c = Integer.MIN_VALUE;
        this.b.invalidate();
        t(i, 65536);
        return true;
    }

    public final boolean r(int i) {
        if (this.d != i) {
            return false;
        }
        this.d = Integer.MIN_VALUE;
        o(i, false);
        t(i, 8);
        return true;
    }

    public abstract boolean s(int i, int i2);

    public final void t(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.a.isEnabled() || (parent = (view = this.b).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            lhg lhgVarJ = j(i);
            accessibilityEventObtain.getText().add(lhgVarJ.e());
            accessibilityEventObtain.setContentDescription(lhgVarJ.d());
            accessibilityEventObtain.setScrollable(lhgVarJ.ad());
            accessibilityEventObtain.setPassword(lhgVarJ.ac());
            accessibilityEventObtain.setEnabled(lhgVarJ.Z());
            accessibilityEventObtain.setChecked(lhgVarJ.a.isChecked());
            l(i, accessibilityEventObtain);
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(lhgVarJ.c());
            accessibilityEventObtain.setSource(view, i);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }

    protected void m(lhg lhgVar) {
    }

    protected void l(int i, AccessibilityEvent accessibilityEvent) {
    }

    protected void o(int i, boolean z) {
    }
}
