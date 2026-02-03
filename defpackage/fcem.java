package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcem implements Runnable {
    final /* synthetic */ fcfd a;

    public fcem(fcfd fcfdVar) {
        this.a = fcfdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcfd fcfdVar = this.a;
        fcfdVar.k = null;
        fcfdVar.d.a(2, "CONNECTING after backoff");
        fcfdVar.b(fbnv.CONNECTING);
        fcfdVar.h();
    }
}
