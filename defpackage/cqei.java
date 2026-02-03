package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class cqei {
    public static final Interpolator a = new lud();
    public static final Interpolator b = new cqbg(0.2f, 1.0f);

    public static int a(Context context) {
        return context.getResources().getInteger(R.integer.no_shifting_animation_duration);
    }

    public static void e(View view, int i, long j, Interpolator interpolator, Runnable runnable, Animation... animationArr) {
        cqaz.l(animationArr);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(animationArr[0]);
        if (j == -1) {
            animationSet.setDuration(a(view.getContext()));
        } else {
            animationSet.setDuration(j);
        }
        animationSet.setInterpolator(interpolator);
        animationSet.setAnimationListener(new cqed(i, view, runnable));
        view.clearAnimation();
        view.startAnimation(animationSet);
    }

    public static boolean h(View view, int i, Runnable runnable) {
        if (view.getVisibility() != i) {
            return true;
        }
        if (runnable == null) {
            return false;
        }
        cqdq.a.post(runnable);
        return false;
    }

    public final void b(final View view, int i, int i2) {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cqeb
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Interpolator interpolator = cqei.a;
                view.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        valueAnimatorOfObject.setDuration(150L).start();
    }

    public final void c(View view, lvc lvcVar, Runnable runnable) {
        view.addOnLayoutChangeListener(new cqeh(view, lvcVar, runnable));
    }

    @Deprecated
    public final void d(View view, int i, Runnable runnable) {
        Interpolator interpolator = b;
        if (h(view, i, runnable)) {
            e(view, i, -1L, interpolator, runnable, new cpaw(view.getContext(), i == 0 ? 0.0f : 1.0f, i == 0 ? 1.0f : 0.0f));
        }
    }

    public final void f(View view, float f) {
        view.clearAnimation();
        view.setScaleX(f);
        view.setScaleY(f);
    }

    public final void g(View view, float f) {
        view.animate().scaleX(f).scaleY(f).setDuration(150L);
    }

    public final void i(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        new Rect(i, iArr[1], view.getMeasuredWidth() + i, iArr[1] + view.getMeasuredHeight());
    }
}
