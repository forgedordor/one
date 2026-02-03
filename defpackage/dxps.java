package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxps implements dxfw, dxpo {
    private final Throwable a;
    private final boolean b;
    private final int c = 24;

    public dxps(Throwable th, boolean z) {
        this.a = th;
        this.b = z;
    }

    @Override // defpackage.dxfo
    public final Throwable a() {
        return this.a;
    }

    @Override // defpackage.dxfo
    public final int b() {
        return 24;
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
        if (!(obj instanceof dxps)) {
            return false;
        }
        dxps dxpsVar = (dxps) obj;
        if (!fdbq.f(this.a, dxpsVar.a) || this.b != dxpsVar.b) {
            return false;
        }
        int i = dxpsVar.c;
        return true;
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
        return (((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + 24;
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

    @Override // defpackage.dxpo
    public final boolean l() {
        return this.b;
    }

    public final String toString() {
        return "RegistrationPermanentAuthFailure(exception=" + this.a + ", isRegistrationStoredInBackend=" + this.b + ", failureType=BACKEND_AUTH_FAILURE)";
    }
}
