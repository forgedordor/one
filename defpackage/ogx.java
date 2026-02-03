package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ogx extends AnimatorListenerAdapter {
    final /* synthetic */ ogh a;
    final /* synthetic */ ohe b;

    public ogx(ohe oheVar, ogh oghVar) {
        this.a = oghVar;
        this.b = oheVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ohe oheVar = this.b;
        oheVar.k(1);
        if (oheVar.u) {
            this.a.post(oheVar.o);
            oheVar.u = false;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.k(3);
    }
}
