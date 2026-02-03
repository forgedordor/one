package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxx implements jui {
    public final khs a;
    public final long b;
    public final kcc c;
    public final kbw d;
    public final kbx e;
    public final kbj f;
    public final String g;
    public final long h;
    public final kgw i;
    public final kht j;
    public final kfu k;
    public final long l;
    public final khl m;
    public final iko n;
    public final jvs o;
    public final ina p;

    public jxx(khs khsVar, long j, kcc kccVar, kbw kbwVar, kbx kbxVar, kbj kbjVar, String str, long j2, kgw kgwVar, kht khtVar, kfu kfuVar, long j3, khl khlVar, iko ikoVar, jvs jvsVar, ina inaVar) {
        this.a = khsVar;
        this.b = j;
        this.c = kccVar;
        this.d = kbwVar;
        this.e = kbxVar;
        this.f = kbjVar;
        this.g = str;
        this.h = j2;
        this.i = kgwVar;
        this.j = khtVar;
        this.k = kfuVar;
        this.l = j3;
        this.m = khlVar;
        this.n = ikoVar;
        this.o = jvsVar;
        this.p = inaVar;
    }

    public final float a() {
        return this.a.a();
    }

    public final long b() {
        return this.a.b();
    }

    public final iiy c() {
        return this.a.c();
    }

    public final jxx d(jxx jxxVar) {
        if (jxxVar == null) {
            return this;
        }
        khs khsVar = jxxVar.a;
        return jxz.b(this, khsVar.b(), khsVar.c(), khsVar.a(), jxxVar.b, jxxVar.c, jxxVar.d, jxxVar.e, jxxVar.f, jxxVar.g, jxxVar.h, jxxVar.i, jxxVar.j, jxxVar.k, jxxVar.l, jxxVar.m, jxxVar.n, jxxVar.o, jxxVar.p);
    }

    public final boolean e(jxx jxxVar) {
        if (this == jxxVar) {
            return true;
        }
        if (!kjl.e(this.b, jxxVar.b) || !fdbq.f(this.c, jxxVar.c) || !fdbq.f(this.d, jxxVar.d) || !fdbq.f(this.e, jxxVar.e) || !fdbq.f(this.f, jxxVar.f) || !fdbq.f(this.g, jxxVar.g) || !kjl.e(this.h, jxxVar.h) || !fdbq.f(this.i, jxxVar.i) || !fdbq.f(this.j, jxxVar.j) || !fdbq.f(this.k, jxxVar.k)) {
            return false;
        }
        long j = this.l;
        long j2 = jxxVar.l;
        long j3 = ije.a;
        return fcts.a(j, j2) && fdbq.f(this.o, jxxVar.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxx)) {
            return false;
        }
        jxx jxxVar = (jxx) obj;
        return e(jxxVar) && f(jxxVar);
    }

    public final boolean f(jxx jxxVar) {
        return fdbq.f(this.a, jxxVar.a) && fdbq.f(this.m, jxxVar.m) && fdbq.f(this.n, jxxVar.n) && fdbq.f(this.p, jxxVar.p);
    }

    public final int hashCode() {
        long jB = b();
        long j = ije.a;
        int iA = fctr.a(jB);
        iiy iiyVarC = c();
        int iHashCode = (((iA * 31) + (iiyVarC != null ? iiyVarC.hashCode() : 0)) * 31) + Float.floatToIntBits(a());
        long j2 = this.b;
        long j3 = kjl.a;
        kcc kccVar = this.c;
        int iA2 = ((((iHashCode * 31) + kjk.a(j2)) * 31) + (kccVar != null ? kccVar.i : 0)) * 31;
        kbw kbwVar = this.d;
        int i = (iA2 + (kbwVar != null ? kbwVar.a : 0)) * 31;
        kbx kbxVar = this.e;
        int i2 = (i + (kbxVar != null ? kbxVar.a : 0)) * 31;
        kbj kbjVar = this.f;
        int iHashCode2 = (i2 + (kbjVar != null ? kbjVar.hashCode() : 0)) * 31;
        String str = this.g;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + kjk.a(this.h)) * 31;
        kgw kgwVar = this.i;
        int iFloatToIntBits = (iHashCode3 + (kgwVar != null ? Float.floatToIntBits(kgwVar.a) : 0)) * 31;
        kht khtVar = this.j;
        int iHashCode4 = (iFloatToIntBits + (khtVar != null ? khtVar.hashCode() : 0)) * 31;
        kfu kfuVar = this.k;
        int iHashCode5 = (((iHashCode4 + (kfuVar != null ? kfuVar.hashCode() : 0)) * 31) + fctr.a(this.l)) * 31;
        khl khlVar = this.m;
        int i3 = (iHashCode5 + (khlVar != null ? khlVar.d : 0)) * 31;
        iko ikoVar = this.n;
        int iHashCode6 = (i3 + (ikoVar != null ? ikoVar.hashCode() : 0)) * 31;
        jvs jvsVar = this.o;
        int iHashCode7 = (iHashCode6 + (jvsVar != null ? jvsVar.hashCode() : 0)) * 31;
        ina inaVar = this.p;
        return iHashCode7 + (inaVar != null ? inaVar.hashCode() : 0);
    }

    public final String toString() {
        return "SpanStyle(color=" + ((Object) ije.g(b())) + ", brush=" + c() + ", alpha=" + a() + ", fontSize=" + ((Object) kjl.d(this.b)) + ", fontWeight=" + this.c + ", fontStyle=" + this.d + ", fontSynthesis=" + this.e + ", fontFamily=" + this.f + ", fontFeatureSettings=" + this.g + ", letterSpacing=" + ((Object) kjl.d(this.h)) + ", baselineShift=" + this.i + ", textGeometricTransform=" + this.j + ", localeList=" + this.k + ", background=" + ((Object) ije.g(this.l)) + ", textDecoration=" + this.m + ", shadow=" + this.n + ", platformStyle=" + this.o + ", drawStyle=" + this.p + ')';
    }

    public /* synthetic */ jxx(long j, long j2, kcc kccVar, kbw kbwVar, kbx kbxVar, kbj kbjVar, String str, long j3, kgw kgwVar, kht khtVar, kfu kfuVar, long j4, khl khlVar, iko ikoVar, int i) {
        this((i & 1) != 0 ? ije.h : j, (i & 2) != 0 ? kjl.a : j2, (i & 4) != 0 ? null : kccVar, (i & 8) != 0 ? null : kbwVar, (i & 16) != 0 ? null : kbxVar, (i & 32) != 0 ? null : kbjVar, (i & 64) != 0 ? null : str, (i & 128) != 0 ? kjl.a : j3, (i & 256) != 0 ? null : kgwVar, (i & 512) != 0 ? null : khtVar, (i & 1024) != 0 ? null : kfuVar, (i & 2048) != 0 ? ije.h : j4, (i & 4096) != 0 ? null : khlVar, (i & 8192) != 0 ? null : ikoVar);
    }

    public /* synthetic */ jxx(long j, long j2, kcc kccVar, kbw kbwVar, kbx kbxVar, kbj kbjVar, String str, long j3, kgw kgwVar, kht khtVar, kfu kfuVar, long j4, khl khlVar, iko ikoVar) {
        this(khq.a(j), j2, kccVar, kbwVar, kbxVar, kbjVar, str, j3, kgwVar, khtVar, kfuVar, j4, khlVar, ikoVar, null, null);
    }
}
