package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwwi implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ cwwk a;

    public cwwi(cwwk cwwkVar) {
        this.a = cwwkVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        cwwk cwwkVar = this.a;
        afxx afxxVar = (afxx) cwwkVar.b.b();
        envd envdVar = cwwkVar.n;
        envdVar.getClass();
        afxxVar.c(4, envdVar);
        cwwkVar.i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
