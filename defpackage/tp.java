package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tp extends AnimatorListenerAdapter {
    final /* synthetic */ tr a;
    private boolean b = false;

    public tp(tr trVar) {
        this.a = trVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b) {
            this.b = false;
            return;
        }
        tr trVar = this.a;
        if (((Float) trVar.p.getAnimatedValue()).floatValue() == 0.0f) {
            trVar.q = 0;
            trVar.f(0);
        } else {
            trVar.q = 2;
            trVar.e();
        }
    }
}
