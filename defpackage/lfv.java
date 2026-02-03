package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lfv implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ lgb b;
    final /* synthetic */ lfr c;
    final /* synthetic */ ValueAnimator d;

    public lfv(View view, lgb lgbVar, lfr lfrVar, ValueAnimator valueAnimator) {
        this.a = view;
        this.b = lgbVar;
        this.c = lfrVar;
        this.d = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lfx.f(this.a, this.b, this.c);
        this.d.start();
    }
}
