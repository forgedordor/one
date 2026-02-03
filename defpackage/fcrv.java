package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcrv extends fcrs {
    private final fcrr a;
    private Object b;
    private boolean c = false;

    public fcrv(fcrr fcrrVar) {
        this.a = fcrrVar;
    }

    @Override // defpackage.fbng
    public final void a(Status status, fbrg fbrgVar) {
        if (!status.f()) {
            this.a.setException(new fbtf(status, fbrgVar));
            return;
        }
        if (!this.c) {
            this.a.setException(new fbtf(Status.o.withDescription("No value received for unary call"), fbrgVar));
        }
        this.a.set(this.b);
    }

    @Override // defpackage.fbng
    public final void c(Object obj) {
        if (this.c) {
            throw new fbtf(Status.o.withDescription("More than one value received for unary call"));
        }
        this.b = obj;
        this.c = true;
    }

    @Override // defpackage.fcrs
    public final void e() {
        this.a.a.e(2);
    }

    @Override // defpackage.fbng
    public final void b(fbrg fbrgVar) {
    }
}
