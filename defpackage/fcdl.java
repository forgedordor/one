package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fcdl implements fcap {
    @Override // defpackage.fcap
    public void a(Status status, fcao fcaoVar, fbrg fbrgVar) {
        throw null;
    }

    protected abstract fcap b();

    @Override // defpackage.fcap
    public final void c(fbrg fbrgVar) {
        b().c(fbrgVar);
    }

    @Override // defpackage.fcmp
    public final void d(fcmo fcmoVar) {
        b().d(fcmoVar);
    }

    @Override // defpackage.fcmp
    public final void e() {
        b().e();
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("delegate", b());
        return ejwfVarB.toString();
    }
}
