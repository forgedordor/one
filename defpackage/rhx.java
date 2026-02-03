package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rhx implements rhy, rvq {
    private static final lcd a = rvs.a(20, new rhw());
    private final rvu b = new rvt();
    private rhy c;
    private boolean d;
    private boolean e;

    static rhx d(rhy rhyVar) {
        rhx rhxVar = (rhx) a.a();
        rvi.f(rhxVar);
        rhxVar.e = false;
        rhxVar.d = true;
        rhxVar.c = rhyVar;
        return rhxVar;
    }

    @Override // defpackage.rhy
    public final int a() {
        return this.c.a();
    }

    @Override // defpackage.rhy
    public final Class b() {
        return this.c.b();
    }

    @Override // defpackage.rhy
    public final Object c() {
        return this.c.c();
    }

    @Override // defpackage.rhy
    public final synchronized void e() {
        this.b.a();
        this.e = true;
        if (this.d) {
            return;
        }
        this.c.e();
        this.c = null;
        a.b(this);
    }

    @Override // defpackage.rvq
    public final rvu eY() {
        return this.b;
    }

    final synchronized void f() {
        this.b.a();
        if (!this.d) {
            throw new IllegalStateException("Already unlocked");
        }
        this.d = false;
        if (this.e) {
            e();
        }
    }
}
