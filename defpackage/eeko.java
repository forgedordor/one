package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeko extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ eeks b;

    public eeko(eeks eeksVar, boolean z) {
        this.a = z;
        this.b = eeksVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        eeks eeksVar = this.b;
        eeksVar.A = 0;
        eeksVar.v = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        eeks eeksVar = this.b;
        eeksVar.B.f(0, this.a);
        eeksVar.A = 2;
        eeksVar.v = animator;
    }
}
