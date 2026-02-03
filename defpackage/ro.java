package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ro implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ rq a;

    public ro(rq rqVar) {
        this.a = rqVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        rq rqVar = this.a;
        ru ruVar = rqVar.d;
        if (!ruVar.isAttachedToWindow() || !ruVar.getGlobalVisibleRect(rqVar.c)) {
            rqVar.m();
        } else {
            rqVar.n();
            super/*us*/.v();
        }
    }
}
