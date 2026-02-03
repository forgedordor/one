package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxzy extends AnimatorListenerAdapter {
    final /* synthetic */ dyaa a;

    public dxzy(dyaa dyaaVar) {
        this.a = dyaaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        dyks dyksVar;
        dyaa dyaaVar = this.a;
        if (dyaaVar.e.g() && (dyksVar = ((dxyi) dyaaVar.e.c()).d) != null) {
            dyksVar.c = false;
            AnimatorSet animatorSet = dyksVar.b;
            if (animatorSet != null) {
                animatorSet.end();
            }
        }
        dyaaVar.a.h(null);
    }
}
