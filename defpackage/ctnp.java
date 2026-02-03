package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctnp {
    public final ajow a;
    public final ajow b;

    public ctnp(ajow ajowVar, ajow ajowVar2) {
        this.a = ajowVar;
        this.b = ajowVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctnp)) {
            return false;
        }
        ctnp ctnpVar = (ctnp) obj;
        return fdbq.f(this.a, ctnpVar.a) && fdbq.f(this.b, ctnpVar.b);
    }

    public final int hashCode() {
        ajow ajowVar = this.a;
        int iHashCode = ajowVar == null ? 0 : ajowVar.hashCode();
        ajow ajowVar2 = this.b;
        return (iHashCode * 31) + (ajowVar2 != null ? ajowVar2.hashCode() : 0);
    }

    public final String toString() {
        return "PagingKeyPair(prev=" + this.a + ", next=" + this.b + ")";
    }
}
