package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fcdm implements fcbc {
    protected abstract fcbc a();

    @Override // defpackage.fbpt
    public final fbpn c() {
        return a().c();
    }

    @Override // defpackage.fcaq
    public fcan d(fbrk fbrkVar, fbrg fbrgVar, fbnc fbncVar, fbnm[] fbnmVarArr) {
        throw null;
    }

    @Override // defpackage.fchm
    public final Runnable e(fchl fchlVar) {
        return a().e(fchlVar);
    }

    @Override // defpackage.fchm
    public void n(Status status) {
        a().n(status);
    }

    @Override // defpackage.fchm
    public final void o(Status status) {
        throw null;
    }

    @Override // defpackage.fcbc
    public final fbmw q() {
        return a().q();
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("delegate", a());
        return ejwfVarB.toString();
    }
}
