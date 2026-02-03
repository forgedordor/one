package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcah extends fcbf {
    final /* synthetic */ fbrg a;
    final /* synthetic */ fcal b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcah(fcal fcalVar, fbrg fbrgVar) {
        super(fcalVar.c.e);
        this.a = fbrgVar;
        this.b = fcalVar;
    }

    @Override // defpackage.fcbf
    public final void a() {
        int i = fcsr.a;
        fcal fcalVar = this.b;
        if (fcalVar.b != null) {
            return;
        }
        try {
            fcalVar.a.b(this.a);
        } catch (Throwable th) {
            this.b.b(Status.c.d(th).withDescription("Failed to read headers"));
        }
    }
}
