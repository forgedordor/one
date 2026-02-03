package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcdi implements fcaq {
    final Status a;
    private final fcao b;

    public fcdi(Status status, fcao fcaoVar) {
        ejwl.b(!status.f(), "error must not be OK");
        this.a = status;
        this.b = fcaoVar;
    }

    @Override // defpackage.fbpt
    public final fbpn c() {
        throw new UnsupportedOperationException("Not a real transport");
    }

    @Override // defpackage.fcaq
    public final fcan d(fbrk fbrkVar, fbrg fbrgVar, fbnc fbncVar, fbnm[] fbnmVarArr) {
        return new fcdh(this.a, this.b, fbnmVarArr);
    }
}
