package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmi {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public gmi(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gmi)) {
            return false;
        }
        long j = this.a;
        gmi gmiVar = (gmi) obj;
        long j2 = gmiVar.a;
        long j3 = ije.a;
        return fcts.a(j, j2) && fcts.a(this.b, gmiVar.b) && fcts.a(this.c, gmiVar.c) && fcts.a(this.d, gmiVar.d) && fcts.a(this.e, gmiVar.e) && fcts.a(this.f, gmiVar.f);
    }

    public final int hashCode() {
        long j = ije.a;
        int iA = fctr.a(this.a);
        long j2 = this.f;
        long j3 = this.e;
        long j4 = this.d;
        return (((((((((iA * 31) + fctr.a(this.b)) * 31) + fctr.a(this.c)) * 31) + fctr.a(j4)) * 31) + fctr.a(j3)) * 31) + fctr.a(j2);
    }
}
