package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcbt implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ fbrg b;
    final /* synthetic */ fcbv c;

    public fcbt(fcbv fcbvVar, Status status, fbrg fbrgVar) {
        this.a = status;
        this.b = fbrgVar;
        this.c = fcbvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.a(this.a, this.b);
    }
}
