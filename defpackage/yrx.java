package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yrx implements dkgq {
    public final divn a;
    public final dkgq b;

    public yrx(divn divnVar, dkgq dkgqVar) {
        this.a = divnVar;
        this.b = dkgqVar;
    }

    @Override // defpackage.dkgq
    public final String a() {
        throw null;
    }

    @Override // defpackage.dkgq
    public final fdae b() {
        return this.a.b;
    }

    @Override // defpackage.dkgq
    public final fdae c() {
        throw null;
    }

    @Override // defpackage.dkgq
    public final boolean d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrx)) {
            return false;
        }
        yrx yrxVar = (yrx) obj;
        return fdbq.f(this.a, yrxVar.a) && fdbq.f(this.b, yrxVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dkgq dkgqVar = this.b;
        return iHashCode + (dkgqVar == null ? 0 : dkgqVar.hashCode());
    }

    public final String toString() {
        return "BugleBreadcrumbBubbleUiData(data=" + this.a + ", replacedData=" + this.b + ")";
    }
}
