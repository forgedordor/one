package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nea implements nnr {
    private final mau a;

    public nea(mau mauVar) {
        this.a = mauVar;
    }

    @Override // defpackage.nnr
    public final int a(nns nnsVar, non nonVar) {
        return nnsVar.c(Alert.DURATION_SHOW_INDEFINITELY) == -1 ? -1 : 0;
    }

    @Override // defpackage.nnr
    public final void c(nnu nnuVar) {
        nox noxVarP = nnuVar.p(0, 3);
        nnuVar.w(new nop(-9223372036854775807L));
        nnuVar.r();
        mau mauVar = this.a;
        mat matVar = new mat(mauVar);
        matVar.c("text/x-unknown");
        matVar.j = mauVar.o;
        noxVarP.i(new mau(matVar));
    }

    @Override // defpackage.nnr
    public final boolean f(nns nnsVar) {
        return true;
    }

    @Override // defpackage.nnr
    public final /* synthetic */ List x() {
        int i = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.nnr
    public final void d() {
    }

    @Override // defpackage.nnr
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.nnr
    public final void e(long j, long j2) {
    }
}
