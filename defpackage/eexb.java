package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eexb implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ TextInputLayout a;

    public eexb(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.q.B(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
