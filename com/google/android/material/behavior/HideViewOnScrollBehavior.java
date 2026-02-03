package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import defpackage.eecd;
import defpackage.eedu;
import defpackage.eedv;
import defpackage.eedw;
import defpackage.eedy;
import defpackage.eedz;
import defpackage.eeea;
import defpackage.eeeb;
import defpackage.eenh;
import defpackage.eepx;
import defpackage.kty;
import defpackage.kub;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class HideViewOnScrollBehavior<V extends View> extends kty<V> {
    public AccessibilityManager a;
    public AccessibilityManager.TouchExplorationStateChangeListener b;
    public ViewPropertyAnimator c;
    private eeeb d;
    private final LinkedHashSet e;
    private int f;
    private int g;
    private TimeInterpolator h;
    private TimeInterpolator i;
    private int j;
    private int k;

    public HideViewOnScrollBehavior() {
        this.e = new LinkedHashSet();
        this.j = 0;
        this.k = 2;
    }

    private final void w(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.c = this.d.c(view, i).setInterpolator(timeInterpolator).setDuration(j).setListener(new eedz(this));
    }

    private final void x(int i) {
        this.k = i;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((eeea) it.next()).a();
        }
    }

    @Override // defpackage.kty
    public final void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i2 <= 0) {
            if (i2 < 0) {
                u(view);
            }
        } else if (!v() && ((accessibilityManager = this.a) == null || !accessibilityManager.isTouchExplorationEnabled())) {
            ViewPropertyAnimator viewPropertyAnimator = this.c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            x(1);
            w(view, this.j, this.g, this.i);
        }
    }

    @Override // defpackage.kty
    public final boolean g(CoordinatorLayout coordinatorLayout, final View view, int i) {
        if (this.a == null) {
            this.a = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        if (this.a != null && this.b == null) {
            AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: eedx
                @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                public final void onTouchExplorationStateChanged(boolean z) {
                    if (z) {
                        HideViewOnScrollBehavior hideViewOnScrollBehavior = this.a;
                        if (hideViewOnScrollBehavior.v()) {
                            hideViewOnScrollBehavior.u(view);
                        }
                    }
                }
            };
            this.b = touchExplorationStateChangeListener;
            this.a.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
            view.addOnAttachStateChangeListener(new eedy(this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i2 = ((kub) view.getLayoutParams()).c;
        if (i2 == 80 || i2 == 81) {
            t(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i2, i);
            int i3 = 2;
            if (absoluteGravity != 3 && absoluteGravity != 19) {
                i3 = 0;
            }
            t(i3);
        }
        this.j = this.d.a(view, marginLayoutParams);
        this.f = eepx.a(view.getContext(), R.attr.motionDurationLong2, 225);
        this.g = eepx.a(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.h = eenh.a(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, eecd.d);
        this.i = eenh.a(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, eecd.c);
        return false;
    }

    @Override // defpackage.kty
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public final void t(int i) {
        eeeb eeebVar = this.d;
        if (eeebVar == null || eeebVar.b() != i) {
            this.d = i != 0 ? i != 1 ? new eedv() : new eedu() : new eedw();
        }
    }

    public final void u(View view) {
        if (this.k == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        x(2);
        this.d.d();
        w(view, 0, this.f, this.h);
    }

    public final boolean v() {
        return this.k == 1;
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new LinkedHashSet();
        this.j = 0;
        this.k = 2;
    }
}
