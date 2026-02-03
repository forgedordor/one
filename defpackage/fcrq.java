package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcrq extends fcrp {
    private final fbnh a;
    private boolean b = false;
    private boolean c = false;

    public fcrq(fbnh fbnhVar) {
        this.a = fbnhVar;
    }

    @Override // defpackage.fcsf
    public final void a() {
        this.a.d();
        this.c = true;
    }

    @Override // defpackage.fcsf
    public final void b(Throwable th) {
        this.a.c("Cancelled by client with StreamObserver.onError()", th);
        this.b = true;
    }

    @Override // defpackage.fcsf
    public final void c(Object obj) {
        ejwl.m(!this.b, "Stream was terminated by error, no further calls are allowed");
        ejwl.m(!this.c, "Stream is already completed, no further calls are allowed");
        this.a.f(obj);
    }

    @Override // defpackage.fcrp
    public final void d(String str, Throwable th) {
        this.a.c(str, th);
    }

    public final void e() {
        this.a.e(1);
    }
}
