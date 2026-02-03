package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzrp {
    public final qap a;
    public final Throwable b;

    public bzrp(qap qapVar, Throwable th) {
        this.a = qapVar;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzrp)) {
            return false;
        }
        bzrp bzrpVar = (bzrp) obj;
        return fdbq.f(this.a, bzrpVar.a) && fdbq.f(this.b, bzrpVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Throwable th = this.b;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "CmsMediaUploadResult(result=" + this.a + ", error=" + this.b + ")";
    }
}
