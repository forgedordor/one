package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djpw implements djpx {
    public final String a;
    public final boolean b;
    public final djrr c;
    public final fdae d;

    public /* synthetic */ djpw(String str, boolean z, djrr djrrVar, fdae fdaeVar, int i) {
        this.a = str;
        this.b = (!((i & 2) == 0)) | z;
        this.c = (i & 4) != 0 ? null : djrrVar;
        this.d = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djpw)) {
            return false;
        }
        djpw djpwVar = (djpw) obj;
        return fdbq.f(this.a, djpwVar.a) && this.b == djpwVar.b && this.c == djpwVar.c && fdbq.f(this.d, djpwVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        djrr djrrVar = this.c;
        return ((((iHashCode + (true != this.b ? 1237 : 1231)) * 31) + (djrrVar == null ? 0 : djrrVar.hashCode())) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Standard(text=" + this.a + ", enabled=" + this.b + ", icon=" + this.c + ", onClick=" + this.d + ")";
    }
}
