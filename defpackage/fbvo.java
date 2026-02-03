package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbvo implements eora {
    final /* synthetic */ fbsm a;
    final /* synthetic */ fbwy b;
    final /* synthetic */ fbrg c;
    final /* synthetic */ fbsn d;

    public fbvo(fbsm fbsmVar, fbwy fbwyVar, fbrg fbrgVar, fbsn fbsnVar) {
        this.a = fbsmVar;
        this.b = fbwyVar;
        this.c = fbrgVar;
        this.d = fbsnVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Status status = (Status) obj;
        if (!status.f()) {
            this.a.a(status, new fbrg());
            return;
        }
        fbwy fbwyVar = this.b;
        fbsm fbsmVar = this.a;
        try {
            fbwyVar.a.set(this.d.a(fbsmVar, this.c));
            fbwyVar.f();
        } catch (RuntimeException e) {
            fbsmVar.a(Status.o.d(e).withDescription("Failed to start server call after authorization check"), new fbrg());
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        this.a.a(Status.o.d(th).withDescription("Authorization future failed"), new fbrg());
    }
}
