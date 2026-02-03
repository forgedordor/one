package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxqo implements dxqp {
    private final Throwable a;
    private final int b = 35;

    public dxqo(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.dxfo
    public final Throwable a() {
        return this.a;
    }

    @Override // defpackage.dxfo
    public final int b() {
        return 35;
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
        if (!(obj instanceof dxqo)) {
            return false;
        }
        dxqo dxqoVar = (dxqo) obj;
        if (!fdbq.f(this.a, dxqoVar.a)) {
            return false;
        }
        int i = dxqoVar.b;
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
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 35;
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

    public final String toString() {
        return "HttpTokenResetFailure(exception=" + this.a + ", failureType=TOKEN_RESET_FAILURE)";
    }
}
