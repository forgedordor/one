package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aad implements Runnable {
    final /* synthetic */ aaj a;
    final /* synthetic */ int b;
    final /* synthetic */ aam c;

    public aad(aam aamVar, aaj aajVar, int i) {
        this.c = aamVar;
        this.a = aajVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aam aamVar = this.c;
        RecyclerView recyclerView = aamVar.m;
        if (recyclerView == null || !recyclerView.r) {
            return;
        }
        aaj aajVar = this.a;
        if (aajVar.n) {
            return;
        }
        wv wvVar = aajVar.h;
        if (wvVar.fs() != -1) {
            vv vvVar = aamVar.m.E;
            if (vvVar == null || !vvVar.i()) {
                List list = aamVar.l;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (((aaj) list.get(i)).o) {
                    }
                }
                aamVar.j.i(wvVar, this.b);
                return;
            }
            aamVar.m.post(this);
        }
    }
}
