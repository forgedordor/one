package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tq implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ tr a;

    public tq(tr trVar) {
        this.a = trVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f;
        tr trVar = this.a;
        int i = (int) fFloatValue;
        trVar.b.setAlpha(i);
        trVar.c.setAlpha(i);
        trVar.e();
    }
}
