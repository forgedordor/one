package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eejb extends LinearLayoutManager {
    public eejb(int i) {
        super(i);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wb
    public final void aq(RecyclerView recyclerView, int i) {
        eeja eejaVar = new eeja(recyclerView.getContext());
        eejaVar.g = i;
        bi(eejaVar);
    }
}
