package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcey implements Runnable {
    final /* synthetic */ fcfb a;

    public fcey(fcfb fcfbVar) {
        this.a = fcfbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcfb fcfbVar = this.a;
        fcfd fcfdVar = fcfbVar.c;
        fcfdVar.u = null;
        if (fcfdVar.s != null) {
            ejwl.m(fcfdVar.q == null, "Unexpected non-null activeTransport");
            fcfbVar.a.n(fcfdVar.s);
            return;
        }
        fcbc fcbcVar = fcfdVar.p;
        fcbc fcbcVar2 = fcfbVar.a;
        if (fcbcVar == fcbcVar2) {
            fcfdVar.q = fcbcVar2;
            fcfdVar.p = null;
            fcfdVar.t = fcfdVar.h.a();
            fcfdVar.b(fbnv.READY);
        }
    }
}
