package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eepo extends AnimatorListenerAdapter {
    final /* synthetic */ eepr a;

    public eepo(eepr eeprVar) {
        this.a = eeprVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        eepr eeprVar = this.a;
        eeprVar.e = (eeprVar.e + 1) % eeprVar.d.e.length;
        eeprVar.f = true;
    }
}
