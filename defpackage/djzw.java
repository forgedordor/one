package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djzw implements djvp {
    public final String a;
    public final String b;
    public final djrr c;
    public final boolean d;
    public final fdae e;

    public djzw(String str, String str2, djrr djrrVar, boolean z, fdae fdaeVar) {
        fdaeVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = djrrVar;
        this.d = z;
        this.e = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djzw)) {
            return false;
        }
        djzw djzwVar = (djzw) obj;
        return fdbq.f(this.a, djzwVar.a) && fdbq.f(this.b, djzwVar.b) && this.c == djzwVar.c && this.d == djzwVar.d && fdbq.f(this.e, djzwVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        djrr djrrVar = this.c;
        return ((((iHashCode2 + (djrrVar != null ? djrrVar.hashCode() : 0)) * 31) + (true != this.d ? 1237 : 1231)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "RadioButtonListItemUiData(title=" + this.a + ", subtitle=" + this.b + ", icon=" + this.c + ", isSelected=" + this.d + ", onClick=" + this.e + ")";
    }

    public /* synthetic */ djzw(String str, String str2, boolean z, fdae fdaeVar) {
        this(str, str2, null, z, fdaeVar);
    }
}
