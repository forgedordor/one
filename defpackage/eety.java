package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eety implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ BaseTransientBottomBar a;

    public eety(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.j.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
