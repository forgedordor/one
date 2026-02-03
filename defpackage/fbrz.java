package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fbrz extends fbng {
    @Override // defpackage.fbng
    public void a(Status status, fbrg fbrgVar) {
        h().a(status, fbrgVar);
    }

    @Override // defpackage.fbng
    public void b(fbrg fbrgVar) {
        h().b(fbrgVar);
    }

    @Override // defpackage.fbng
    public final void d() {
        h().d();
    }

    protected abstract fbng h();

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("delegate", h());
        return ejwfVarB.toString();
    }
}
