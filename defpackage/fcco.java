package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcco implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ fccv b;

    public fcco(fccv fccvVar, Status status) {
        this.a = status;
        this.b = fccvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.c(this.a);
    }
}
