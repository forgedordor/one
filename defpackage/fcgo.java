package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcgo implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ fcgq b;

    public fcgo(fcgq fcgqVar, Runnable runnable) {
        this.a = runnable;
        this.b = fcgqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
        fcgq fcgqVar = this.b;
        fcgqVar.f.c.m.execute(new fcgp(fcgqVar));
    }
}
