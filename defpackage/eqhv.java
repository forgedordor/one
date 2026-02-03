package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqhv {
    public final String a;
    public final String b;

    public eqhv(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqhv)) {
            return false;
        }
        eqhv eqhvVar = (eqhv) obj;
        return fdbq.f(this.a, eqhvVar.a) && fdbq.f(this.b, eqhvVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Capability(name=" + this.a + ", value=" + this.b + ")";
    }
}
