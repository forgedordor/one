package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eder extends wg {
    final /* synthetic */ edmy a;
    final /* synthetic */ edes b;

    public eder(edes edesVar, edmy edmyVar) {
        this.a = edmyVar;
        this.b = edesVar;
    }

    @Override // defpackage.wg
    public final void a(RecyclerView recyclerView, int i, int i2) {
        int iM = ((GridLayoutManager) recyclerView.o).M() + BasePaymentResult.ERROR_REQUEST_FAILED;
        edes edesVar = this.b;
        if (iM > edesVar.g) {
            this.a.a(iM);
            edesVar.g = iM;
        }
    }

    @Override // defpackage.wg
    public final void b(RecyclerView recyclerView, int i) {
    }
}
