package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcls implements Runnable {
    final /* synthetic */ fclu a;

    public fcls(fclu fcluVar) {
        this.a = fcluVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.o(Status.c.withDescription("Handshake timeout exceeded"));
    }
}
