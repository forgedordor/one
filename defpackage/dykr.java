package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dykr extends AnimatorListenerAdapter {
    boolean a;
    final /* synthetic */ dyks b;

    public dykr(dyks dyksVar) {
        this.b = dyksVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.b.c || this.a) {
            return;
        }
        animator.setStartDelay(416L);
        animator.start();
    }
}
