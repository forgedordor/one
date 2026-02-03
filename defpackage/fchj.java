package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fchj extends fbpk {
    final fchk b;

    public fchj(fchk fchkVar) {
        this.b = fchkVar;
    }

    @Override // defpackage.fbpk
    public final fbpj a() {
        ejwl.m(true, "config is not set");
        return new fbpj(Status.b, this.b);
    }
}
