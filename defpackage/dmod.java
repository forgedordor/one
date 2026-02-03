package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmod implements Animator.AnimatorListener {
    final /* synthetic */ dmoo a;
    final /* synthetic */ float b;

    public dmod(dmoo dmooVar, float f) {
        this.a = dmooVar;
        this.b = f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        dmoo dmooVar = this.a;
        dmooVar.i = fdil.d(dmooVar.d, null, null, new dmoc(dmooVar, null), 3);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        dmoo dmooVar = this.a;
        dmooVar.e(this.b);
        dmooVar.i.t(null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
