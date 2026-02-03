package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eexk implements eexq {
    private static Animator c(View view, float f, float f2, float f3, float f4, float f5) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new eexi(view, f, f2, f3, f4));
        valueAnimatorOfFloat.addListener(new eexj(view, f5));
        return valueAnimatorOfFloat;
    }

    @Override // defpackage.eexq
    public final Animator a(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, 0.35f, 1.0f, alpha);
    }

    @Override // defpackage.eexq
    public final Animator b(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, alpha, 0.0f, 0.0f, 0.35f, alpha);
    }
}
