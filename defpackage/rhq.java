package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rhq implements rhy {
    public final boolean a;
    private final rhy b;
    private final rhp c;
    private final res d;
    private int e;
    private boolean f;

    public rhq(rhy rhyVar, boolean z, res resVar, rhp rhpVar) {
        rvi.f(rhyVar);
        this.b = rhyVar;
        this.a = z;
        this.d = resVar;
        rvi.f(rhpVar);
        this.c = rhpVar;
    }

    @Override // defpackage.rhy
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.rhy
    public final Class b() {
        return this.b.b();
    }

    @Override // defpackage.rhy
    public final Object c() {
        return this.b.c();
    }

    public final synchronized void d() {
        if (this.f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.e++;
    }

    @Override // defpackage.rhy
    public final synchronized void e() {
        if (this.e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f = true;
        this.b.e();
    }

    public final void f() {
        int i;
        synchronized (this) {
            int i2 = this.e;
            if (i2 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            i = i2 - 1;
            this.e = i;
        }
        if (i == 0) {
            rhp rhpVar = this.c;
            res resVar = this.d;
            rhh rhhVar = (rhh) rhpVar;
            rhhVar.h.d(resVar);
            if (this.a) {
                rhhVar.c.d(resVar, this);
            } else {
                rhhVar.e.a(this, false);
            }
        }
    }

    public final synchronized String toString() {
        rhy rhyVar;
        res resVar;
        rhyVar = this.b;
        resVar = this.d;
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.c.toString() + ", key=" + String.valueOf(resVar) + ", acquired=" + this.e + ", isRecycled=" + this.f + ", resource=" + rhyVar.toString() + "}";
    }
}
