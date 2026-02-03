package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.eecd;
import defpackage.eehg;
import defpackage.eemh;
import defpackage.eemo;
import defpackage.eenh;
import defpackage.eepx;
import defpackage.eett;
import defpackage.eetz;
import defpackage.eeua;
import defpackage.eeub;
import defpackage.eeuc;
import defpackage.eeud;
import defpackage.eeug;
import defpackage.eeui;
import defpackage.eeuj;
import defpackage.eeul;
import defpackage.eeup;
import defpackage.eeuq;
import defpackage.kub;
import defpackage.len;
import defpackage.ley;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class BaseTransientBottomBar {
    private int B;
    private final AccessibilityManager C;
    public final int c;
    public final int d;
    public final int e;
    public final TimeInterpolator f;
    public final TimeInterpolator g;
    public final ViewGroup h;
    public final Context i;
    public final eeul j;
    public int k;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public final SnackbarContentLayout s;
    private final TimeInterpolator y;
    private eeui z;
    private static final TimeInterpolator u = eecd.b;
    private static final TimeInterpolator v = eecd.a;
    private static final TimeInterpolator w = eecd.d;
    private static final int[] x = {R.attr.snackbarStyle};
    public static final String b = "BaseTransientBottomBar";
    public static final Handler a = new Handler(Looper.getMainLooper(), new eetz());
    public boolean l = false;
    private final Runnable A = new eeua(this);
    public final eeud t = new eeud(this);

    /* compiled from: PG */
    public static class Behavior extends SwipeDismissBehavior<View> {
        public final eeuj g = new eeuj(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.kty
        public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            eeuj eeujVar = this.g;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    eeuq.a().f(eeujVar.a);
                }
            } else if (coordinatorLayout.k(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                eeuq.a().e(eeujVar.a);
            }
            return super.f(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean t(View view) {
            return view instanceof eeul;
        }
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.h = viewGroup;
        this.s = snackbarContentLayout;
        this.i = context;
        eemh.c(context);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(x);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        eeul eeulVar = (eeul) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.j = eeulVar;
        eeulVar.a = this;
        float f = eeulVar.d;
        if (f != 1.0f) {
            SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
            snackbarContentLayout2.b.setTextColor(eehg.f(eehg.b(view, R.attr.colorSurface), snackbarContentLayout2.b.getCurrentTextColor(), f));
        }
        ((SnackbarContentLayout) view).d = eeulVar.e;
        eeulVar.addView(view);
        eeulVar.setAccessibilityLiveRegion(1);
        eeulVar.setImportantForAccessibility(1);
        eeulVar.setFitsSystemWindows(true);
        eeub eeubVar = new eeub(this);
        int[] iArr = ley.a;
        len.k(eeulVar, eeubVar);
        ley.p(eeulVar, new eeuc(this));
        this.C = (AccessibilityManager) context.getSystemService("accessibility");
        this.e = eepx.a(context, R.attr.motionDurationLong2, 250);
        this.c = eepx.a(context, R.attr.motionDurationLong2, 150);
        this.d = eepx.a(context, R.attr.motionDurationMedium1, 75);
        this.y = eenh.a(context, R.attr.motionEasingEmphasizedInterpolator, v);
        this.g = eenh.a(context, R.attr.motionEasingEmphasizedInterpolator, w);
        this.f = eenh.a(context, R.attr.motionEasingEmphasizedInterpolator, u);
    }

    public int a() {
        throw null;
    }

    public final int b() {
        eeul eeulVar = this.j;
        int height = eeulVar.getHeight();
        ViewGroup.LayoutParams layoutParams = eeulVar.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public final ValueAnimator c(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.y);
        valueAnimatorOfFloat.addUpdateListener(new eett(this));
        return valueAnimatorOfFloat;
    }

    public final View d() {
        eeui eeuiVar = this.z;
        if (eeuiVar == null) {
            return null;
        }
        return (View) eeuiVar.a.get();
    }

    public final void e() {
        f(3);
    }

    public final void f(int i) {
        eeuq eeuqVarA = eeuq.a();
        Object obj = eeuqVarA.a;
        eeud eeudVar = this.t;
        synchronized (obj) {
            if (eeuqVarA.g(eeudVar)) {
                eeuqVarA.d(eeuqVarA.c, i);
            } else if (eeuqVarA.h(eeudVar)) {
                eeuqVarA.d(eeuqVarA.d, i);
            }
        }
    }

    public final void g() {
        eeuq eeuqVarA = eeuq.a();
        Object obj = eeuqVarA.a;
        eeud eeudVar = this.t;
        synchronized (obj) {
            if (eeuqVarA.g(eeudVar)) {
                eeuqVarA.b(eeuqVarA.c);
            }
        }
    }

    public final void h() {
        int height;
        if (d() == null) {
            height = 0;
        } else {
            int[] iArr = new int[2];
            d().getLocationOnScreen(iArr);
            int i = iArr[1];
            ViewGroup viewGroup = this.h;
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            height = (iArr2[1] + viewGroup.getHeight()) - i;
        }
        this.B = height;
        k();
    }

    public final void i() {
        eeuq eeuqVarA = eeuq.a();
        Object obj = eeuqVarA.a;
        int iA = a();
        eeud eeudVar = this.t;
        synchronized (obj) {
            if (eeuqVarA.g(eeudVar)) {
                eeup eeupVar = eeuqVarA.c;
                eeupVar.b = iA;
                eeuqVarA.b.removeCallbacksAndMessages(eeupVar);
                eeuqVarA.b(eeuqVarA.c);
                return;
            }
            if (eeuqVarA.h(eeudVar)) {
                eeuqVarA.d.b = iA;
            } else {
                eeuqVarA.d = new eeup(iA, eeudVar);
            }
            eeup eeupVar2 = eeuqVarA.c;
            if (eeupVar2 == null || !eeuqVarA.d(eeupVar2, 4)) {
                eeuqVarA.c = null;
                eeuqVarA.c();
            }
        }
    }

    public final void j() {
        if (l()) {
            this.j.post(new eeug(this));
            return;
        }
        eeul eeulVar = this.j;
        if (eeulVar.getParent() != null) {
            eeulVar.setVisibility(0);
        }
        g();
    }

    public final void k() {
        eeul eeulVar = this.j;
        ViewGroup.LayoutParams layoutParams = eeulVar.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(b, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (eeulVar.f == null) {
            Log.w(b, "Unable to update margins because original view margins are not set");
            return;
        }
        if (eeulVar.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = eeulVar.f.bottom + (d() != null ? this.B : this.m);
        int i2 = eeulVar.f.left + this.n;
        int i3 = eeulVar.f.right + this.o;
        int i4 = eeulVar.f.top;
        if (marginLayoutParams.bottomMargin != i || marginLayoutParams.leftMargin != i2 || marginLayoutParams.rightMargin != i3 || marginLayoutParams.topMargin != i4) {
            marginLayoutParams.bottomMargin = i;
            marginLayoutParams.leftMargin = i2;
            marginLayoutParams.rightMargin = i3;
            marginLayoutParams.topMargin = i4;
            eeulVar.requestLayout();
        } else if (this.q == this.p) {
            return;
        }
        if (Build.VERSION.SDK_INT < 29 || this.p <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = eeulVar.getLayoutParams();
        if ((layoutParams2 instanceof kub) && (((kub) layoutParams2).a instanceof SwipeDismissBehavior)) {
            Runnable runnable = this.A;
            eeulVar.removeCallbacks(runnable);
            eeulVar.post(runnable);
        }
    }

    public final boolean l() {
        AccessibilityManager accessibilityManager = this.C;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final void m(View view) {
        eeui eeuiVar;
        eeui eeuiVar2 = this.z;
        if (eeuiVar2 != null) {
            eeuiVar2.a();
        }
        if (view == null) {
            eeuiVar = null;
        } else {
            eeui eeuiVar3 = new eeui(this, view);
            if (view.isAttachedToWindow()) {
                eemo.h(view, eeuiVar3);
            }
            view.addOnAttachStateChangeListener(eeuiVar3);
            eeuiVar = eeuiVar3;
        }
        this.z = eeuiVar;
    }

    public final void n() {
        this.j.c = 0;
    }

    public final void o() {
        eeuq eeuqVarA = eeuq.a();
        Object obj = eeuqVarA.a;
        eeud eeudVar = this.t;
        synchronized (obj) {
            if (eeuqVarA.g(eeudVar)) {
                eeuqVarA.c = null;
                if (eeuqVarA.d != null) {
                    eeuqVarA.c();
                }
            }
        }
        eeul eeulVar = this.j;
        ViewParent parent = eeulVar.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(eeulVar);
        }
    }
}
