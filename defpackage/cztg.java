package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cztg implements ViewTreeObserver.OnWindowFocusChangeListener {
    final /* synthetic */ czte a;

    public cztg(czte czteVar) {
        this.a = czteVar;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            this.a.l();
        }
    }
}
