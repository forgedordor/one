package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkbu implements djvp {
    public final String a;
    public final String b;
    public final fdae c;
    public final dlcr d;

    public dkbu(dlcr dlcrVar, String str, String str2, fdae fdaeVar) {
        this.d = dlcrVar;
        this.a = str;
        this.b = str2;
        this.c = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkbu)) {
            return false;
        }
        dkbu dkbuVar = (dkbu) obj;
        return fdbq.f(this.d, dkbuVar.d) && fdbq.f(this.a, dkbuVar.a) && fdbq.f(this.b, dkbuVar.b) && fdbq.f(this.c, dkbuVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() * 31) + this.a.hashCode();
        String str = this.b;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SimListItemUiData(simIcon=" + this.d + ", title=" + this.a + ", subtitle=" + this.b + ", onClick=" + this.c + ")";
    }
}
