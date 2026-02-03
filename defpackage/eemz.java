package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eemz extends AnimatorListenerAdapter {
    final /* synthetic */ eena a;

    public eemz(eena eenaVar) {
        this.a = eenaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        eena eenaVar = this.a;
        eenaVar.a.setTranslationY(0.0f);
        eenaVar.g(0.0f);
    }
}
