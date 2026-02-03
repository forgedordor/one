package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtku extends AnimatorListenerAdapter {
    final /* synthetic */ Runnable a;
    final /* synthetic */ dtli b;

    public dtku(dtli dtliVar, Runnable runnable) {
        this.a = runnable;
        this.b = dtliVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        dtli dtliVar = this.b;
        dtliVar.t = false;
        if (dtliVar.p()) {
            ((TextView) dtliVar.h).setTextColor(dtliVar.j);
        }
        if (dtliVar.q()) {
            dtliVar.h.setDrawingCacheEnabled(dtliVar.o);
        }
        dtliVar.setVisibility(8);
        dtliVar.q = null;
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.t = true;
    }
}
