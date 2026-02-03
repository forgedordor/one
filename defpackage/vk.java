package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vk {
    public final /* synthetic */ RecyclerView a;

    public vk(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(wv wvVar, vu vuVar, vu vuVar2) {
        wvVar.n(false);
        RecyclerView recyclerView = this.a;
        if (recyclerView.E.n(wvVar, vuVar, vuVar2)) {
            recyclerView.Z();
        }
    }

    public final void b(wv wvVar, vu vuVar, vu vuVar2) {
        RecyclerView recyclerView = this.a;
        recyclerView.e.o(wvVar);
        recyclerView.u(wvVar);
        wvVar.n(false);
        if (recyclerView.E.p(wvVar, vuVar, vuVar2)) {
            recyclerView.Z();
        }
    }

    public final void c(wv wvVar) {
        RecyclerView recyclerView = this.a;
        recyclerView.o.aY(wvVar.a, recyclerView.e);
    }
}
