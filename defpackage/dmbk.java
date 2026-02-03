package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmbk extends wg {
    final /* synthetic */ dmbl a;
    final /* synthetic */ wb b;

    public dmbk(dmbl dmblVar, wb wbVar) {
        this.a = dmblVar;
        this.b = wbVar;
    }

    @Override // defpackage.wg
    public final void a(RecyclerView recyclerView, int i, int i2) {
        dmbl dmblVar = this.a;
        if (dmblVar.b.h() || ((SpannedGridLayoutManager) this.b).d == 0) {
            recyclerView.ah(this);
            dmblVar.a.G();
        }
    }

    @Override // defpackage.wg
    public final void b(RecyclerView recyclerView, int i) {
    }
}
