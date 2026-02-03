package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzco extends AnimatorListenerAdapter {
    final /* synthetic */ dzdb a;

    public dzco(dzdb dzdbVar) {
        this.a = dzdbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.aW();
    }
}
