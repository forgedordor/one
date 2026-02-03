package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxcw extends AnimatorListenerAdapter {
    final /* synthetic */ dxcy a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ dxda d;

    public dxcw(dxda dxdaVar, dxcy dxcyVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.a = dxcyVar;
        this.b = viewPropertyAnimator;
        this.c = view;
        this.d = dxdaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        View view = this.c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        dxda dxdaVar = this.d;
        dxcy dxcyVar = this.a;
        dxdaVar.l(dxcyVar.a);
        dxdaVar.d.remove(dxcyVar.a);
        dxdaVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        wv wvVar = this.a.a;
    }
}
