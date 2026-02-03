package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fbsa extends fbsm {
    @Override // defpackage.fbsm
    public void a(Status status, fbrg fbrgVar) {
        c().a(status, fbrgVar);
    }

    @Override // defpackage.fbsm
    public void b(fbrg fbrgVar) {
        c().b(fbrgVar);
    }

    protected abstract fbsm c();

    @Override // defpackage.fbsm
    public final fbmw f() {
        return c().f();
    }

    @Override // defpackage.fbsm
    public final void g(int i) {
        c().g(i);
    }

    @Override // defpackage.fbsm
    public final boolean h() {
        return c().h();
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("delegate", c());
        return ejwfVarB.toString();
    }
}
