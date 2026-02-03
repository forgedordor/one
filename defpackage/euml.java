package defpackage;

import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euml implements Animation.AnimationListener {
    final /* synthetic */ eumy a;

    public euml(eumy eumyVar) {
        this.a = eumyVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.f.post(new eumk(this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        eumy eumyVar = this.a;
        eumyVar.i.setEnabled(false);
        eumyVar.g.setVisibility(0);
        eumyVar.h.setVisibility(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
