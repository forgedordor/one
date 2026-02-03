package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czra extends AnimatorListenerAdapter {
    final /* synthetic */ czrc a;

    public czra(czrc czrcVar) {
        this.a = czrcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.l = 0;
    }
}
