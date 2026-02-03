package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vi implements Runnable {
    final /* synthetic */ RecyclerView a;

    public vi(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.a;
        vv vvVar = recyclerView.E;
        if (vvVar != null) {
            vvVar.d();
        }
        recyclerView.Q = false;
    }
}
