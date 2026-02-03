package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcal implements fcap {
    public final fbng a;
    public Status b;
    final /* synthetic */ fcam c;

    public fcal(fcam fcamVar, fbng fbngVar) {
        this.c = fcamVar;
        this.a = fbngVar;
    }

    @Override // defpackage.fcap
    public final void a(Status status, fcao fcaoVar, fbrg fbrgVar) {
        int i = fcsr.a;
        fcam fcamVar = this.c;
        fbol fbolVarB = fcamVar.b();
        if (status.getCode() == Status.Code.CANCELLED && fbolVarB != null && fbolVarB.g()) {
            status = fcamVar.f.b();
            fbrgVar = new fbrg();
        }
        fcamVar.c.execute(new fcaj(this, status, fbrgVar));
    }

    public final void b(Status status) {
        this.b = status;
        this.c.h.c(status);
    }

    @Override // defpackage.fcap
    public final void c(fbrg fbrgVar) {
        int i = fcsr.a;
        this.c.c.execute(new fcah(this, fbrgVar));
    }

    @Override // defpackage.fcmp
    public final void d(fcmo fcmoVar) {
        int i = fcsr.a;
        this.c.c.execute(new fcai(this, fcmoVar));
    }

    @Override // defpackage.fcmp
    public final void e() {
        fcam fcamVar = this.c;
        if (fcamVar.b.a.a()) {
            return;
        }
        int i = fcsr.a;
        fcamVar.c.execute(new fcak(this));
    }
}
