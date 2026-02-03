package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpvd implements Animator.AnimatorListener {
    final /* synthetic */ dpvh a;

    public dpvd(dpvh dpvhVar) {
        this.a = dpvhVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [dpvw, java.lang.Object] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        dpvh dpvhVar = this.a;
        ?? Invoke = dpvhVar.d.invoke();
        if (Invoke != 0) {
            dpvhVar.h(Invoke);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
    }
}
