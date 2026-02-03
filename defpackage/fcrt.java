package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcrt extends fcrs {
    private final fcsf a;
    private final fcrq b;

    public fcrt(fcsf fcsfVar, fcrq fcrqVar) {
        this.a = fcsfVar;
        this.b = fcrqVar;
        if (fcsfVar instanceof fcrx) {
            ((fcrx) fcsfVar).d(fcrqVar);
        }
    }

    @Override // defpackage.fbng
    public final void a(Status status, fbrg fbrgVar) {
        if (status.f()) {
            this.a.a();
        } else {
            this.a.b(new fbtf(status, fbrgVar));
        }
    }

    @Override // defpackage.fbng
    public final void c(Object obj) {
        this.a.c(obj);
        this.b.e();
    }

    @Override // defpackage.fcrs
    public final void e() {
        this.b.e();
    }

    @Override // defpackage.fbng
    public final void d() {
    }

    @Override // defpackage.fbng
    public final void b(fbrg fbrgVar) {
    }
}
