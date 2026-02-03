package defpackage;

import com.google.android.gms.auth.UserRecoverableAuthException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxls implements dxfw {
    public final UserRecoverableAuthException a;
    public final int b;

    public dxls(UserRecoverableAuthException userRecoverableAuthException, int i) {
        this.a = userRecoverableAuthException;
        this.b = i;
    }

    @Override // defpackage.dxfo
    public final /* synthetic */ Throwable a() {
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
        if (!(obj instanceof dxls)) {
            return false;
        }
        dxls dxlsVar = (dxls) obj;
        return fdbq.f(this.a, dxlsVar.a) && this.b == dxlsVar.b;
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
        return "AuthTokenRecoverableFailure(exception=" + this.a + ", failureType=" + ((Object) dxfr.a(this.b)) + ")";
    }
}
