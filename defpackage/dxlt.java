package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxlt implements dxfz {
    public final IOException a;
    public final int b;

    public dxlt(IOException iOException, int i) {
        this.a = iOException;
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
        if (!(obj instanceof dxlt)) {
            return false;
        }
        dxlt dxltVar = (dxlt) obj;
        return fdbq.f(this.a, dxltVar.a) && this.b == dxltVar.b;
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
        return (this.a.hashCode() * 31) + this.b;
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
        return "AuthTokenTransientFailure(exception=" + this.a + ", failureType=" + ((Object) dxfr.a(this.b)) + ")";
    }
}
