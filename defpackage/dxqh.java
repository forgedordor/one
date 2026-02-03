package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxqh implements dxfw, dxqi {
    private final Throwable a;
    private final dxvi b;
    private final int c;

    public dxqh(Throwable th, dxvi dxviVar, int i) {
        dxviVar.getClass();
        this.a = th;
        this.b = dxviVar;
        this.c = i;
    }

    @Override // defpackage.dxfo
    public final Throwable a() {
        return this.a;
    }

    @Override // defpackage.dxfo
    public final int b() {
        return this.c;
    }

    @Override // defpackage.dxft
    public final /* synthetic */ Object c() {
        return dxfs.a(this);
    }

    @Override // defpackage.dxft
    public final /* synthetic */ Object d() {
        return dxfs.b(this);
    }

    @Override // defpackage.dxft
    public final /* synthetic */ String e() {
        return dxfs.c(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxqh)) {
            return false;
        }
        dxqh dxqhVar = (dxqh) obj;
        return fdbq.f(this.a, dxqhVar.a) && fdbq.f(this.b, dxqhVar.b) && this.c == dxqhVar.c;
    }

    @Override // defpackage.dxft
    public final /* synthetic */ Throwable f() {
        return dxfs.d(this);
    }

    @Override // defpackage.dxft
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // defpackage.dxft
    public final /* synthetic */ boolean h() {
        return true;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c;
    }

    @Override // defpackage.dxft
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.dxft
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // defpackage.dxft
    public final /* synthetic */ int k() {
        return dxfs.e(this);
    }

    @Override // defpackage.dxqi
    public final dxvi l() {
        return this.b;
    }

    public final String toString() {
        return "AuthPermanentFailure(exception=" + this.a + ", account=" + this.b + ", failureType=" + ((Object) dxfr.a(this.c)) + ")";
    }
}
