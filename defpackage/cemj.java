package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cemj implements eora {
    final /* synthetic */ ainv a;
    final /* synthetic */ cepz b;
    final /* synthetic */ cfrj c;
    final /* synthetic */ cemk d;

    public cemj(cemk cemkVar, ainv ainvVar, cepz cepzVar, cfrj cfrjVar) {
        this.a = ainvVar;
        this.b = cepzVar;
        this.c = cfrjVar;
        this.d = cemkVar;
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
        this.a.c();
        String str = ((ceob) ((ceoc) this.b).b).b;
        cemk cemkVar = this.d;
        if (str != null) {
            cemkVar.e.e(str, Status.b.getCode().value());
        }
        cfrj cfrjVar = this.c;
        if (cfrjVar.b().a() == cfrg.ANONYMOUS) {
            cemkVar.a.c(Status.b, cfrjVar);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        this.a.c();
        String str = ((ceob) ((ceoc) this.b).b).b;
        cemk cemkVar = this.d;
        if (str != null) {
            cemkVar.e.g(str, Status.c(th).getCode().value());
        }
        cfrj cfrjVar = this.c;
        cfrjVar.h(th);
        if (cfrjVar.b().a() == cfrg.ANONYMOUS) {
            cemkVar.a.c(Status.c(th), cfrjVar);
        }
    }
}
