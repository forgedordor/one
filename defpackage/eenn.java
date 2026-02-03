package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eenn implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ float a;
    final /* synthetic */ eenp b;

    public eenn(eenp eenpVar, float f) {
        this.a = f;
        this.b = eenpVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.b.n(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.a);
    }
}
