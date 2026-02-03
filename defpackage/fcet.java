package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcet extends fcdl {
    final /* synthetic */ fcap a;
    final /* synthetic */ fceu b;

    public fcet(fceu fceuVar, fcap fcapVar) {
        this.a = fcapVar;
        this.b = fceuVar;
    }

    @Override // defpackage.fcdl, defpackage.fcap
    public final void a(Status status, fcao fcaoVar, fbrg fbrgVar) {
        this.b.b.a.a(status.f());
        this.a.a(status, fcaoVar, fbrgVar);
    }

    @Override // defpackage.fcdl
    protected final fcap b() {
        return this.a;
    }
}
