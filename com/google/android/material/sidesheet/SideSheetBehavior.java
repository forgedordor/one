package com.google.android.material.sidesheet;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import defpackage.a;
import defpackage.aao;
import defpackage.eecd;
import defpackage.eemt;
import defpackage.eenf;
import defpackage.eeng;
import defpackage.eepy;
import defpackage.eesc;
import defpackage.eesh;
import defpackage.eesj;
import defpackage.eetc;
import defpackage.eetd;
import defpackage.eete;
import defpackage.eetf;
import defpackage.eetg;
import defpackage.eetl;
import defpackage.eetm;
import defpackage.eeto;
import defpackage.eetq;
import defpackage.eetr;
import defpackage.kty;
import defpackage.kub;
import defpackage.len;
import defpackage.ley;
import defpackage.lhd;
import defpackage.lhs;
import defpackage.ljm;
import defpackage.ljn;
import defpackage.lud;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SideSheetBehavior<V extends View> extends kty<V> implements eemt {
    public eetg a;
    public boolean b;
    public int c;
    public ljn d;
    public final float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public WeakReference j;
    public final Set k;
    private eesc l;
    private ColorStateList m;
    private eesj n;
    private final eetq o;
    private float p;
    private boolean q;
    private WeakReference r;
    private int s;
    private VelocityTracker t;
    private eeng u;
    private int v;
    private final ljm w;

    public SideSheetBehavior() {
        this.o = new eetq(this);
        this.b = true;
        this.c = 5;
        this.e = 0.1f;
        this.s = -1;
        this.k = new LinkedHashSet();
        this.w = new eetl(this);
    }

    private final int A() {
        eetg eetgVar = this.a;
        return (eetgVar == null || eetgVar.i() == 0) ? 5 : 3;
    }

    private final kub B() {
        View view;
        WeakReference weakReference = this.j;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof kub)) {
            return null;
        }
        return (kub) view.getLayoutParams();
    }

    private final void C(View view, lhd lhdVar, final int i) {
        ley.y(view, lhdVar, new lhs() { // from class: eetj
            @Override // defpackage.lhs
            public final boolean a(View view2) {
                this.a.v(i);
                return true;
            }
        });
    }

    private final void D() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.t = null;
        }
    }

    private final void E() {
        View view;
        WeakReference weakReference = this.j;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ley.n(view, 262144);
        ley.n(view, 1048576);
        if (this.c != 5) {
            C(view, lhd.h, 5);
        }
        if (this.c != 3) {
            C(view, lhd.f, 3);
        }
    }

    private final void F(eesj eesjVar) {
        eesc eescVar = this.l;
        if (eescVar != null) {
            eescVar.fx(eesjVar);
        }
    }

    private final void H(View view) {
        int i = this.c == 5 ? 4 : 0;
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    private final boolean J() {
        if (this.d != null) {
            return this.b || this.c == 1;
        }
        return false;
    }

    @Override // defpackage.eemt
    public final void G(aao aaoVar) {
        eeng eengVar = this.u;
        if (eengVar == null) {
            return;
        }
        eengVar.e = aaoVar;
    }

    @Override // defpackage.eemt
    public final void I(aao aaoVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        eeng eengVar = this.u;
        if (eengVar == null) {
            return;
        }
        eengVar.f(aaoVar, A());
        WeakReference weakReference = this.j;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.j.get();
        View viewU = u();
        if (viewU == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewU.getLayoutParams()) == null) {
            return;
        }
        this.a.j(marginLayoutParams, (int) ((this.f * view.getScaleX()) + this.i));
        viewU.requestLayout();
    }

    @Override // defpackage.kty
    public final void a(kub kubVar) {
        this.j = null;
        this.d = null;
        this.u = null;
    }

    @Override // defpackage.kty
    public final void b() {
        this.j = null;
        this.d = null;
        this.u = null;
    }

    @Override // defpackage.kty
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        ljn ljnVar;
        if ((!view.isShown() && ley.h(view) == null) || !this.b) {
            this.q = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            D();
            actionMasked = 0;
        }
        if (this.t == null) {
            this.t = VelocityTracker.obtain();
        }
        this.t.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.v = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.q) {
            this.q = false;
            return false;
        }
        return (this.q || (ljnVar = this.d) == null || !ljnVar.i(motionEvent)) ? false : true;
    }

    @Override // defpackage.kty
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        kub kubVarB;
        kub kubVarB2;
        int i2;
        View viewFindViewById;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.j == null) {
            this.j = new WeakReference(view);
            this.u = new eeng(view);
            eesc eescVar = this.l;
            if (eescVar != null) {
                view.setBackground(eescVar);
                eesc eescVar2 = this.l;
                float elevation = this.p;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                eescVar2.O(elevation);
            } else {
                ColorStateList colorStateList = this.m;
                if (colorStateList != null) {
                    int[] iArr = ley.a;
                    len.h(view, colorStateList);
                }
            }
            H(view);
            E();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (ley.h(view) == null) {
                ley.r(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(((kub) view.getLayoutParams()).c, i);
        int iG = 0;
        int i3 = absoluteGravity != 3 ? 0 : 1;
        eetg eetgVar = this.a;
        if (eetgVar == null || eetgVar.i() != i3) {
            if (absoluteGravity != 3) {
                this.a = new eete(this);
                if (this.n != null && ((kubVarB2 = B()) == null || kubVarB2.rightMargin <= 0)) {
                    eesh eeshVar = new eesh(this.n);
                    eeshVar.h(0.0f);
                    eeshVar.d(0.0f);
                    F(new eesj(eeshVar));
                }
            } else {
                this.a = new eetc(this);
                if (this.n != null && ((kubVarB = B()) == null || kubVarB.leftMargin <= 0)) {
                    eesh eeshVar2 = new eesh(this.n);
                    eeshVar2.f(0.0f);
                    eeshVar2.b(0.0f);
                    F(new eesj(eeshVar2));
                }
            }
        }
        if (this.d == null) {
            this.d = ljn.b(coordinatorLayout, this.w);
        }
        int iG2 = this.a.g(view);
        coordinatorLayout.j(view, i);
        this.g = coordinatorLayout.getWidth();
        this.h = this.a.h(coordinatorLayout);
        this.f = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.i = marginLayoutParams != null ? this.a.a(marginLayoutParams) : 0;
        int i4 = this.c;
        if (i4 == 1 || i4 == 2) {
            iG = iG2 - this.a.g(view);
        } else if (i4 != 3) {
            if (i4 != 5) {
                throw new IllegalStateException(a.g(i4, "Unexpected value: "));
            }
            iG = this.a.d();
        }
        int[] iArr2 = ley.a;
        view.offsetLeftAndRight(iG);
        if (this.r == null && (i2 = this.s) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.r = new WeakReference(viewFindViewById);
        }
        for (eetf eetfVar : this.k) {
            if (eetfVar instanceof eetr) {
            }
        }
        return true;
    }

    @Override // defpackage.kty
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.c == 1 && actionMasked == 0) {
            return true;
        }
        if (J()) {
            this.d.e(motionEvent);
        }
        if (actionMasked == 0) {
            D();
        }
        if (this.t == null) {
            this.t = VelocityTracker.obtain();
        }
        this.t.addMovement(motionEvent);
        if (J() && actionMasked == 2 && !this.q && J()) {
            float fAbs = Math.abs(this.v - motionEvent.getX());
            ljn ljnVar = this.d;
            if (fAbs > ljnVar.a) {
                ljnVar.d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.q;
    }

    @Override // defpackage.kty
    public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.kty
    public final void q(View view, Parcelable parcelable) {
        int i = ((eeto) parcelable).a;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.c = i;
    }

    @Override // defpackage.kty
    public final Parcelable r(View view) {
        return new eeto(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final int t() {
        return this.a.c();
    }

    public final View u() {
        WeakReference weakReference = this.r;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final void v(final int i) {
        WeakReference weakReference = this.j;
        if (weakReference == null || weakReference.get() == null) {
            w(i);
            return;
        }
        View view = (View) this.j.get();
        Runnable runnable = new Runnable() { // from class: eeti
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior sideSheetBehavior = this.a;
                View view2 = (View) sideSheetBehavior.j.get();
                if (view2 != null) {
                    sideSheetBehavior.y(view2, i, false);
                }
            }
        };
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    public final void w(int i) {
        View view;
        if (this.c == i) {
            return;
        }
        this.c = i;
        WeakReference weakReference = this.j;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        H(view);
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((eetf) it.next()).b();
        }
        E();
    }

    @Override // defpackage.eemt
    public final void x() {
        eeng eengVar = this.u;
        if (eengVar == null) {
            return;
        }
        eengVar.e();
    }

    public final void y(View view, int i, boolean z) {
        int iT;
        if (i == 3) {
            iT = t();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(a.g(i, "Invalid state to get outer edge offset: "));
            }
            iT = this.a.d();
        }
        ljn ljnVar = this.d;
        if (ljnVar == null || (!z ? ljnVar.j(view, iT, view.getTop()) : ljnVar.h(iT, view.getTop()))) {
            w(i);
        } else {
            w(2);
            this.o.a(i);
        }
    }

    @Override // defpackage.eemt
    public final void z() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        eeng eengVar = this.u;
        if (eengVar == null) {
            return;
        }
        aao aaoVarC = eengVar.c();
        if (aaoVarC == null || Build.VERSION.SDK_INT < 34) {
            v(5);
            return;
        }
        eeng eengVar2 = this.u;
        int iA = A();
        eetm eetmVar = new eetm(this);
        final View viewU = u();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        if (viewU != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewU.getLayoutParams()) != null) {
            final int iB = this.a.b(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: eetk
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i2 = iB;
                    this.a.a.j(marginLayoutParams, eecd.b(i2, 0, valueAnimator.getAnimatedFraction()));
                    viewU.requestLayout();
                }
            };
        }
        boolean zH = eengVar2.h(iA);
        View view = eengVar2.a;
        float width = view.getWidth() * view.getScaleX();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i = zH ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        float f = width + i;
        Property property = View.TRANSLATION_X;
        if (zH) {
            f = -f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        boolean z = aaoVarC.c == 0;
        objectAnimatorOfFloat.setInterpolator(new lud());
        objectAnimatorOfFloat.setDuration(eecd.b(eengVar2.b, eengVar2.c, aaoVarC.b));
        objectAnimatorOfFloat.addListener(new eenf(eengVar2, z, iA));
        objectAnimatorOfFloat.addListener(eetmVar);
        objectAnimatorOfFloat.start();
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = new eetq(this);
        this.b = true;
        this.c = 5;
        this.e = 0.1f;
        this.s = -1;
        this.k = new LinkedHashSet();
        this.w = new eetl(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eetd.a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.m = eepy.c(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.n = new eesj(eesj.h(context, attributeSet, 0, R.style.Widget_Material3_SideSheet));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.s = resourceId;
            WeakReference weakReference = this.r;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.r = null;
            WeakReference weakReference2 = this.j;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        if (this.n != null) {
            eesc eescVar = new eesc(this.n);
            this.l = eescVar;
            eescVar.L(context);
            ColorStateList colorStateList = this.m;
            if (colorStateList != null) {
                this.l.P(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.l.setTint(typedValue.data);
            }
        }
        this.p = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.b = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
