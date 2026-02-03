package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dytr extends AnimatorListenerAdapter {
    final /* synthetic */ dytu a;

    public dytr(dytu dytuVar) {
        this.a = dytuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.n.setVisibility(8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        dytu dytuVar = this.a;
        dytuVar.m.setVisibility(0);
        dytuVar.l.setVisibility(0);
    }
}
