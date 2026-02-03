package defpackage;

import android.animation.ValueAnimator;
import android.support.v7.widget.AppCompatImageView;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doum {
    public final dpir a;
    public final Optional b;
    public final dotc c;
    public final douf d;
    public final fdae e;
    private float j;
    private final fctc h = fctd.a(new fdae() { // from class: douh
        @Override // defpackage.fdae
        public final Object invoke() {
            TabLayout tabLayout = this.a.c.j;
            int height = tabLayout.getHeight();
            ViewGroup.LayoutParams layoutParams = tabLayout.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            return Integer.valueOf(height + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0));
        }
    });
    private final fctc i = fctd.a(new fdae() { // from class: doui
        @Override // defpackage.fdae
        public final Object invoke() {
            return Integer.valueOf(this.a.c.a.getContext().getResources().getInteger(R.integer.short_animation_ms));
        }
    });
    public final dpvv f = new doul(this);
    public boolean g = true;

    public doum(dpir dpirVar, Optional optional, dotc dotcVar, douf doufVar, fdae fdaeVar) {
        this.a = dpirVar;
        this.b = optional;
        this.c = dotcVar;
        this.d = doufVar;
        this.e = fdaeVar;
    }

    static /* synthetic */ float e(doum doumVar) {
        return doumVar.g(doumVar.c.d.getTranslationY());
    }

    private final float g(float f) {
        return fddu.e((-f) / this.c.j.getTop(), 0.0f, 1.0f);
    }

    private final boolean h() {
        float f = this.j;
        return f == 0.0f || f == 1.0f;
    }

    private final void i(float f, float f2, Interpolator interpolator) {
        if (f2 == f) {
            this.e.invoke();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f);
        valueAnimatorOfFloat.setInterpolator(interpolator);
        valueAnimatorOfFloat.setDuration((long) (Math.abs(f2 - f) * ((Number) this.i.a()).intValue()));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: douj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                float fFloatValue = ((Float) animatedValue).floatValue();
                this.a.d(fFloatValue, (-fFloatValue) * r1.c.j.getTop(), true);
            }
        });
        valueAnimatorOfFloat.addListener(new douk(this));
        valueAnimatorOfFloat.start();
    }

    public final void a(boolean z) {
        if (!z || this.c.j.getTop() == 0) {
            d(0.0f, 0.0f, true);
            this.g = true;
        } else {
            i(0.0f, e(this), new AccelerateInterpolator());
        }
    }

    public final boolean b(int i, boolean z) {
        if (!this.d.e()) {
            return false;
        }
        float fE = fddu.e(this.c.d.getTranslationY() - i, -r0.j.getTop(), 0.0f);
        return d(g(fE), fE, z);
    }

    public final boolean c() {
        return !this.d.e() || h();
    }

    public final boolean d(float f, float f2, boolean z) {
        if (this.j == f && h()) {
            if (!z) {
                return false;
            }
            this.e.invoke();
            return false;
        }
        dotc dotcVar = this.c;
        dotcVar.g.setAlpha(fddu.e(1.0f - (f + f), 0.0f, 1.0f));
        dotcVar.d.setTranslationY(f2);
        AppCompatImageView appCompatImageView = dotcVar.e;
        if (appCompatImageView.getVisibility() != 0) {
            appCompatImageView = null;
        }
        if (appCompatImageView != null) {
            appCompatImageView.setTranslationY((-f2) - ((((appCompatImageView.getHeight() - ((Number) this.h.a()).intValue()) / 2) + r0.getPaddingTop()) * f));
            TabLayout tabLayout = dotcVar.j;
            ViewGroup.LayoutParams layoutParams = tabLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (dphw.g(tabLayout)) {
                marginLayoutParams.rightMargin = (int) ((dotcVar.c.getWidth() - appCompatImageView.getLeft()) * f);
            } else {
                marginLayoutParams.leftMargin = (int) (appCompatImageView.getRight() * f);
            }
            tabLayout.setLayoutParams(marginLayoutParams);
        }
        this.j = f;
        if (!z) {
            return true;
        }
        this.e.invoke();
        return true;
    }

    public final void f() {
        if (this.d.e()) {
            float fE = e(this);
            i(fE <= 0.5f ? 0.0f : 1.0f, fE, new DecelerateInterpolator());
        }
    }
}
