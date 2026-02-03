package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edfk extends wg {
    final /* synthetic */ GridLayoutManager a;
    final /* synthetic */ edna b;
    final /* synthetic */ edfl c;

    public edfk(edfl edflVar, GridLayoutManager gridLayoutManager, edna ednaVar) {
        this.a = gridLayoutManager;
        this.b = ednaVar;
        this.c = edflVar;
    }

    @Override // defpackage.wg
    public final void a(RecyclerView recyclerView, int i, int i2) {
        int iM = this.a.M() + BasePaymentResult.ERROR_REQUEST_FAILED;
        edfl edflVar = this.c;
        if (iM > edflVar.g) {
            this.b.b(iM);
            edflVar.g = iM;
        }
    }

    @Override // defpackage.wg
    public final void b(RecyclerView recyclerView, int i) {
    }
}
