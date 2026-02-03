package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lfu extends AnimatorListenerAdapter {
    final /* synthetic */ lgb a;
    final /* synthetic */ View b;

    public lfu(lgb lgbVar, View view) {
        this.a = lgbVar;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        lgb lgbVar = this.a;
        lgbVar.e(1.0f);
        lfx.c(this.b, lgbVar);
    }
}
