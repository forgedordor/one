package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.ScaleAnimation;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.tooltip.TooltipView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzdn implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ dzdp b;

    public dzdn(dzdp dzdpVar, View view) {
        this.a = view;
        this.b = dzdpVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.a;
        dyqy.a(view, this);
        Runnable runnable = new Runnable() { // from class: dzdm
            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                dzdp dzdpVar = this.a.b;
                final dzdt dzdtVar = dzdpVar.b;
                if (dzdtVar.d != null) {
                    dzdh dzdhVar = dzdtVar.a;
                    dzds dzdsVar = dzdtVar.b;
                    AccountParticleDisc accountParticleDisc = ((SelectedAccountDisc) dzdhVar).c;
                    accountParticleDisc.addOnAttachStateChangeListener(dzdsVar);
                    accountParticleDisc.getViewTreeObserver().addOnGlobalLayoutListener(dzdsVar);
                    final dzef dzefVar = new dzef(accountParticleDisc, new dzdq(dzdtVar));
                    dzdtVar.d.c.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: dzdr
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            dzef dzefVar2 = dzefVar;
                            ViewTreeObserver viewTreeObserver = dzefVar2.b.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(dzefVar2.a);
                            }
                            dzdtVar.c.onDismiss();
                        }
                    });
                    final TooltipView tooltipView = dzdtVar.d;
                    tooltipView.b(tooltipView.a.b());
                    tooltipView.b.addView(tooltipView.i);
                    dzed dzedVar = tooltipView.c;
                    dzedVar.setClippingEnabled(false);
                    dzedVar.setAnimationStyle(0);
                    dzedVar.setTouchable(true);
                    dzedVar.setBackgroundDrawable(new ColorDrawable(0));
                    tooltipView.measure(-2, -2);
                    tooltipView.d();
                    tooltipView.d.setAlpha(0.0f);
                    tooltipView.setBubbleWidthScale(0.0f);
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(tooltipView.getContext(), R.animator.og_tooltip_enter_animator);
                    animatorLoadAnimator.setTarget(tooltipView);
                    animatorLoadAnimator.start();
                    Resources resources = tooltipView.getContext().getResources();
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.83f, 1.05f, 0.83f, 1.05f, tooltipView.g - tooltipView.e, tooltipView.h - tooltipView.f);
                    scaleAnimation.setDuration(resources.getInteger(R.integer.og_tooltip_pulse_expand_duration_ms));
                    scaleAnimation.setInterpolator(dtcc.a);
                    ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.05f, 1.0f, 1.05f, 1.0f, tooltipView.g - tooltipView.e, tooltipView.h - tooltipView.f);
                    scaleAnimation2.setDuration(resources.getInteger(R.integer.og_tooltip_pulse_shrink_duration_ms));
                    scaleAnimation2.setInterpolator(dtcc.c);
                    scaleAnimation2.setAnimationListener(new dzeb(tooltipView));
                    scaleAnimation.setAnimationListener(new dzec(tooltipView, scaleAnimation2));
                    tooltipView.setAnimation(scaleAnimation);
                    tooltipView.setClipChildren(false);
                    dyrf.a(new Runnable() { // from class: dzdw
                        @Override // java.lang.Runnable
                        public final void run() {
                            ecem.c();
                            int[] iArr = ley.a;
                            TooltipView tooltipView2 = tooltipView;
                            AccountParticleDisc accountParticleDisc2 = ((SelectedAccountDisc) tooltipView2.a).c;
                            if (accountParticleDisc2.isAttachedToWindow()) {
                                tooltipView2.c.showAtLocation(accountParticleDisc2, 0, tooltipView2.e, tooltipView2.f);
                            }
                        }
                    });
                }
                dzdpVar.a = true;
            }
        };
        int[] iArr = ley.a;
        view.postOnAnimation(runnable);
    }
}
