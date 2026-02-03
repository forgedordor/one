package defpackage;

import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czkn implements Animation.AnimationListener {
    final /* synthetic */ czkq a;

    public czkn(czkq czkqVar) {
        this.a = czkqVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        czkq czkqVar = this.a;
        if (czkqVar.q) {
            return;
        }
        czkqVar.a.postDelayed(czkqVar.h, 200L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
