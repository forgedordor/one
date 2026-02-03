package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class upb extends AnimatorListenerAdapter {
    final /* synthetic */ uph a;
    private final fdae b;
    private final fdae c;

    public upb(uph uphVar, fdae fdaeVar, fdae fdaeVar2) {
        this.a = uphVar;
        this.b = fdaeVar;
        this.c = fdaeVar2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.a.h = null;
        this.c.invoke();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
        uph uphVar = this.a;
        Animator animator2 = uphVar.h;
        if (animator2 != null) {
            animator2.cancel();
        }
        uphVar.h = animator;
        this.b.invoke();
    }
}
