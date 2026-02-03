package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rrt implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ rru b;

    public rrt(rru rruVar, View view) {
        this.a = view;
        this.b = rruVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        rvk.k(new rrs(this, this.a, this));
    }
}
