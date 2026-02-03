package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class juu {
    private final jyh a;

    public juu(jyh jyhVar) {
        this.a = jyhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof juu)) {
            return false;
        }
        jyh jyhVar = this.a;
        jyh jyhVar2 = ((juu) obj).a;
        return fdbq.f(jyhVar.a, jyhVar2.a) && jyhVar.b.x(jyhVar2.b) && fdbq.f(jyhVar.c, jyhVar2.c) && jyhVar.d == jyhVar2.d && jyhVar.e == jyhVar2.e && khx.a(jyhVar.f, jyhVar2.f) && fdbq.f(jyhVar.g, jyhVar2.g) && jyhVar.h == jyhVar2.h && jyhVar.i == jyhVar2.i && kil.g(jyhVar.j, jyhVar2.j);
    }

    public final int hashCode() {
        jyh jyhVar = this.a;
        int iHashCode = jyhVar.a.hashCode() * 31;
        jyq jyqVar = jyhVar.b;
        jxx jxxVar = jyqVar.b;
        long j = jxxVar.b;
        kcc kccVar = jxxVar.c;
        long j2 = kjl.a;
        int iA = ((kjk.a(j) * 31) + (kccVar != null ? kccVar.i : 0)) * 31;
        kbw kbwVar = jxxVar.d;
        int i = (iA + (kbwVar != null ? kbwVar.a : 0)) * 31;
        kbx kbxVar = jxxVar.e;
        int i2 = (i + (kbxVar != null ? kbxVar.a : 0)) * 31;
        kbj kbjVar = jxxVar.f;
        int iHashCode2 = (i2 + (kbjVar != null ? kbjVar.hashCode() : 0)) * 31;
        String str = jxxVar.g;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + kjk.a(jxxVar.h)) * 31;
        kgw kgwVar = jxxVar.i;
        int iFloatToIntBits = (iHashCode3 + (kgwVar != null ? Float.floatToIntBits(kgwVar.a) : 0)) * 31;
        kht khtVar = jxxVar.j;
        int iHashCode4 = (iFloatToIntBits + (khtVar != null ? khtVar.hashCode() : 0)) * 31;
        kfu kfuVar = jxxVar.k;
        int iHashCode5 = (iHashCode4 + (kfuVar != null ? kfuVar.hashCode() : 0)) * 31;
        long j3 = jxxVar.l;
        long j4 = ije.a;
        int iA2 = (iHashCode5 + fctr.a(j3)) * 31;
        jvs jvsVar = jxxVar.o;
        int iHashCode6 = (((iA2 + (jvsVar != null ? jvsVar.hashCode() : 0)) * 31) + jyqVar.c.hashCode()) * 31;
        jvt jvtVar = jyqVar.d;
        return ((((((((((((((((iHashCode + iHashCode6 + (jvtVar != null ? jvtVar.hashCode() : 0)) * 31) + jyhVar.c.hashCode()) * 31) + jyhVar.d) * 31) + (true != jyhVar.e ? 1237 : 1231)) * 31) + jyhVar.f) * 31) + jyhVar.g.hashCode()) * 31) + jyhVar.h.hashCode()) * 31) + jyhVar.i.hashCode()) * 31) + kij.a(jyhVar.j);
    }
}
