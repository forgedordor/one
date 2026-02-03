package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgs implements fbh {
    final /* synthetic */ fdae a;
    final /* synthetic */ flr b;
    final /* synthetic */ long c;
    private long d = 0;
    private long e = 0;

    public fgs(fdae fdaeVar, flr flrVar, long j) {
        this.a = fdaeVar;
        this.b = flrVar;
        this.c = j;
    }

    @Override // defpackage.fbh
    public final void a() {
        flr flrVar = this.b;
        if (fly.a(flrVar, this.c)) {
            flrVar.e();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ivy, java.lang.Object] */
    @Override // defpackage.fbh
    public final void b(long j) {
        ?? Invoke = this.a.invoke();
        if (Invoke != 0) {
            flr flrVar = this.b;
            long j2 = this.c;
            if (Invoke.u() && fly.a(flrVar, j2)) {
                long jE = ihs.e(this.e, j);
                this.e = jE;
                long jE2 = ihs.e(this.d, jE);
                if (flrVar.h(Invoke, jE2, this.d, fis.b, true)) {
                    this.d = jE2;
                    this.e = 0L;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ivy, java.lang.Object] */
    @Override // defpackage.fbh
    public final void c(long j) {
        ?? Invoke = this.a.invoke();
        if (Invoke != 0) {
            flr flrVar = this.b;
            if (!Invoke.u()) {
                return;
            }
            flrVar.f(Invoke, j, fis.b, true);
            this.d = j;
        }
        if (fly.a(this.b, this.c)) {
            this.e = 0L;
        }
    }

    @Override // defpackage.fbh
    public final void d() {
        flr flrVar = this.b;
        if (fly.a(flrVar, this.c)) {
            flrVar.e();
        }
    }

    @Override // defpackage.fbh
    public final void e() {
    }

    @Override // defpackage.fbh
    public final void f() {
    }
}
