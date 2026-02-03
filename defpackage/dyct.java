package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyct extends AnimatorListenerAdapter {
    final /* synthetic */ Runnable a;
    final /* synthetic */ AnimatorListenerAdapter b;
    final /* synthetic */ dycv c;

    public dyct(dycv dycvVar, Runnable runnable, AnimatorListenerAdapter animatorListenerAdapter) {
        this.a = runnable;
        this.b = animatorListenerAdapter;
        this.c = dycvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.run();
        dycv dycvVar = this.c;
        AccountParticleDisc accountParticleDisc = dycvVar.b.c;
        ekgb ekgbVarT = ekgb.t(ObjectAnimator.ofFloat(accountParticleDisc, "scaleX", 0.067f, 1.0f).setDuration(233L), ObjectAnimator.ofFloat(accountParticleDisc, "scaleY", 0.067f, 1.0f).setDuration(233L), ObjectAnimator.ofFloat(accountParticleDisc, "alpha", 0.125f, 1.0f).setDuration(117L));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ekgbVarT);
        animatorSet.addListener(this.b);
        animatorSet.addListener(new dycu(dycvVar, accountParticleDisc));
        animatorSet.start();
    }
}
