package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcsb extends fcsa {
    final fbsm a;
    volatile boolean b;
    private boolean c;
    private boolean d = false;
    private boolean e = false;

    public fcsb(fbsm fbsmVar) {
        this.a = fbsmVar;
    }

    @Override // defpackage.fcsf
    public final void a() {
        this.a.a(Status.b, new fbrg());
        this.e = true;
    }

    @Override // defpackage.fcsf
    public final void b(Throwable th) {
        fbrg fbrgVar = new fbrg();
        fbrg fbrgVarA = Status.a(th);
        if (fbrgVarA != null) {
            fbrgVar.g(fbrgVarA);
        }
        this.a.a(Status.c(th), fbrgVar);
        this.d = true;
    }

    @Override // defpackage.fcsf
    public final void c(Object obj) {
        ejwl.m(!this.d, "Stream was terminated by error, no further calls are allowed");
        ejwl.m(!this.e, "Stream is already completed, no further calls are allowed");
        if (!this.c) {
            this.a.b(new fbrg());
            this.c = true;
        }
        this.a.e(obj);
    }
}
