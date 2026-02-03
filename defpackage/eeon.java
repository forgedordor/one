package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeon extends AnimatorListenerAdapter {
    final /* synthetic */ eeoq a;

    public eeon(eeoq eeoqVar) {
        this.a = eeoqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        eeoq eeoqVar = this.a;
        eeoqVar.a();
        pnz pnzVar = eeoqVar.i;
        if (pnzVar != null) {
            pnzVar.b(eeoqVar.j);
        }
    }
}
