package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvmr {
    public final bvks a;
    public final String b;
    public final String c;
    public final bvdm d;
    public final int e;
    public final Instant f;
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    private final long l;
    private final String m;
    private final String n;
    private final bvdu o;

    public bvmr(long j, bvks bvksVar, String str, String str2, String str3, String str4, bvdm bvdmVar, int i, bvdu bvduVar, Instant instant) {
        this.l = j;
        this.a = bvksVar;
        this.m = str;
        this.n = str2;
        this.b = str3;
        this.c = str4;
        this.d = bvdmVar;
        this.e = i;
        this.o = bvduVar;
        this.f = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvmr)) {
            return false;
        }
        bvmr bvmrVar = (bvmr) obj;
        return this.l == bvmrVar.l && fdbq.f(this.a, bvmrVar.a) && fdbq.f(this.m, bvmrVar.m) && fdbq.f(this.n, bvmrVar.n) && fdbq.f(this.b, bvmrVar.b) && fdbq.f(this.c, bvmrVar.c) && this.d == bvmrVar.d && this.e == bvmrVar.e && this.o == bvmrVar.o && fdbq.f(this.f, bvmrVar.f) && fdbq.f(this.g, bvmrVar.g) && fdbq.f(this.h, bvmrVar.h) && fdbq.f(this.i, bvmrVar.i) && fdbq.f(this.j, bvmrVar.j) && fdbq.f(this.k, bvmrVar.k);
    }

    public final int hashCode() {
        long j = this.l;
        return (((((((((((((((((((((((((((((int) (j ^ (j >>> 32))) * 31) + this.a.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e) * 31) + this.o.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode();
    }

    public final String toString() {
        return "GaiaDesktopItem(id=" + this.l + ", dittoIdContainer=" + this.a + ", destinationRegistrationId=" + this.m + ", desktopId=" + this.n + ", operatingSystem=" + this.b + ", operatingSystemVersion=" + this.c + ", desktopType=" + this.d + ", browserType=" + this.e + ", pairingType=" + this.o + ", lastConnectionTime=" + this.f + ", activeDusi=" + this.g + ", personalizedDisplayName=" + this.h + ", modelDisplayName=" + this.i + ", approximateLocationDisplayName=" + this.j + ", frontViewImageUrl=" + this.k + ")";
    }
}
