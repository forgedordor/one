package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhcn implements Runnable {
    final /* synthetic */ fcxy a;
    final /* synthetic */ Exception b;

    public fhcn(fcxy fcxyVar, Exception exc) {
        this.a = fcxyVar;
        this.b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcym.c(this.a).w(fctl.a(this.b));
    }
}
