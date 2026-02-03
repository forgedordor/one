package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cryv {
    public final String a;
    public final String b;

    public cryv(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cryv)) {
            return false;
        }
        cryv cryvVar = (cryv) obj;
        return fdbq.f(this.a, cryvVar.a) && fdbq.f(this.b, cryvVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "UserIds(userId=" + this.a + ", urlUserId=" + this.b + ")";
    }
}
