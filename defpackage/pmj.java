package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pmj extends AnimatorListenerAdapter {
    final /* synthetic */ csq a;
    final /* synthetic */ pmx b;

    public pmj(pmx pmxVar, csq csqVar) {
        this.b = pmxVar;
        this.a = csqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.l.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.l.add(animator);
    }
}
