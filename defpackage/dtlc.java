package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtlc extends AnimatorListenerAdapter {
    final /* synthetic */ dtli a;

    public dtlc(dtli dtliVar) {
        this.a = dtliVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        dtli dtliVar = this.a;
        dtliVar.q = null;
        if (dtliVar.t || dtliVar.z) {
            return;
        }
        dtliVar.n(dtliVar.a());
    }
}
