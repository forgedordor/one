package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ozh implements Runnable {
    final /* synthetic */ ozm a;

    public ozh(ozm ozmVar) {
        this.a = ozmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.a.c;
        recyclerView.focusableViewAvailable(recyclerView);
    }
}
