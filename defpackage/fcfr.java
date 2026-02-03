package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcfr implements Runnable {
    final /* synthetic */ fcgx a;

    public fcfr(fcgx fcgxVar) {
        this.a = fcgxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcgx fcgxVar = this.a;
        if (fcgxVar.B.get() || fcgxVar.u == null) {
            return;
        }
        fcgxVar.i(false);
        fcgxVar.j();
    }
}
