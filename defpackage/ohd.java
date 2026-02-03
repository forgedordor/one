package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ohd extends AnimatorListenerAdapter {
    final /* synthetic */ ohe a;

    public ohd(ohe oheVar) {
        this.a = oheVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.a.h;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ViewGroup viewGroup = this.a.f;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
    }
}
