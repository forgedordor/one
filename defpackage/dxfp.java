package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxfp implements dxfw {
    private final Throwable a;
    private final int b;

    public dxfp(Throwable th, int i) {
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
        if (!(obj instanceof dxfp)) {
            return false;
        }
        dxfp dxfpVar = (dxfp) obj;
        return fdbq.f(this.a, dxfpVar.a) && this.b == dxfpVar.b;
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
        return "GenericPermanentFailure(exception=" + this.a + ", failureType=" + ((Object) dxfr.a(this.b)) + ")";
    }

    public dxfp(String str, int i) {
        this(new Exception(str), i);
    }

    public /* synthetic */ dxfp(Throwable th) {
        this(th, 1);
    }

    public /* synthetic */ dxfp(String str) {
        this(str, 1);
    }
}
