package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcen implements Runnable {
    final /* synthetic */ fcfd a;

    public fcen(fcfd fcfdVar) {
        this.a = fcfdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcfd fcfdVar = this.a;
        if (fcfdVar.r.a == fbnv.IDLE) {
            fcfdVar.d.a(2, "CONNECTING as requested");
            fcfdVar.b(fbnv.CONNECTING);
            fcfdVar.h();
        }
    }
}
