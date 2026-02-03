package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxnb implements dxfz {
    public final boolean a;
    private final Throwable b;
    private final int c;

    public dxnb(Throwable th, int i, boolean z) {
        this.b = th;
        this.c = i;
        this.a = z;
    }

    @Override // defpackage.dxfo
    public final Throwable a() {
        return this.b;
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
        if (!(obj instanceof dxnb)) {
            return false;
        }
        dxnb dxnbVar = (dxnb) obj;
        return fdbq.f(this.b, dxnbVar.b) && this.c == dxnbVar.c && this.a == dxnbVar.a;
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
        return (((this.b.hashCode() * 31) + this.c) * 31) + (true != this.a ? 1237 : 1231);
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
        return "TokenRegenerationFailure(exception=" + this.b + ", failureType=" + ((Object) dxfr.a(this.c)) + ", hasDeletedToken=" + this.a + ")";
    }
}
