package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tn implements Runnable {
    final /* synthetic */ tr a;

    public tn(tr trVar) {
        this.a = trVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tr trVar = this.a;
        int i = trVar.q;
        if (i == 1) {
            trVar.p.cancel();
        } else if (i != 2) {
            return;
        }
        trVar.q = 3;
        ValueAnimator valueAnimator = trVar.p;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.start();
    }
}
