package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbn {
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

    public gbn(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
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
    }

    public static final ddz a(jue jueVar, hml hmlVar) {
        if (jueVar == jue.b) {
            hmlVar.v(1539262271);
            dew dewVarB = gpg.b(5, hmlVar);
            ((hmw) hmlVar).ab();
            return dewVarB;
        }
        hmlVar.v(1539355581);
        dew dewVarB2 = gpg.b(4, hmlVar);
        ((hmw) hmlVar).ab();
        return dewVarB2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gbn)) {
            return false;
        }
        long j = this.a;
        gbn gbnVar = (gbn) obj;
        long j2 = gbnVar.a;
        long j3 = ije.a;
        return fcts.a(j, j2) && fcts.a(this.b, gbnVar.b) && fcts.a(this.c, gbnVar.c) && fcts.a(this.d, gbnVar.d) && fcts.a(this.e, gbnVar.e) && fcts.a(this.f, gbnVar.f) && fcts.a(this.g, gbnVar.g) && fcts.a(this.h, gbnVar.h) && fcts.a(this.i, gbnVar.i) && fcts.a(this.j, gbnVar.j) && fcts.a(this.k, gbnVar.k) && fcts.a(this.l, gbnVar.l);
    }

    public final int hashCode() {
        long j = ije.a;
        int iA = fctr.a(this.a);
        long j2 = this.l;
        long j3 = this.k;
        long j4 = this.j;
        long j5 = this.i;
        long j6 = this.h;
        long j7 = this.g;
        long j8 = this.f;
        long j9 = this.e;
        long j10 = this.d;
        return (((((((((((((((((((((iA * 31) + fctr.a(this.b)) * 31) + fctr.a(this.c)) * 31) + fctr.a(j10)) * 31) + fctr.a(j9)) * 31) + fctr.a(j8)) * 31) + fctr.a(j7)) * 31) + fctr.a(j6)) * 31) + fctr.a(j5)) * 31) + fctr.a(j4)) * 31) + fctr.a(j3)) * 31) + fctr.a(j2);
    }
}
