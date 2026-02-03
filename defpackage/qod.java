package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qod implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ qof a;

    public qod(qof qofVar) {
        this.a = qofVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        qof qofVar = this.a;
        qui quiVar = qofVar.j;
        if (quiVar != null) {
            quiVar.o(qofVar.b.c());
        }
    }
}
