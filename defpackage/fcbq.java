package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcbq extends fcbf {
    final fbng a;
    final Status b;

    public fcbq(fcbw fcbwVar, fbng fbngVar, Status status) {
        super(fcbwVar.a);
        this.a = fbngVar;
        this.b = status;
    }

    @Override // defpackage.fcbf
    public final void a() {
        this.a.a(this.b, new fbrg());
    }
}
