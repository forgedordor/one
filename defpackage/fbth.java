package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbth implements Runnable {
    final /* synthetic */ fbti a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ fbtk c;

    public fbth(fbtk fbtkVar, fbti fbtiVar, Runnable runnable) {
        this.a = fbtiVar;
        this.b = runnable;
        this.c = fbtkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.execute(this.a);
    }

    public final String toString() {
        return String.valueOf(this.b.toString()).concat("(scheduled in SynchronizationContext)");
    }
}
