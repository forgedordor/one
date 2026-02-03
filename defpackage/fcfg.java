package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcfg implements Runnable {
    final /* synthetic */ fcfk a;

    public fcfg(fcfk fcfkVar) {
        this.a = fcfkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        fcfk fcfkVar = this.a;
        synchronized (fcfkVar) {
            if (fcfkVar.k != 6) {
                fcfkVar.k = 6;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            fcfk fcfkVar2 = this.a;
            fcfkVar2.l.a.o(Status.p.withDescription("Keepalive failed. The connection is likely gone"));
        }
    }
}
