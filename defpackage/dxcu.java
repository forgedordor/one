package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxcu extends AnimatorListenerAdapter {
    final /* synthetic */ wv a;
    final /* synthetic */ View b;
    final /* synthetic */ ViewPropertyAnimator c;
    final /* synthetic */ dxda d;

    public dxcu(dxda dxdaVar, wv wvVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.a = wvVar;
        this.b = view;
        this.c = viewPropertyAnimator;
        this.d = dxdaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        View view = this.b;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.setListener(null);
        dxda dxdaVar = this.d;
        wv wvVar = this.a;
        dxdaVar.l(wvVar);
        dxdaVar.a.remove(wvVar);
        dxdaVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
