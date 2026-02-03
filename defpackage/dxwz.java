package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxwz implements Runnable {
    final /* synthetic */ dxjh a;
    final /* synthetic */ int b;

    public dxwz(dxjh dxjhVar, int i) {
        this.a = dxjhVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a();
        ((eksl) ((eksl) dxxa.a.h()).h("com/google/android/libraries/notifications/platform/tiktok/executor/GnpExecutorApiImpl$2", "run", 128, "GnpExecutorApiImpl.java")).r("Finished Broadcast execution [%d].", this.b);
    }
}
