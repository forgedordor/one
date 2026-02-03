package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eewc extends AnimatorListenerAdapter {
    final /* synthetic */ eewd a;

    public eewc(eewd eewdVar) {
        this.a = eewdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        eewd eewdVar = this.a;
        eewdVar.x();
        eewdVar.d.start();
    }
}
