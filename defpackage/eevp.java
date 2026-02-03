package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eevp extends AnimatorListenerAdapter {
    final /* synthetic */ eevq a;

    public eevp(eevq eevqVar) {
        this.a = eevqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.f.l(false);
    }
}
