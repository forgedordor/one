package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vh implements Runnable {
    final /* synthetic */ RecyclerView a;

    public vh(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.a;
        if (!recyclerView.t || recyclerView.isLayoutRequested()) {
            return;
        }
        if (!recyclerView.r) {
            recyclerView.requestLayout();
        } else if (recyclerView.v) {
            recyclerView.u = true;
        } else {
            recyclerView.E();
        }
    }
}
