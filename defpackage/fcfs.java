package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcfs implements Runnable {
    final /* synthetic */ fcgx a;

    public fcfs(fcgx fcgxVar) {
        this.a = fcgxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcgx fcgxVar = this.a;
        fcgxVar.H.a(2, "Entering SHUTDOWN state");
        fcgxVar.p.a(fbnv.SHUTDOWN);
    }
}
