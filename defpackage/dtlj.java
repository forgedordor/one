package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtlj extends AnimatorListenerAdapter {
    private final Context a;

    public dtlj(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (ValueAnimator.areAnimatorsEnabled() && !((PowerManager) this.a.getSystemService("power")).isPowerSaveMode()) {
            return;
        }
        animator.removeListener(this);
        animator.cancel();
    }
}
