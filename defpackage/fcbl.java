package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcbl implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ fcbw b;

    public fcbl(fcbw fcbwVar, Status status) {
        this.a = status;
        this.b = fcbwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fbnh fbnhVar = this.b.b;
        Status status = this.a;
        fbnhVar.c(status.getDescription(), status.t);
    }
}
