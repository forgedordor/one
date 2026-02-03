package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtkw implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ dtli a;

    public dtkw(dtli dtliVar) {
        this.a = dtliVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        dtli dtliVar = this.a;
        View view = dtliVar.h;
        if (view == null) {
            return;
        }
        if (view.getVisibility() != 0) {
            dtliVar.d(6);
            return;
        }
        Rect rect = new Rect();
        dtliVar.h.getGlobalVisibleRect(rect);
        if (rect.equals(dtliVar.I)) {
            return;
        }
        dtliVar.I = rect;
        Rect rect2 = new Rect();
        dtliVar.h.getRootView().getGlobalVisibleRect(rect2);
        if (rect2.contains(dtliVar.I)) {
            dtliVar.requestLayout();
        } else {
            dtliVar.d(6);
        }
    }
}
