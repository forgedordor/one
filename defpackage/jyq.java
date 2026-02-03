package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyq {
    public static final jyq a = new jyq(0, 0, null, null, 0, 0, 0, 16777215);
    public final jxx b;
    public final jvn c;
    public final jvt d;

    public jyq(jxx jxxVar, jvn jvnVar, jvt jvtVar) {
        this.b = jxxVar;
        this.c = jvnVar;
        this.d = jvtVar;
    }

    public static /* synthetic */ jyq y(jyq jyqVar, long j, long j2, kcc kccVar, kbw kbwVar, kbj kbjVar, String str, long j3, iko ikoVar, int i, int i2, long j4, jvt jvtVar, khi khiVar, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        ina inaVar;
        iko ikoVar2;
        long j5;
        khu khuVar;
        jvt jvtVar2;
        long j6;
        khi khiVar2;
        khi khiVar3;
        int i8;
        long jB = (i4 & 1) != 0 ? jyqVar.b.b() : j;
        long j7 = (i4 & 2) != 0 ? jyqVar.b.b : j2;
        kcc kccVar2 = (i4 & 4) != 0 ? jyqVar.b.c : kccVar;
        kbw kbwVar2 = (i4 & 8) != 0 ? jyqVar.b.d : kbwVar;
        kbx kbxVar = (i4 & 16) != 0 ? jyqVar.b.e : null;
        kbj kbjVar2 = (i4 & 32) != 0 ? jyqVar.b.f : kbjVar;
        String str2 = (i4 & 64) != 0 ? jyqVar.b.g : str;
        long j8 = (i4 & 128) != 0 ? jyqVar.b.h : j3;
        kgw kgwVar = (i4 & 256) != 0 ? jyqVar.b.i : null;
        kht khtVar = (i4 & 512) != 0 ? jyqVar.b.j : null;
        kfu kfuVar = (i4 & 1024) != 0 ? jyqVar.b.k : null;
        long j9 = j7;
        long j10 = (i4 & 2048) != 0 ? jyqVar.b.l : 0L;
        khl khlVar = (i4 & 4096) != 0 ? jyqVar.b.m : null;
        iko ikoVar3 = (i4 & 8192) != 0 ? jyqVar.b.n : ikoVar;
        khl khlVar2 = khlVar;
        ina inaVar2 = (i4 & 16384) != 0 ? jyqVar.b.p : null;
        int i9 = (i4 & 32768) != 0 ? jyqVar.c.a : i;
        if ((i4 & 65536) != 0) {
            i5 = i9;
            i6 = jyqVar.c.b;
        } else {
            i5 = i9;
            i6 = i2;
        }
        if ((i4 & 131072) != 0) {
            i7 = i6;
            inaVar = inaVar2;
            ikoVar2 = ikoVar3;
            j5 = jyqVar.c.c;
        } else {
            i7 = i6;
            inaVar = inaVar2;
            ikoVar2 = ikoVar3;
            j5 = j4;
        }
        khu khuVar2 = (i4 & 262144) != 0 ? jyqVar.c.d : null;
        if ((i4 & 524288) != 0) {
            khuVar = khuVar2;
            jvtVar2 = jyqVar.d;
        } else {
            khuVar = khuVar2;
            jvtVar2 = jvtVar;
        }
        if ((i4 & 1048576) != 0) {
            j6 = j5;
            khiVar2 = jyqVar.c.f;
        } else {
            j6 = j5;
            khiVar2 = khiVar;
        }
        int i10 = (i4 & 2097152) != 0 ? jyqVar.c.g : 0;
        if ((i4 & 4194304) != 0) {
            khiVar3 = khiVar2;
            i8 = jyqVar.c.h;
        } else {
            khiVar3 = khiVar2;
            i8 = i3;
        }
        khw khwVar = jyqVar.c.i;
        jxx jxxVar = jyqVar.b;
        int i11 = i10;
        kcc kccVar3 = kccVar2;
        long jB2 = jxxVar.b();
        long j11 = ije.a;
        ina inaVar3 = inaVar;
        return new jyq(new jxx(fcts.a(jB, jB2) ? jxxVar.a : khq.a(jB), j9, kccVar3, kbwVar2, kbxVar, kbjVar2, str2, j8, kgwVar, khtVar, kfuVar, j10, khlVar2, ikoVar2, jvtVar2 != null ? jvtVar2.a : null, inaVar3), new jvn(i5, i7, j6, khuVar, jvtVar2 != null ? jvtVar2.b : null, khiVar3, i11, i8, khwVar), jvtVar2);
    }

    public static /* synthetic */ jyq z(jyq jyqVar, long j, long j2, kcc kccVar, kbw kbwVar, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 1) != 0 ? ije.h : j;
        long j6 = (i2 & 2) != 0 ? kjl.a : j2;
        kcc kccVar2 = (i2 & 4) != 0 ? null : kccVar;
        kbw kbwVar2 = (i2 & 8) != 0 ? null : kbwVar;
        long j7 = (i2 & 128) != 0 ? kjl.a : j3;
        long j8 = (i2 & 2048) != 0 ? ije.h : 0L;
        int i3 = (32768 & i2) != 0 ? Integer.MIN_VALUE : i;
        int i4 = (65536 & i2) == 0 ? 0 : Integer.MIN_VALUE;
        long j9 = (i2 & 131072) != 0 ? kjl.a : j4;
        jxx jxxVar = jyqVar.b;
        jxx jxxVarB = jxz.b(jxxVar, j5, null, Float.NaN, j6, kccVar2, kbwVar2, null, null, null, j7, null, null, null, j8, null, null, null, null);
        jvn jvnVar = jyqVar.c;
        jvn jvnVarA = jvo.a(jvnVar, i3, i4, j9, null, null, null, 0, Integer.MIN_VALUE, null);
        return (jxxVar == jxxVarB && jvnVar == jvnVarA) ? jyqVar : new jyq(jxxVarB, jvnVarA);
    }

    public final float a() {
        return this.b.a();
    }

    public final int b() {
        return this.c.g;
    }

    public final int c() {
        return this.c.a;
    }

    public final int d() {
        return this.c.b;
    }

    public final long e() {
        return this.b.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyq)) {
            return false;
        }
        jyq jyqVar = (jyq) obj;
        return fdbq.f(this.b, jyqVar.b) && fdbq.f(this.c, jyqVar.c) && fdbq.f(this.d, jyqVar.d);
    }

    public final long f() {
        return this.b.b();
    }

    public final long g() {
        return this.b.b;
    }

    public final long h() {
        return this.b.h;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() * 31) + this.c.hashCode();
        jvt jvtVar = this.d;
        return (iHashCode * 31) + (jvtVar != null ? jvtVar.hashCode() : 0);
    }

    public final long i() {
        return this.c.c;
    }

    public final iiy j() {
        return this.b.c();
    }

    public final iko k() {
        return this.b.n;
    }

    public final ina l() {
        return this.b.p;
    }

    public final jyq m(jyq jyqVar) {
        if (jyqVar == null || fdbq.f(jyqVar, a)) {
            return this;
        }
        return new jyq(this.b.d(jyqVar.b), this.c.a(jyqVar.c));
    }

    public final kbj n() {
        return this.b.f;
    }

    public final kbw o() {
        return this.b.d;
    }

    public final kbx p() {
        return this.b.e;
    }

    public final kcc q() {
        return this.b.c;
    }

    public final kfu r() {
        return this.b.k;
    }

    public final khi s() {
        return this.c.f;
    }

    public final khl t() {
        return this.b.m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) ije.g(f()));
        sb.append(", brush=");
        sb.append(j());
        sb.append(", alpha=");
        sb.append(a());
        sb.append(", fontSize=");
        sb.append((Object) kjl.d(g()));
        sb.append(", fontWeight=");
        sb.append(q());
        sb.append(", fontStyle=");
        sb.append(o());
        sb.append(", fontSynthesis=");
        sb.append(p());
        sb.append(", fontFamily=");
        sb.append(n());
        sb.append(", fontFeatureSettings=");
        jxx jxxVar = this.b;
        sb.append(jxxVar.g);
        sb.append(", letterSpacing=");
        sb.append((Object) kjl.d(h()));
        sb.append(", baselineShift=");
        sb.append(jxxVar.i);
        sb.append(", textGeometricTransform=");
        sb.append(jxxVar.j);
        sb.append(", localeList=");
        sb.append(r());
        sb.append(", background=");
        sb.append((Object) ije.g(e()));
        sb.append(", textDecoration=");
        sb.append(t());
        sb.append(", shadow=");
        sb.append(k());
        sb.append(", drawStyle=");
        sb.append(l());
        sb.append(", textAlign=");
        sb.append((Object) khk.a(c()));
        sb.append(", textDirection=");
        sb.append((Object) khm.a(d()));
        sb.append(", lineHeight=");
        sb.append((Object) kjl.d(i()));
        sb.append(", textIndent=");
        sb.append(u());
        sb.append(", platformStyle=");
        sb.append(this.d);
        sb.append(", lineHeightStyle=");
        sb.append(s());
        sb.append(", lineBreak=");
        sb.append((Object) khd.a(b()));
        sb.append(", hyphens=");
        sb.append((Object) kgz.a(this.c.h));
        sb.append(", textMotion=");
        sb.append(v());
        sb.append(')');
        return sb.toString();
    }

    public final khu u() {
        return this.c.d;
    }

    public final khw v() {
        return this.c.i;
    }

    public final boolean w(jyq jyqVar) {
        return this == jyqVar || this.b.f(jyqVar.b);
    }

    public final boolean x(jyq jyqVar) {
        if (this != jyqVar) {
            return fdbq.f(this.c, jyqVar.c) && this.b.e(jyqVar.b);
        }
        return true;
    }

    public /* synthetic */ jyq(long j, long j2, kcc kccVar, kbj kbjVar, long j3, int i, long j4, int i2) {
        this(new jxx((i2 & 1) != 0 ? ije.h : j, (i2 & 2) != 0 ? kjl.a : j2, (i2 & 4) != 0 ? null : kccVar, null, null, (i2 & 32) != 0 ? null : kbjVar, null, (i2 & 128) != 0 ? kjl.a : j3, null, null, null, (i2 & 2048) != 0 ? ije.h : 0L, null, null), new jvn((32768 & i2) != 0 ? Integer.MIN_VALUE : i, (65536 & i2) == 0 ? 0 : Integer.MIN_VALUE, (i2 & 131072) != 0 ? kjl.a : j4, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jyq(jxx jxxVar, jvn jvnVar) {
        jvs jvsVar = jxxVar.o;
        jvr jvrVar = jvnVar.e;
        this(jxxVar, jvnVar, (jvsVar == null && jvrVar == null) ? null : new jvt(jvsVar, jvrVar));
    }
}
