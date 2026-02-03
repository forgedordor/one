package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class celz implements eora {
    final /* synthetic */ ainv a;
    final /* synthetic */ cepz b;
    final /* synthetic */ cfrj c;
    final /* synthetic */ cema d;

    public celz(cema cemaVar, ainv ainvVar, cepz cepzVar, cfrj cfrjVar) {
        this.a = ainvVar;
        this.b = cepzVar;
        this.c = cfrjVar;
        this.d = cemaVar;
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
        this.a.c();
        String str = ((ceob) ((ceoc) this.b).b).b;
        cema cemaVar = this.d;
        if (str != null) {
            cemaVar.g.e(str, Status.b.getCode().value());
        }
        cfrj cfrjVar = this.c;
        if (cfrjVar.b().a() == cfrg.ANONYMOUS) {
            cemaVar.a.c(Status.b, cfrjVar);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        this.a.c();
        String str = ((ceob) ((ceoc) this.b).b).b;
        cema cemaVar = this.d;
        if (str != null) {
            cemaVar.g.g(str, Status.c(th).getCode().value());
        }
        cfrj cfrjVar = this.c;
        cfrjVar.h(th);
        if (cfrjVar.b().a() == cfrg.ANONYMOUS) {
            cemaVar.a.c(Status.c(th), cfrjVar);
        }
    }
}
