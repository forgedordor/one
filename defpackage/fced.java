package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fced implements Runnable {
    final /* synthetic */ fcfi a;

    public fced(fcfi fcfiVar) {
        this.a = fcfiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.a.o(Status.p.withDescription("Keepalive failed. The connection is likely gone"));
    }
}
