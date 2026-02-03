package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djyn {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final fdae e;

    public djyn(String str, String str2, String str3, boolean z, fdae fdaeVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djyn)) {
            return false;
        }
        djyn djynVar = (djyn) obj;
        return fdbq.f(this.a, djynVar.a) && fdbq.f(this.b, djynVar.b) && fdbq.f(this.c, djynVar.c) && this.d == djynVar.d && fdbq.f(this.e, djynVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + (true != this.d ? 1237 : 1231)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "DynamicDropdownItem(title=" + this.a + ", subtitle=" + this.b + ", tertiaryText=" + this.c + ", isRichType=" + this.d + ", onClick=" + this.e + ")";
    }
}
