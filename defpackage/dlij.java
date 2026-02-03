package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlij {
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

    public dlij(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlij)) {
            return false;
        }
        dlij dlijVar = (dlij) obj;
        long j = this.a;
        long j2 = dlijVar.a;
        long j3 = ije.a;
        return fcts.a(j, j2) && fcts.a(this.b, dlijVar.b) && fcts.a(this.c, dlijVar.c) && fcts.a(this.d, dlijVar.d) && fcts.a(this.e, dlijVar.e) && fcts.a(this.f, dlijVar.f) && fcts.a(this.g, dlijVar.g) && fcts.a(this.h, dlijVar.h) && fcts.a(this.i, dlijVar.i) && fcts.a(this.j, dlijVar.j) && fcts.a(this.k, dlijVar.k);
    }

    public final int hashCode() {
        long j = ije.a;
        int iA = fctr.a(this.a);
        long j2 = this.k;
        long j3 = this.j;
        long j4 = this.i;
        long j5 = this.h;
        long j6 = this.g;
        long j7 = this.f;
        long j8 = this.e;
        long j9 = this.d;
        return (((((((((((((((((((iA * 31) + fctr.a(this.b)) * 31) + fctr.a(this.c)) * 31) + fctr.a(j9)) * 31) + fctr.a(j8)) * 31) + fctr.a(j7)) * 31) + fctr.a(j6)) * 31) + fctr.a(j5)) * 31) + fctr.a(j4)) * 31) + fctr.a(j3)) * 31) + fctr.a(j2);
    }

    public final String toString() {
        long j = this.k;
        long j2 = this.j;
        long j3 = this.i;
        long j4 = this.h;
        long j5 = this.g;
        long j6 = this.f;
        long j7 = this.e;
        long j8 = this.d;
        long j9 = this.c;
        long j10 = this.b;
        return "AbcBubbleColors(incomingXms=" + ije.g(this.a) + ", onIncomingXms=" + ije.g(j10) + ", outgoingXms=" + ije.g(j9) + ", onOutgoingXms=" + ije.g(j8) + ", incomingRcs=" + ije.g(j7) + ", onIncomingRcs=" + ije.g(j6) + ", outgoingRcsStart=" + ije.g(j5) + ", outgoingRcsEnd=" + ije.g(j4) + ", onOutgoingRcs=" + ije.g(j3) + ", selected=" + ije.g(j2) + ", onSelected=" + ije.g(j) + ")";
    }
}
