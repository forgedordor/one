package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rk implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ru a;

    public rk(ru ruVar) {
        this.a = ruVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ru ruVar = this.a;
        if (!ruVar.b.x()) {
            ruVar.b();
        }
        ViewTreeObserver viewTreeObserver = ruVar.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
