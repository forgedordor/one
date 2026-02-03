package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsrs implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ dsrv a;

    public dsrs(dsrv dsrvVar) {
        this.a = dsrvVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.a();
        return true;
    }
}
