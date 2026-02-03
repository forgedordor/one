package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtkz implements View.OnLayoutChangeListener {
    final /* synthetic */ Runnable a;
    final /* synthetic */ dtli b;

    public dtkz(dtli dtliVar, Runnable runnable) {
        this.a = runnable;
        this.b = dtliVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.run();
        dtli dtliVar = this.b;
        dtliVar.m();
        ObjectAnimator duration = ObjectAnimator.ofFloat(dtliVar.g.a(), "alpha", 0.0f, 1.0f).setDuration(350L);
        duration.setInterpolator(dtliVar.b(dtcc.a, 0.0f));
        Rect rect = dtliVar.a;
        float fExactCenterX = rect.exactCenterX();
        dtlm dtlmVar = dtliVar.e;
        float f = fExactCenterX - dtlmVar.h;
        float fExactCenterY = rect.exactCenterY() - dtlmVar.i;
        dtlk dtlkVar = dtliVar.f;
        Animator animatorB = dtlmVar.b(f, fExactCenterY, 0.0f);
        Animator animatorB2 = dtlkVar.b(0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, animatorB, animatorB2);
        animatorSet.addListener(new dtlc(dtliVar));
        dtliVar.n(animatorSet);
        dtliVar.removeOnLayoutChangeListener(this);
    }
}
