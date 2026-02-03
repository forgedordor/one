package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyts extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ dytu b;

    public dyts(dytu dytuVar, boolean z) {
        this.a = z;
        this.b = dytuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            dytu dytuVar = this.b;
            dytuVar.s(true);
            dytuVar.t(true);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a) {
            return;
        }
        dytu dytuVar = this.b;
        dytuVar.s(false);
        dytuVar.t(false);
    }
}
