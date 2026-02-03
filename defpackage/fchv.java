package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fchv extends fbmy {
    public final fcaq a;
    public final fbrk b;
    public final fbrg c;
    public final fbnc d;
    public final fbnm[] f;
    public fcan h;
    public boolean i;
    fccv j;
    private final fbzx k;
    public final Object g = new Object();
    public final fbog e = fbog.k();

    public fchv(fcaq fcaqVar, fbrk fbrkVar, fbrg fbrgVar, fbnc fbncVar, fbzx fbzxVar, fbnm[] fbnmVarArr) {
        this.a = fcaqVar;
        this.b = fbrkVar;
        this.c = fbrgVar;
        this.d = fbncVar;
        this.k = fbzxVar;
        this.f = fbnmVarArr;
    }

    @Override // defpackage.fbmy
    public final void a(Status status) {
        ejwl.b(!status.f(), "Cannot fail with OK status");
        ejwl.m(!this.i, "apply() or fail() already called");
        b(new fcdh(fcdy.b(status), this.f));
    }

    public final void b(fcan fcanVar) {
        boolean z;
        ejwl.m(!this.i, "already finalized");
        this.i = true;
        synchronized (this.g) {
            if (this.h == null) {
                this.h = fcanVar;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.k.a();
            return;
        }
        ejwl.m(this.j != null, "delayedStream is null");
        Runnable runnableQ = this.j.q(fcanVar);
        if (runnableQ != null) {
            runnableQ.run();
        }
        this.k.a();
    }
}
