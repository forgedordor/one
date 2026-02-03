package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qza implements Runnable {
    final /* synthetic */ qzo a;
    final /* synthetic */ qzb b;

    public qza(qzb qzbVar, qzo qzoVar) {
        this.a = qzoVar;
        this.b = qzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        try {
            this.b.a.put(this.a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
