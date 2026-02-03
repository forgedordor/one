package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eepp extends AnimatorListenerAdapter {
    final /* synthetic */ eepr a;

    public eepp(eepr eeprVar) {
        this.a = eeprVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        eepr eeprVar = this.a;
        eeprVar.a();
        pnz pnzVar = eeprVar.h;
        if (pnzVar != null) {
            pnzVar.b(eeprVar.j);
        }
    }
}
