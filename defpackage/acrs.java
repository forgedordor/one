package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acrs implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ acrt a;

    public acrs(acrt acrtVar) {
        this.a = acrtVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        return this.a.aL;
    }
}
