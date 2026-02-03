package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwhd {
    public final dkri a;
    public final chpq b;
    public final String c;
    public final boolean d;
    public final String e;
    public final fdae f;

    public cwhd(dkri dkriVar, chpq chpqVar, String str, boolean z, String str2, fdae fdaeVar) {
        chpqVar.getClass();
        this.a = dkriVar;
        this.b = chpqVar;
        this.c = str;
        this.d = z;
        this.e = str2;
        this.f = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwhd)) {
            return false;
        }
        cwhd cwhdVar = (cwhd) obj;
        return fdbq.f(this.a, cwhdVar.a) && this.b == cwhdVar.b && fdbq.f(this.c, cwhdVar.c) && this.d == cwhdVar.d && fdbq.f(this.e, cwhdVar.e) && fdbq.f(this.f, cwhdVar.f);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.e;
        int iHashCode2 = ((((iHashCode * 31) + (true != this.d ? 1237 : 1231)) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        fdae fdaeVar = this.f;
        return iHashCode2 + (fdaeVar != null ? fdaeVar.hashCode() : 0);
    }

    public final String toString() {
        return "PhotoUiData(monogramUiData=" + this.a + ", photoSource=" + this.b + ", title=" + this.c + ", isCurrentSelection=" + this.d + ", subTitle=" + this.e + ", onSubTitleClick=" + this.f + ")";
    }
}
