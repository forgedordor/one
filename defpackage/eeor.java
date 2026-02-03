package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeor extends AnimatorListenerAdapter {
    final /* synthetic */ eeov a;

    public eeor(eeov eeovVar) {
        this.a = eeovVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        eeov eeovVar = this.a;
        int i = eeovVar.e;
        int length = eeov.a.length;
        eeovVar.e = (i + 4) % eeovVar.d.e.length;
    }
}
