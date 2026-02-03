package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvu {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    private final long m;
    private final long n;
    private final long o;
    private final long p;

    public gvu(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.m = j4;
        this.d = j5;
        this.e = j6;
        this.f = j7;
        this.n = j8;
        this.g = j9;
        this.h = j10;
        this.i = j11;
        this.o = j12;
        this.j = j13;
        this.k = j14;
        this.l = j15;
        this.p = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gvu)) {
            return false;
        }
        long j = this.a;
        gvu gvuVar = (gvu) obj;
        long j2 = gvuVar.a;
        long j3 = ije.a;
        return fcts.a(j, j2) && fcts.a(this.b, gvuVar.b) && fcts.a(this.c, gvuVar.c) && fcts.a(this.m, gvuVar.m) && fcts.a(this.d, gvuVar.d) && fcts.a(this.e, gvuVar.e) && fcts.a(this.f, gvuVar.f) && fcts.a(this.n, gvuVar.n) && fcts.a(this.g, gvuVar.g) && fcts.a(this.h, gvuVar.h) && fcts.a(this.i, gvuVar.i) && fcts.a(this.o, gvuVar.o) && fcts.a(this.j, gvuVar.j) && fcts.a(this.k, gvuVar.k) && fcts.a(this.l, gvuVar.l) && fcts.a(this.p, gvuVar.p);
    }

    public final int hashCode() {
        long j = ije.a;
        int iA = fctr.a(this.a);
        long j2 = this.p;
        long j3 = this.l;
        long j4 = this.k;
        long j5 = this.j;
        long j6 = this.o;
        long j7 = this.i;
        long j8 = this.h;
        long j9 = this.g;
        long j10 = this.n;
        long j11 = this.f;
        long j12 = this.e;
        long j13 = this.d;
        long j14 = this.m;
        return (((((((((((((((((((((((((((((iA * 31) + fctr.a(this.b)) * 31) + fctr.a(this.c)) * 31) + fctr.a(j14)) * 31) + fctr.a(j13)) * 31) + fctr.a(j12)) * 31) + fctr.a(j11)) * 31) + fctr.a(j10)) * 31) + fctr.a(j9)) * 31) + fctr.a(j8)) * 31) + fctr.a(j7)) * 31) + fctr.a(j6)) * 31) + fctr.a(j5)) * 31) + fctr.a(j4)) * 31) + fctr.a(j3)) * 31) + fctr.a(j2);
    }
}
