package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcaj extends fcbf {
    final /* synthetic */ Status a;
    final /* synthetic */ fbrg b;
    final /* synthetic */ fcal c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcaj(fcal fcalVar, Status status, fbrg fbrgVar) {
        super(fcalVar.c.e);
        this.a = status;
        this.b = fbrgVar;
        this.c = fcalVar;
    }

    @Override // defpackage.fcbf
    public final void a() {
        int i = fcsr.a;
        fcal fcalVar = this.c;
        fcalVar.c.f.c();
        Status status = this.a;
        fbrg fbrgVar = this.b;
        Status status2 = fcalVar.b;
        if (status2 != null) {
            fbrgVar = new fbrg();
            status = status2;
        }
        try {
            fcam.g(fcalVar.a, status, fbrgVar);
        } finally {
            this.c.c.d.a(status.f());
        }
    }
}
