package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxfx implements dxft {
    public final Object a;

    public dxfx(Object obj) {
        this.a = obj;
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
        return (obj instanceof dxfx) && fdbq.f(this.a, ((dxfx) obj).a);
    }

    @Override // defpackage.dxft
    public final /* synthetic */ Throwable f() {
        return dxfs.d(this);
    }

    @Override // defpackage.dxft
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // defpackage.dxft
    public final /* synthetic */ boolean h() {
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // defpackage.dxft
    public final /* synthetic */ boolean i() {
        return true;
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
        return "Success(value=" + this.a + ")";
    }
}
