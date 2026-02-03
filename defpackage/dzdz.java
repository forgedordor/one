package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import com.google.android.libraries.onegoogle.tooltip.TooltipView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzdz extends AnimatorListenerAdapter {
    final /* synthetic */ TooltipView a;

    public dzdz(TooltipView tooltipView) {
        this.a = tooltipView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws Resources.NotFoundException {
        Animator animatorA = this.a.a();
        animatorA.addListener(new dzdy(this));
        animatorA.start();
    }
}
