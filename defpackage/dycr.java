package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dycr extends AnimatorListenerAdapter {
    final /* synthetic */ dycs a;

    public dycr(dycs dycsVar) {
        this.a = dycsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.b.setEnabled(true);
    }
}
