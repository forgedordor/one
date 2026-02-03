package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.DefaultTimeBar;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ogw extends AnimatorListenerAdapter {
    final /* synthetic */ ohe a;

    public ogw(ohe oheVar) {
        this.a = oheVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ohe oheVar = this.a;
        View view = oheVar.b;
        if (view != null) {
            view.setVisibility(0);
        }
        ViewGroup viewGroup = oheVar.c;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        ViewGroup viewGroup2 = oheVar.e;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(true != oheVar.t ? 4 : 0);
        }
        View view2 = oheVar.j;
        if (!(view2 instanceof DefaultTimeBar) || oheVar.t) {
            return;
        }
        DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view2;
        if (defaultTimeBar.b.isStarted()) {
            defaultTimeBar.b.cancel();
        }
        defaultTimeBar.d = false;
        defaultTimeBar.b.setFloatValues(defaultTimeBar.c, 1.0f);
        defaultTimeBar.b.setDuration(250L);
        defaultTimeBar.b.start();
    }
}
