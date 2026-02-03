package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcgg implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ fcgi b;

    public fcgg(fcgi fcgiVar, Status status) {
        this.a = status;
        this.b = fcgiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.d(this.a);
    }
}
