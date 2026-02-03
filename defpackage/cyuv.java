package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyuv extends wg {
    final /* synthetic */ cyuw a;

    public cyuv(cyuw cyuwVar) {
        this.a = cyuwVar;
    }

    @Override // defpackage.wg
    public final void a(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.o;
        cyuw cyuwVar = this.a;
        if (linearLayoutManager != null) {
            int iL = linearLayoutManager.L();
            View viewT = linearLayoutManager.T(iL);
            if (iL <= 0 && viewT != null && viewT.getTop() >= 0) {
                cyuwVar.b.setVisibility(8);
                return;
            }
        }
        cyuwVar.b.setVisibility(0);
    }

    @Override // defpackage.wg
    public final void b(RecyclerView recyclerView, int i) {
    }
}
