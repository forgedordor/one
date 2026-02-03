package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtbw extends dtbu {
    protected final Animator a;
    public int c;
    private final dtbz d = new dtbv(this);
    public final int b = -1;

    public dtbw(Animator animator) {
        this.a = animator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            return;
        }
        dtcb.c().a(this.d);
    }
}
