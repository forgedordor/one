package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eenf extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ eeng c;

    public eenf(eeng eengVar, boolean z, int i) {
        this.a = z;
        this.b = i;
        this.c = eengVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        eeng eengVar = this.c;
        eengVar.a.setTranslationX(0.0f);
        eengVar.g(0.0f, this.a, this.b);
    }
}
