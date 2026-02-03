package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sx extends AnimatorListenerAdapter {
    final /* synthetic */ wv a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ te d;

    public sx(te teVar, wv wvVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = teVar;
        this.a = wvVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        te teVar = this.d;
        wv wvVar = this.a;
        teVar.l(wvVar);
        teVar.f.remove(wvVar);
        teVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
