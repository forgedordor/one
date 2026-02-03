package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cepo implements eora {
    final /* synthetic */ ainv a;
    final /* synthetic */ cepp b;
    final /* synthetic */ cepq c;

    public cepo(cepq cepqVar, ainv ainvVar, cepp ceppVar) {
        this.a = ainvVar;
        this.b = ceppVar;
        this.c = cepqVar;
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
        this.a.c();
        String str = ((ceob) this.b).b;
        if (str == null) {
            return;
        }
        cepq cepqVar = this.c;
        cepqVar.a.e(str, Status.b.getCode().value());
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        this.a.c();
        String str = ((ceob) this.b).b;
        if (str == null) {
            return;
        }
        cepq cepqVar = this.c;
        cepqVar.a.e(str, Status.c(th).getCode().value());
    }
}
