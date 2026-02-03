package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebys implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ebyv a;

    public ebys(ebyv ebyvVar) {
        this.a = ebyvVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ebyv ebyvVar = this.a;
        ebyvVar.c();
        if (ebyvVar.l == null) {
            ebyvVar.l = new ebyr(ebyvVar);
            ebyvVar.j.y(ebyvVar.l);
        }
        ebyvVar.j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
