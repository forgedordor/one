package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fces implements Runnable {
    final /* synthetic */ fcbc a;
    final /* synthetic */ boolean b;
    final /* synthetic */ fcfd c;

    public fces(fcfd fcfdVar, fcbc fcbcVar, boolean z) {
        this.a = fcbcVar;
        this.b = z;
        this.c = fcfdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.o.c(this.a, this.b);
    }
}
