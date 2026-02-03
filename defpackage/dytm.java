package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dytm extends AnimatorListenerAdapter {
    final /* synthetic */ dytu a;

    public dytm(dytu dytuVar) {
        this.a = dytuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        dytu dytuVar = this.a;
        dytuVar.m.setVisibility(4);
        dytuVar.l.setVisibility(4);
        dytuVar.y = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.n.setVisibility(0);
    }
}
