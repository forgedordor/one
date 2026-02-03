package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pmk extends AnimatorListenerAdapter {
    final /* synthetic */ pmx a;

    public pmk(pmx pmxVar) {
        this.a = pmxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.s();
        animator.removeListener(this);
    }
}
