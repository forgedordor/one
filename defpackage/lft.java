package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lft implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ lgb a;
    final /* synthetic */ lgt b;
    final /* synthetic */ lgt c;
    final /* synthetic */ int d;
    final /* synthetic */ View e;

    public lft(lgb lgbVar, lgt lgtVar, lgt lgtVar2, int i, View view) {
        this.a = lgbVar;
        this.b = lgtVar;
        this.c = lgtVar2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        lgb lgbVar = this.a;
        lgbVar.e(valueAnimator.getAnimatedFraction());
        float fA = lgbVar.a();
        Interpolator interpolator = lfx.a;
        int i = Build.VERSION.SDK_INT;
        lgt lgtVar = this.b;
        lgh lggVar = i >= 34 ? new lgg(lgtVar) : Build.VERSION.SDK_INT >= 31 ? new lgf(lgtVar) : Build.VERSION.SDK_INT >= 30 ? new lge(lgtVar) : Build.VERSION.SDK_INT >= 29 ? new lgd(lgtVar) : new lgc(lgtVar);
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((this.d & i2) == 0) {
                lggVar.g(i2, lgtVar.f(i2));
            } else {
                lgt lgtVar2 = this.c;
                kzc kzcVarF = lgtVar.f(i2);
                kzc kzcVarF2 = lgtVar2.f(i2);
                float f = 1.0f - fA;
                lggVar.g(i2, lgt.i(kzcVarF, (int) (((kzcVarF.b - kzcVarF2.b) * f) + 0.5d), (int) (((kzcVarF.c - kzcVarF2.c) * f) + 0.5d), (int) (((kzcVarF.d - kzcVarF2.d) * f) + 0.5d), (int) (((kzcVarF.e - kzcVarF2.e) * f) + 0.5d)));
            }
        }
        lfx.e(this.e, lggVar.a(), Collections.singletonList(lgbVar));
    }
}
