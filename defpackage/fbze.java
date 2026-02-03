package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fbze extends fbzi {
    private boolean a;
    private boolean b;
    private Runnable c;
    private boolean d;
    public final fcmm j;
    public fcap k;
    public fboo l;
    public volatile boolean m;
    public boolean n;

    protected fbze(int i, fcmm fcmmVar, fcmu fcmuVar) {
        super(i, fcmmVar, fcmuVar);
        this.l = fboo.b;
        this.b = false;
        this.j = fcmmVar;
    }

    @Override // defpackage.fbzi
    protected final /* synthetic */ fcmp g() {
        return this.k;
    }

    public final void h(Status status, fcao fcaoVar, fbrg fbrgVar) {
        if (this.a) {
            return;
        }
        this.a = true;
        this.j.n();
        fcmu fcmuVar = this.q;
        if (status.f()) {
            fcmuVar.d++;
        } else {
            fcmuVar.e++;
        }
        this.k.a(status, fcaoVar, fbrgVar);
    }

    @Override // defpackage.fchn
    public void i(boolean z) {
        ejwl.m(this.n, "status should have been reported on deframer closed");
        this.b = true;
        if (this.d && z) {
            j(Status.o.withDescription("Encountered end-of-stream mid-frame"), true, new fbrg());
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
            this.c = null;
        }
    }

    public final void j(Status status, boolean z, fbrg fbrgVar) {
        k(status, fcao.PROCESSED, z, fbrgVar);
    }

    public final void k(Status status, fcao fcaoVar, boolean z, fbrg fbrgVar) {
        status.getClass();
        fbrgVar.getClass();
        if (this.n) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        this.n = true;
        this.d = status.f();
        synchronized (this.p) {
            this.t = true;
        }
        if (this.b) {
            this.c = null;
            h(status, fcaoVar, fbrgVar);
            return;
        }
        this.c = new fbzd(this, status, fcaoVar, fbrgVar);
        if (z) {
            this.o.close();
            return;
        }
        fchq fchqVar = (fchq) this.o;
        if (fchqVar.b()) {
            return;
        }
        if (fchqVar.c()) {
            fchqVar.close();
        } else {
            fchqVar.f = true;
        }
    }
}
