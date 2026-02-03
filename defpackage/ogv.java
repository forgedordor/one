package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.DefaultTimeBar;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ogv extends AnimatorListenerAdapter {
    final /* synthetic */ ohe a;

    public ogv(ohe oheVar) {
        this.a = oheVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ohe oheVar = this.a;
        View view = oheVar.b;
        if (view != null) {
            view.setVisibility(4);
        }
        ViewGroup viewGroup = oheVar.c;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        ViewGroup viewGroup2 = oheVar.e;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(4);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ohe oheVar = this.a;
        View view = oheVar.j;
        if (!(view instanceof DefaultTimeBar) || oheVar.t) {
            return;
        }
        DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
        if (defaultTimeBar.b.isStarted()) {
            defaultTimeBar.b.cancel();
        }
        defaultTimeBar.b.setFloatValues(defaultTimeBar.c, 0.0f);
        defaultTimeBar.b.setDuration(250L);
        defaultTimeBar.b.start();
    }
}
