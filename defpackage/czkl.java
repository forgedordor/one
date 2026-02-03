package defpackage;

import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czkl implements Animation.AnimationListener {
    final /* synthetic */ czkq a;

    public czkl(czkq czkqVar) {
        this.a = czkqVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.p = null;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
