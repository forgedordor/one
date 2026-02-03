package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eecz implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ eedc a;

    public eecz(eedc eedcVar) {
        this.a = eedcVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.h(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
