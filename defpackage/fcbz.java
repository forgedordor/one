package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcbz implements Runnable {
    final /* synthetic */ fchl a;

    public fcbz(fchl fchlVar) {
        this.a = fchlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcgx fcgxVar = ((fcga) this.a).a;
        ejwl.m(fcgxVar.B.get(), "Channel must have been shut down");
        fcgxVar.C = true;
        fcgxVar.n(false);
        fcgxVar.l();
    }
}
