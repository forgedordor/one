package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class znr {
    public final ajly a;
    public final ajly b;

    public znr(ajly ajlyVar, ajly ajlyVar2) {
        this.a = ajlyVar;
        this.b = ajlyVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znr)) {
            return false;
        }
        znr znrVar = (znr) obj;
        return fdbq.f(this.a, znrVar.a) && fdbq.f(this.b, znrVar.b);
    }

    public final int hashCode() {
        ajly ajlyVar = this.a;
        int iHashCode = ajlyVar == null ? 0 : ajlyVar.hashCode();
        ajly ajlyVar2 = this.b;
        return (iHashCode * 31) + (ajlyVar2 != null ? ajlyVar2.hashCode() : 0);
    }

    public final String toString() {
        return "PagingKeyPair(prev=" + this.a + ", next=" + this.b + ")";
    }
}
