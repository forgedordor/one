package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gru {
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
    public final long m;

    public gru(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
    }

    public final gru a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        return new gru(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d, j5 != 16 ? j5 : this.e, j6 != 16 ? j6 : this.f, j7 != 16 ? j7 : this.g, j8 != 16 ? j8 : this.h, j9 != 16 ? j9 : this.i, j10 != 16 ? j10 : this.j, j11 != 16 ? j11 : this.k, j12 != 16 ? j12 : this.l, j13 != 16 ? j13 : this.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gru)) {
            return false;
        }
        long j = this.a;
        gru gruVar = (gru) obj;
        long j2 = gruVar.a;
        long j3 = ije.a;
        return fcts.a(j, j2) && fcts.a(this.b, gruVar.b) && fcts.a(this.c, gruVar.c) && fcts.a(this.d, gruVar.d) && fcts.a(this.e, gruVar.e) && fcts.a(this.f, gruVar.f) && fcts.a(this.g, gruVar.g) && fcts.a(this.h, gruVar.h) && fcts.a(this.i, gruVar.i) && fcts.a(this.j, gruVar.j) && fcts.a(this.k, gruVar.k) && fcts.a(this.l, gruVar.l) && fcts.a(this.m, gruVar.m);
    }

    public final int hashCode() {
        long j = ije.a;
        int iA = fctr.a(this.a);
        long j2 = this.m;
        long j3 = this.l;
        long j4 = this.k;
        long j5 = this.j;
        long j6 = this.i;
        long j7 = this.h;
        long j8 = this.g;
        long j9 = this.f;
        long j10 = this.e;
        long j11 = this.d;
        return (((((((((((((((((((((((iA * 31) + fctr.a(this.b)) * 31) + fctr.a(this.c)) * 31) + fctr.a(j11)) * 31) + fctr.a(j10)) * 31) + fctr.a(j9)) * 31) + fctr.a(j8)) * 31) + fctr.a(j7)) * 31) + fctr.a(j6)) * 31) + fctr.a(j5)) * 31) + fctr.a(j4)) * 31) + fctr.a(j3)) * 31) + fctr.a(j2);
    }
}
