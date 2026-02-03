package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxzz extends AnimatorListenerAdapter {
    final /* synthetic */ ejwi a;
    final /* synthetic */ Drawable b;
    final /* synthetic */ dyaa c;

    public dxzz(dyaa dyaaVar, ejwi ejwiVar, Drawable drawable) {
        this.a = ejwiVar;
        this.b = drawable;
        this.c = dyaaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        dyks dyksVar;
        dyaa dyaaVar = this.c;
        dyaaVar.e = this.a;
        if (dyaaVar.e.g() && (dyksVar = ((dxyi) dyaaVar.e.c()).d) != null) {
            dyksVar.c = true;
            AnimatorSet animatorSet = dyksVar.b;
            if (animatorSet != null) {
                animatorSet.start();
            }
        }
        dyaaVar.a.h(this.b);
    }
}
