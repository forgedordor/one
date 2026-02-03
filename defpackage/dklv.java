package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dklv implements dkky {
    public final String a;
    public final fdae b;
    public final fdae c;
    public final boolean d;
    public final String e;
    public final Integer f;
    public final boolean g;
    public final boolean h;

    public /* synthetic */ dklv(String str, fdae fdaeVar, fdae fdaeVar2, boolean z, String str2, Integer num, boolean z2, boolean z3, int i) {
        str.getClass();
        this.a = str;
        this.b = (i & 2) != 0 ? null : fdaeVar;
        this.c = (i & 4) != 0 ? null : fdaeVar2;
        this.d = ((i & 8) == 0) & z;
        this.e = (i & 16) != 0 ? null : str2;
        this.f = (i & 32) != 0 ? null : num;
        this.g = ((i & 64) == 0) & z2;
        this.h = ((i & 128) == 0) & z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dklv)) {
            return false;
        }
        dklv dklvVar = (dklv) obj;
        return fdbq.f(this.a, dklvVar.a) && fdbq.f(this.b, dklvVar.b) && fdbq.f(this.c, dklvVar.c) && this.d == dklvVar.d && fdbq.f(this.e, dklvVar.e) && fdbq.f(this.f, dklvVar.f) && this.g == dklvVar.g && this.h == dklvVar.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        fdae fdaeVar = this.b;
        int iHashCode2 = (iHashCode + (fdaeVar == null ? 0 : fdaeVar.hashCode())) * 31;
        fdae fdaeVar2 = this.c;
        int iHashCode3 = (((iHashCode2 + (fdaeVar2 == null ? 0 : fdaeVar2.hashCode())) * 31) + dklu.a(this.d)) * 31;
        String str = this.e;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f;
        return ((((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31) + dklu.a(this.g)) * 31) + dklu.a(this.h);
    }

    public final String toString() {
        return "MetatextTextItemUiData(text=" + this.a + ", onClick=" + this.b + ", onLayout=" + this.c + ", shouldTruncate=" + this.d + ", colorIdentifier=" + this.e + ", colorInt=" + this.f + ", useMediumWeight=" + this.g + ", ellipseLastItem=" + this.h + ")";
    }
}
