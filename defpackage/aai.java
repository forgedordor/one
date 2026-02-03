package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aai implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ aaj a;

    public aai(aaj aajVar) {
        this.a = aajVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.p = valueAnimator.getAnimatedFraction();
    }
}
