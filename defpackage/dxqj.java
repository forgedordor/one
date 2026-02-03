package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxqj implements dxfz, dxqi {
    private final Throwable a;
    private final dxvi b;
    private final int c;

    public dxqj(Throwable th, dxvi dxviVar, int i) {
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
        if (!(obj instanceof dxqj)) {
            return false;
        }
        dxqj dxqjVar = (dxqj) obj;
        return fdbq.f(this.a, dxqjVar.a) && fdbq.f(this.b, dxqjVar.b) && this.c == dxqjVar.c;
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
        return false;
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
        return true;
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
        return "AuthTransientFailure(exception=" + this.a + ", account=" + this.b + ", failureType=" + ((Object) dxfr.a(this.c)) + ")";
    }
}
