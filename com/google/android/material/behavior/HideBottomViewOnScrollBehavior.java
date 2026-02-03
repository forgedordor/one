package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import defpackage.eecd;
import defpackage.eedr;
import defpackage.eeds;
import defpackage.eedt;
import defpackage.eenh;
import defpackage.eepx;
import defpackage.kty;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends kty<V> {
    public AccessibilityManager a;
    public AccessibilityManager.TouchExplorationStateChangeListener b;
    public ViewPropertyAnimator c;
    private final LinkedHashSet d;
    private int e;
    private int f;
    private TimeInterpolator g;
    private TimeInterpolator h;
    private int i;
    private int j;

    public HideBottomViewOnScrollBehavior() {
        this.d = new LinkedHashSet();
        this.i = 0;
        this.j = 2;
    }

    private final void v(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.c = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new eeds(this));
    }

    private final void w(int i) {
        this.j = i;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((eedt) it.next()).a();
        }
    }

    @Override // defpackage.kty
    public final void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i2 <= 0) {
            if (i2 < 0) {
                t(view);
            }
        } else if (!u() && ((accessibilityManager = this.a) == null || !accessibilityManager.isTouchExplorationEnabled())) {
            ViewPropertyAnimator viewPropertyAnimator = this.c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            w(1);
            v(view, this.i, this.f, this.h);
        }
    }

    @Override // defpackage.kty
    public boolean g(CoordinatorLayout coordinatorLayout, final View view, int i) {
        this.i = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.e = eepx.a(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f = eepx.a(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.g = eenh.a(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, eecd.d);
        this.h = eenh.a(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, eecd.c);
        if (this.a == null) {
            this.a = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        if (this.a == null || this.b != null) {
            return false;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: eedq
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                if (z) {
                    HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = this.a;
                    if (hideBottomViewOnScrollBehavior.u()) {
                        hideBottomViewOnScrollBehavior.t(view);
                    }
                }
            }
        };
        this.b = touchExplorationStateChangeListener;
        this.a.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        view.addOnAttachStateChangeListener(new eedr(this));
        return false;
    }

    @Override // defpackage.kty
    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public final void t(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        w(2);
        v(view, 0, this.e, this.g);
    }

    public final boolean u() {
        return this.j == 1;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new LinkedHashSet();
        this.i = 0;
        this.j = 2;
    }
}
