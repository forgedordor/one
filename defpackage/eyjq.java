package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eyjq extends eyjh {
    private final eyjh b;

    public eyjq(eyjh eyjhVar) {
        this.b = eyjhVar;
    }

    @Override // defpackage.eyjh
    public final void b(Throwable th) {
        try {
            this.b.b(th);
        } catch (RuntimeException e) {
            eyjt.c(e, this.b, "failed", th);
        }
    }

    @Override // defpackage.eyjh
    public final void c() {
        try {
            this.b.c();
        } catch (RuntimeException e) {
            eyjt.e(e, this.b, "methodFinished");
        }
    }

    @Override // defpackage.eyjh
    public final void d() {
        try {
            this.b.d();
        } catch (RuntimeException e) {
            eyjt.e(e, this.b, "methodStarting");
        }
    }

    @Override // defpackage.eyjh
    public final void e() {
        try {
            this.b.e();
        } catch (RuntimeException e) {
            eyjt.e(e, this.b, "ready");
        }
    }

    @Override // defpackage.eyjh
    public final void f() {
        try {
            this.b.f();
        } catch (RuntimeException e) {
            eyjt.e(e, this.b, "requested");
        }
    }

    @Override // defpackage.eyjh
    public final void g(Object obj) {
        try {
            this.b.g(obj);
        } catch (RuntimeException e) {
            eyjt.c(e, this.b, "succeeded", obj);
        }
    }
}
