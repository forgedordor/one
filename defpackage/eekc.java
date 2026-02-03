package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eekc extends AnimatorListenerAdapter {
    final /* synthetic */ eekt a;
    private boolean b;

    public eekc(eekt eektVar) {
        this.a = eektVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
        this.a.e();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        eekt eektVar = this.a;
        eektVar.f();
        if (this.b) {
            return;
        }
        eektVar.k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.g(animator);
        this.b = false;
    }
}
