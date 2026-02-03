package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcer implements Runnable {
    final /* synthetic */ fcfd a;

    public fcer(fcfd fcfdVar) {
        this.a = fcfdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcfd fcfdVar = this.a;
        fcfdVar.d.a(2, "Terminated");
        fcgx fcgxVar = ((fcgt) fcfdVar.a).b.j;
        fcgxVar.w.remove(fcfdVar);
        fbpi.c(fcgxVar.I.e, fcfdVar);
        fcgxVar.l();
    }
}
