package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eump extends AnimatorListenerAdapter {
    final /* synthetic */ eumy a;

    public eump(eumy eumyVar) {
        this.a = eumyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.c.dismiss();
    }
}
