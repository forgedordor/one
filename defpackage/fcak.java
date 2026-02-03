package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcak extends fcbf {
    final /* synthetic */ fcal a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcak(fcal fcalVar) {
        super(fcalVar.c.e);
        this.a = fcalVar;
    }

    @Override // defpackage.fcbf
    public final void a() {
        int i = fcsr.a;
        fcal fcalVar = this.a;
        if (fcalVar.b != null) {
            return;
        }
        try {
            fcalVar.a.d();
        } catch (Throwable th) {
            this.a.b(Status.c.d(th).withDescription("Failed to call onReady."));
        }
    }
}
