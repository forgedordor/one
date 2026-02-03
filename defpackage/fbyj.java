package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbyj extends fchx {
    final /* synthetic */ fcmm a;
    final /* synthetic */ Status b;

    public fbyj(fcmm fcmmVar, Status status) {
        this.a = fcmmVar;
        this.b = status;
    }

    @Override // defpackage.fchx, defpackage.fcan
    public final void m(fcap fcapVar) {
        fcmm fcmmVar = this.a;
        fcmmVar.a();
        fcmmVar.n();
        fcapVar.a(this.b, fcao.PROCESSED, new fbrg());
    }
}
