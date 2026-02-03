package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pkt implements Animator.AnimatorListener {
    final /* synthetic */ pku a;
    final /* synthetic */ pkv b;

    public pkt(pkv pkvVar, pku pkuVar) {
        this.b = pkvVar;
        this.a = pkuVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        pku pkuVar = this.a;
        pkv pkvVar = this.b;
        pkvVar.a(1.0f, pkuVar, true);
        pkuVar.e();
        pkuVar.f();
        pkuVar.g();
        if (!pkvVar.d) {
            pkvVar.c += 1.0f;
            return;
        }
        pkvVar.d = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        pkuVar.c(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.c = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
