package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeom extends AnimatorListenerAdapter {
    final /* synthetic */ eeoq a;

    public eeom(eeoq eeoqVar) {
        this.a = eeoqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        eeoq eeoqVar = this.a;
        eeoqVar.f = (eeoqVar.f + 4) % eeoqVar.e.e.length;
    }
}
