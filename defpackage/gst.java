package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gst {
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

    public gst(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
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
    }

    public final long a(boolean z, boolean z2) {
        return z ? z2 ? this.c : this.e : z2 ? this.h : this.j;
    }

    public final long b(boolean z, boolean z2) {
        return z ? z2 ? this.b : this.d : z2 ? this.g : this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gst)) {
            return false;
        }
        long j = this.a;
        gst gstVar = (gst) obj;
        long j2 = gstVar.a;
        long j3 = ije.a;
        return fcts.a(j, j2) && fcts.a(this.b, gstVar.b) && fcts.a(this.c, gstVar.c) && fcts.a(this.d, gstVar.d) && fcts.a(this.e, gstVar.e) && fcts.a(this.f, gstVar.f) && fcts.a(this.g, gstVar.g) && fcts.a(this.h, gstVar.h) && fcts.a(this.i, gstVar.i) && fcts.a(this.j, gstVar.j);
    }

    public final int hashCode() {
        long j = ije.a;
        int iA = fctr.a(this.a);
        long j2 = this.j;
        long j3 = this.i;
        long j4 = this.h;
        long j5 = this.g;
        long j6 = this.f;
        long j7 = this.e;
        long j8 = this.d;
        return (((((((((((((((((iA * 31) + fctr.a(this.b)) * 31) + fctr.a(this.c)) * 31) + fctr.a(j8)) * 31) + fctr.a(j7)) * 31) + fctr.a(j6)) * 31) + fctr.a(j5)) * 31) + fctr.a(j4)) * 31) + fctr.a(j3)) * 31) + fctr.a(j2);
    }
}
