package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxct extends AnimatorListenerAdapter {
    final /* synthetic */ wv a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ dxda d;

    public dxct(dxda dxdaVar, wv wvVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.a = wvVar;
        this.b = viewPropertyAnimator;
        this.c = view;
        this.d = dxdaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        dxda dxdaVar = this.d;
        wv wvVar = this.a;
        dxdaVar.l(wvVar);
        dxdaVar.c.remove(wvVar);
        dxdaVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
