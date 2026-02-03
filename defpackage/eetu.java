package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eetu implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ BaseTransientBottomBar a;

    public eetu(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        eeul eeulVar = this.a.j;
        eeulVar.setScaleX(fFloatValue);
        eeulVar.setScaleY(fFloatValue);
    }
}
