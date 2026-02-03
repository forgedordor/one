package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcgd implements Runnable {
    final /* synthetic */ fcgx a;

    public fcgd(fcgx fcgxVar) {
        this.a = fcgxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcgx fcgxVar = this.a;
        if (fcgxVar.u == null) {
            return;
        }
        fcgxVar.j();
    }
}
