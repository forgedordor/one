package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.tooltip.TooltipView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzdy extends AnimatorListenerAdapter {
    final /* synthetic */ dzdz a;

    public dzdy(dzdz dzdzVar) {
        this.a = dzdzVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        TooltipView tooltipView = this.a.a;
        Activity activity = (Activity) ((SelectedAccountDisc) tooltipView.a).i.get();
        if (activity == null || !activity.isFinishing()) {
            tooltipView.c.a();
            tooltipView.b.removeView(tooltipView.i);
        }
    }
}
