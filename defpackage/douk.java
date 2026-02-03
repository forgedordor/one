package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class douk extends AnimatorListenerAdapter {
    final /* synthetic */ doum a;

    public douk(doum doumVar) {
        this.a = doumVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        super.onAnimationEnd(animator);
        doum doumVar = this.a;
        doumVar.g = true;
        doumVar.e.invoke();
    }
}
