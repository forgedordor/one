package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcbi implements Runnable {
    final /* synthetic */ StringBuilder a;
    final /* synthetic */ fcbw b;

    public fcbi(fcbw fcbwVar, StringBuilder sb) {
        this.a = sb;
        this.b = fcbwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.g(Status.f.withDescription(this.a.toString()), true);
    }
}
