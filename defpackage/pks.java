package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pks implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ pku a;
    final /* synthetic */ pkv b;

    public pks(pkv pkvVar, pku pkuVar) {
        this.b = pkvVar;
        this.a = pkuVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pku pkuVar = this.a;
        pkv.e(fFloatValue, pkuVar);
        pkv pkvVar = this.b;
        pkvVar.a(fFloatValue, pkuVar, false);
        pkvVar.invalidateSelf();
    }
}
