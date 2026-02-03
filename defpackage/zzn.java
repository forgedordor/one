package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzn {
    public final String a;
    public final String b;
    public final fdae c;
    public final djrr d;

    public zzn(String str, String str2, fdae fdaeVar, djrr djrrVar) {
        this.a = str;
        this.b = str2;
        this.c = fdaeVar;
        this.d = djrrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzn)) {
            return false;
        }
        zzn zznVar = (zzn) obj;
        return fdbq.f(this.a, zznVar.a) && fdbq.f(this.b, zznVar.b) && fdbq.f(this.c, zznVar.c) && this.d == zznVar.d;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        djrr djrrVar = this.d;
        return (iHashCode * 31) + (djrrVar == null ? 0 : djrrVar.hashCode());
    }

    public final String toString() {
        return "RadioButtonsListItemUiData(title=" + this.a + ", subtitle=" + this.b + ", onClick=" + this.c + ", icon=" + this.d + ")";
    }
}
