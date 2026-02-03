package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aomt implements View.OnAttachStateChangeListener {
    final /* synthetic */ aomv a;

    public aomt(aomv aomvVar) {
        this.a = aomvVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        aomv aomvVar = this.a;
        if (view.equals(aomvVar.g)) {
            aomvVar.e();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
