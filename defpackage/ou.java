package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ou implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ow a;

    public ou(ow owVar) {
        this.a = owVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ow owVar = this.a;
        if (owVar.x()) {
            uv uvVar = owVar.a;
            if (uvVar.q) {
                return;
            }
            View view = owVar.c;
            if (view == null || !view.isShown()) {
                owVar.m();
            } else {
                uvVar.v();
            }
        }
    }
}
