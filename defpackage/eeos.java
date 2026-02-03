package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeos extends AnimatorListenerAdapter {
    final /* synthetic */ eeov a;

    public eeos(eeov eeovVar) {
        this.a = eeovVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        eeov eeovVar = this.a;
        eeovVar.a();
        pnz pnzVar = eeovVar.h;
        if (pnzVar != null) {
            pnzVar.b(eeovVar.j);
        }
    }
}
