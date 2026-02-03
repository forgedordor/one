package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.cvw;
import defpackage.eeci;
import defpackage.eejr;
import defpackage.eejs;
import defpackage.eejx;
import defpackage.eekl;
import defpackage.eekn;
import defpackage.eeko;
import defpackage.eekr;
import defpackage.eeks;
import defpackage.eeku;
import defpackage.eeld;
import defpackage.eemh;
import defpackage.eemo;
import defpackage.eemp;
import defpackage.eepy;
import defpackage.eeqf;
import defpackage.eesc;
import defpackage.eesd;
import defpackage.eesj;
import defpackage.eesu;
import defpackage.eeus;
import defpackage.eexh;
import defpackage.ktx;
import defpackage.kty;
import defpackage.kub;
import defpackage.lcg;
import defpackage.ley;
import defpackage.rb;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class FloatingActionButton extends eemp implements eejr, eesu, ktx {
    public int a;
    public boolean b;
    public final Rect c;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private ColorStateList g;
    private int h;
    private int i;
    private int j;
    private int k;
    private final Rect l;
    private final rb m;
    private final eejs n;
    private eeks o;

    /* compiled from: PG */
    protected static class BaseBehavior<T extends FloatingActionButton> extends kty<T> {
        private Rect a;
        private final boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        private final boolean t(View view, FloatingActionButton floatingActionButton) {
            return (this.b && ((kub) floatingActionButton.getLayoutParams()).f == view.getId() && floatingActionButton.d == 0) ? false : true;
        }

        private static boolean u(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof kub) {
                return ((kub) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private final boolean v(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (t(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            eeld.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.f()) {
                floatingActionButton.d(false);
                return true;
            }
            floatingActionButton.e(false);
            return true;
        }

        private final boolean w(View view, FloatingActionButton floatingActionButton) {
            if (t(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((kub) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.d(false);
                return true;
            }
            floatingActionButton.e(false);
            return true;
        }

        @Override // defpackage.kty
        public final void a(kub kubVar) {
            if (kubVar.h == 0) {
                kubVar.h = 80;
            }
        }

        @Override // defpackage.kty
        public final /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List listA = coordinatorLayout.a(floatingActionButton);
            int size = listA.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) listA.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    if (u(view2) && w(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (v(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.j(floatingActionButton, i);
            Rect rect = floatingActionButton.c;
            if (rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            kub kubVar = (kub) floatingActionButton.getLayoutParams();
            int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - kubVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= kubVar.leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - kubVar.bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= kubVar.topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                int[] iArr = ley.a;
                floatingActionButton.offsetTopAndBottom(i2);
            }
            if (i4 == 0) {
                return true;
            }
            int[] iArr2 = ley.a;
            floatingActionButton.offsetLeftAndRight(i4);
            return true;
        }

        @Override // defpackage.kty
        public final /* bridge */ /* synthetic */ void l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                v(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else if (u(view2)) {
                w(view2, floatingActionButton);
            }
        }

        @Override // defpackage.kty
        public final /* bridge */ /* synthetic */ boolean s(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eeku.d);
            this.b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: PG */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    private final int h(int i) {
        int i2 = this.j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? h(1) : h(0);
    }

    private final eeks i() {
        if (this.o == null) {
            this.o = new eeks(this, new eekl(this));
        }
        return this.o;
    }

    @Override // defpackage.ktx
    public final kty a() {
        return new Behavior();
    }

    public final int b() {
        return h(this.i);
    }

    public final void d(boolean z) {
        eeks eeksVarI = i();
        FloatingActionButton floatingActionButton = eeksVarI.B;
        if (floatingActionButton.getVisibility() == 0) {
            if (eeksVarI.A == 1) {
                return;
            }
        } else if (eeksVarI.A != 2) {
            return;
        }
        Animator animator = eeksVarI.v;
        if (animator != null) {
            animator.cancel();
        }
        if (!eeksVarI.l()) {
            floatingActionButton.f(true != z ? 4 : 8, z);
            return;
        }
        eeci eeciVar = eeksVarI.x;
        AnimatorSet animatorSetB = eeciVar != null ? eeksVarI.b(eeciVar, 0.0f, 0.0f, 0.0f) : eeksVarI.c(0.0f, 0.4f, 0.4f, eeks.d, eeks.e);
        animatorSetB.addListener(new eekn(eeksVarI, z));
        animatorSetB.start();
    }

    public final void e(boolean z) {
        eeks eeksVarI = i();
        FloatingActionButton floatingActionButton = eeksVarI.B;
        if (floatingActionButton.getVisibility() != 0) {
            if (eeksVarI.A == 2) {
                return;
            }
        } else if (eeksVarI.A != 1) {
            return;
        }
        Animator animator = eeksVarI.v;
        if (animator != null) {
            animator.cancel();
        }
        eeci eeciVar = eeksVarI.w;
        if (!eeksVarI.l()) {
            floatingActionButton.f(0, z);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            eeksVarI.f(1.0f);
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            float f = eeciVar == null ? 0.4f : 0.0f;
            floatingActionButton.setScaleY(f);
            floatingActionButton.setScaleX(f);
            eeksVarI.f(f);
        }
        eeci eeciVar2 = eeksVarI.w;
        AnimatorSet animatorSetB = eeciVar2 != null ? eeksVarI.b(eeciVar2, 1.0f, 1.0f, 1.0f) : eeksVarI.c(1.0f, 1.0f, 1.0f, eeks.b, eeks.c);
        animatorSetB.addListener(new eeko(eeksVarI, z));
        animatorSetB.start();
    }

    @Override // defpackage.eesu
    public final void fx(eesj eesjVar) {
        i().g(eesjVar);
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return this.e;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.f;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        eeks eeksVarI = i();
        eesc eescVar = eeksVarI.m;
        if (eescVar != null) {
            eesd.d(eeksVarI.B, eescVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i().B.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iB = b();
        this.a = (iB - this.k) / 2;
        i().i();
        int iMin = Math.min(View.resolveSize(iB, i), View.resolveSize(iB, i2));
        Rect rect = this.c;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof eeus)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        eeus eeusVar = (eeus) parcelable;
        super.onRestoreInstanceState(eeusVar.d);
        eejs eejsVar = this.n;
        Bundle bundle = (Bundle) eeusVar.a.get("expandableWidgetHelper");
        lcg.i(bundle);
        eejsVar.b = bundle.getBoolean("expanded", false);
        eejsVar.c = bundle.getInt("expandedComponentIdHint", 0);
        if (eejsVar.b) {
            View view = eejsVar.a;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).b(view);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        eeus eeusVar = new eeus(parcelableOnSaveInstanceState);
        cvw cvwVar = eeusVar.a;
        eejs eejsVar = this.n;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", eejsVar.b);
        bundle.putInt("expandedComponentIdHint", eejsVar.c);
        cvwVar.put("expandableWidgetHelper", bundle);
        return eeusVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.l;
            rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            Rect rect2 = this.c;
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            int i = -this.o.a();
            rect.inset(i, i);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            eeks eeksVarI = i();
            eesc eescVar = eeksVarI.m;
            if (eescVar != null) {
                eescVar.setTintList(colorStateList);
            }
            eejx eejxVar = eeksVarI.o;
            if (eejxVar != null) {
                eejxVar.b(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            eesc eescVar = i().m;
            if (eescVar != null) {
                eescVar.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        eesc eescVar = i().m;
        if (eescVar != null) {
            eescVar.O(f);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            i().h();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.m.e(i);
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        drawable.clearColorFilter();
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        super.setScaleX(f);
        i();
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        super.setScaleY(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationZ(float f) {
        super.setTranslationZ(f);
        i();
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        ColorStateList colorStateList;
        Drawable drawable;
        Drawable layerDrawable;
        super(eexh.a(context, attributeSet, i, R.style.Widget_Design_FloatingActionButton), attributeSet, i);
        this.c = new Rect();
        this.l = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayA = eemh.a(context2, attributeSet, eeku.c, i, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.e = eepy.c(context2, typedArrayA, 1);
        this.f = eemo.c(typedArrayA.getInt(2, -1), null);
        this.g = eepy.c(context2, typedArrayA, 12);
        this.i = typedArrayA.getInt(7, -1);
        this.j = typedArrayA.getDimensionPixelSize(6, 0);
        this.h = typedArrayA.getDimensionPixelSize(3, 0);
        float dimension = typedArrayA.getDimension(4, 0.0f);
        float dimension2 = typedArrayA.getDimension(9, 0.0f);
        float dimension3 = typedArrayA.getDimension(11, 0.0f);
        this.b = typedArrayA.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        int dimensionPixelSize2 = typedArrayA.getDimensionPixelSize(10, 0);
        this.k = dimensionPixelSize2;
        eeks eeksVarI = i();
        if (eeksVarI.z != dimensionPixelSize2) {
            eeksVarI.z = dimensionPixelSize2;
            eeksVarI.h();
        }
        eeci eeciVarB = eeci.b(context2, typedArrayA, 15);
        eeci eeciVarB2 = eeci.b(context2, typedArrayA, 8);
        eesj eesjVar = new eesj(eesj.c(context2, attributeSet, i, R.style.Widget_Design_FloatingActionButton, eesj.a));
        boolean z = typedArrayA.getBoolean(5, false);
        setEnabled(typedArrayA.getBoolean(0, true));
        typedArrayA.recycle();
        rb rbVar = new rb(this);
        this.m = rbVar;
        rbVar.c(attributeSet, i);
        this.n = new eejs(this);
        i().g(eesjVar);
        eeks eeksVarI2 = i();
        ColorStateList colorStateList2 = this.e;
        PorterDuff.Mode mode = this.f;
        ColorStateList colorStateList3 = this.g;
        int i2 = this.h;
        eesj eesjVar2 = eeksVarI2.l;
        lcg.i(eesjVar2);
        eeksVarI2.m = new eekr(eesjVar2);
        eeksVarI2.m.setTintList(colorStateList2);
        if (mode != null) {
            eeksVarI2.m.setTintMode(mode);
        }
        eeksVarI2.m.L(eeksVarI2.B.getContext());
        if (i2 > 0) {
            Context context3 = eeksVarI2.B.getContext();
            eesj eesjVar3 = eeksVarI2.l;
            lcg.i(eesjVar3);
            eejx eejxVar = new eejx(eesjVar3);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            colorStateList = colorStateList3;
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            eejxVar.c = color;
            eejxVar.d = color2;
            eejxVar.e = color3;
            eejxVar.f = color4;
            float f = i2;
            if (eejxVar.b != f) {
                eejxVar.b = f;
                eejxVar.a.setStrokeWidth(f * 1.3333f);
                eejxVar.g = true;
                eejxVar.invalidateSelf();
            }
            eejxVar.b(colorStateList2);
            eeksVarI2.o = eejxVar;
            eejx eejxVar2 = eeksVarI2.o;
            lcg.i(eejxVar2);
            eesc eescVar = eeksVarI2.m;
            lcg.i(eescVar);
            layerDrawable = new LayerDrawable(new Drawable[]{eejxVar2, eescVar});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            drawable = null;
            eeksVarI2.o = null;
            layerDrawable = eeksVarI2.m;
        }
        eeksVarI2.n = new RippleDrawable(eeqf.b(colorStateList), layerDrawable, drawable);
        eeksVarI2.p = eeksVarI2.n;
        i().u = dimensionPixelSize;
        eeks eeksVarI3 = i();
        if (eeksVarI3.r != dimension) {
            eeksVarI3.r = dimension;
            eeksVarI3.e(dimension, eeksVarI3.s, eeksVarI3.t);
        }
        eeks eeksVarI4 = i();
        if (eeksVarI4.s != dimension2) {
            eeksVarI4.s = dimension2;
            eeksVarI4.e(eeksVarI4.r, dimension2, eeksVarI4.t);
        }
        eeks eeksVarI5 = i();
        if (eeksVarI5.t != dimension3) {
            eeksVarI5.t = dimension3;
            eeksVarI5.e(eeksVarI5.r, eeksVarI5.s, dimension3);
        }
        i().w = eeciVarB;
        i().x = eeciVarB2;
        i().q = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
