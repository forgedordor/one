package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxlr implements dxfw {
    public final Throwable a;
    public final int b;

    public dxlr(Throwable th, int i) {
        this.a = th;
        this.b = i;
    }

    @Override // defpackage.dxfo
    public final Throwable a() {
        return this.a;
    }

    @Override // defpackage.dxfo
    public final int b() {
        return this.b;
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
        if (!(obj instanceof dxlr)) {
            return false;
        }
        dxlr dxlrVar = (dxlr) obj;
        return fdbq.f(this.a, dxlrVar.a) && this.b == dxlrVar.b;
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
        return (this.a.hashCode() * 31) + this.b;
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

    public final String toString() {
        return "AuthTokenPermanentFailure(exception=" + this.a + ", failureType=" + ((Object) dxfr.a(this.b)) + ")";
    }
}
