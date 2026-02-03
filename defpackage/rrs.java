package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rrs implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ ViewTreeObserver.OnDrawListener b;
    final /* synthetic */ rrt c;

    public rrs(rrt rrtVar, View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        this.a = view;
        this.b = onDrawListener;
        this.c = rrtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rox roxVarA = rox.a();
        rvk.j();
        roxVarA.c.set(true);
        rru rruVar = this.c.b;
        rruVar.b = true;
        this.a.getViewTreeObserver().removeOnDrawListener(this.b);
        rruVar.a.clear();
    }
}
