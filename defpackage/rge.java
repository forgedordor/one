package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rge implements Runnable {
    final /* synthetic */ rgh a;

    public rge(rgh rghVar) {
        this.a = rghVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            rgh rghVar = this.a;
            boolean z = rghVar.c;
            try {
                rghVar.c((rgg) rghVar.b.remove());
                rgf rgfVar = rghVar.d;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
