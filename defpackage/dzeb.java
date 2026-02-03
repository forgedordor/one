package defpackage;

import android.animation.Animator;
import android.content.res.Resources;
import android.view.animation.Animation;
import com.google.android.libraries.onegoogle.tooltip.TooltipView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzeb implements Animation.AnimationListener {
    final /* synthetic */ TooltipView a;

    public dzeb(TooltipView tooltipView) {
        this.a = tooltipView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) throws Resources.NotFoundException {
        Animator animatorA = this.a.a();
        animatorA.addListener(new dzea(this));
        animatorA.start();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
