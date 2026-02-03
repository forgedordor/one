package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyq {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final long l;
    private final long m;
    private final long n;

    public gyq(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.a = j;
        this.b = j2;
        this.h = j3;
        this.c = j4;
        this.i = j5;
        this.j = j6;
        this.d = j7;
        this.e = j8;
        this.f = j9;
        this.g = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
        this.n = j14;
    }

    public final long a(boolean z) {
        return z ? this.i : this.j;
    }

    public final long b(boolean z) {
        return z ? this.k : this.l;
    }

    public final long c(boolean z) {
        return z ? this.m : this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gyq gyqVar = (gyq) obj;
        long j = this.a;
        long j2 = gyqVar.a;
        long j3 = ije.a;
        return fcts.a(j, j2) && fcts.a(this.b, gyqVar.b) && fcts.a(this.h, gyqVar.h) && fcts.a(this.c, gyqVar.c) && fcts.a(this.d, gyqVar.d) && fcts.a(this.e, gyqVar.e) && fcts.a(this.f, gyqVar.f) && fcts.a(this.g, gyqVar.g) && fcts.a(this.k, gyqVar.k) && fcts.a(this.l, gyqVar.l) && fcts.a(this.m, gyqVar.m) && fcts.a(this.n, gyqVar.n);
    }

    public final int hashCode() {
        long j = ije.a;
        int iA = fctr.a(this.a);
        long j2 = this.n;
        long j3 = this.m;
        long j4 = this.l;
        long j5 = this.k;
        long j6 = this.g;
        long j7 = this.f;
        long j8 = this.e;
        long j9 = this.d;
        long j10 = this.c;
        return (((((((((((((((((((((iA * 31) + fctr.a(this.b)) * 31) + fctr.a(this.h)) * 31) + fctr.a(j10)) * 31) + fctr.a(j9)) * 31) + fctr.a(j8)) * 31) + fctr.a(j7)) * 31) + fctr.a(j6)) * 31) + fctr.a(j5)) * 31) + fctr.a(j4)) * 31) + fctr.a(j3)) * 31) + fctr.a(j2);
    }
}
