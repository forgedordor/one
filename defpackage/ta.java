package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ta extends AnimatorListenerAdapter {
    final /* synthetic */ tc a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ te d;

    public ta(te teVar, tc tcVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = teVar;
        this.a = tcVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        View view = this.c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        te teVar = this.d;
        tc tcVar = this.a;
        teVar.l(tcVar.a);
        teVar.g.remove(tcVar.a);
        teVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        wv wvVar = this.a.a;
    }
}
