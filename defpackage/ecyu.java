package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecyu extends wg {
    final /* synthetic */ GridLayoutManager a;
    final /* synthetic */ ecyv b;

    public ecyu(ecyv ecyvVar, GridLayoutManager gridLayoutManager) {
        this.a = gridLayoutManager;
        this.b = ecyvVar;
    }

    @Override // defpackage.wg
    public final void a(RecyclerView recyclerView, int i, int i2) {
        int iM = this.a.M() + 50;
        ecyv ecyvVar = this.b;
        if (iM > ecyvVar.an) {
            ecyvVar.am.a(iM);
            ecyvVar.an = iM;
        }
    }

    @Override // defpackage.wg
    public final void b(RecyclerView recyclerView, int i) {
    }
}
