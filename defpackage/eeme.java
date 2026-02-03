package defpackage;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeme implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ TextView a;

    public eeme(TextView textView) {
        this.a = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        TextView textView = this.a;
        textView.setScaleX(fFloatValue);
        textView.setScaleY(fFloatValue);
    }
}
