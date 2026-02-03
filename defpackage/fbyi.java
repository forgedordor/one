package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbyi implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ fbzb b;

    public fbyi(fbzb fbzbVar, Status status) {
        this.a = status;
        this.b = fbzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fbzb fbzbVar = this.b;
        synchronized (fbzbVar) {
            fbzbVar.g(this.a);
            fbzbVar.h();
        }
    }
}
