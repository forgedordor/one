package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gke {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public gke(long j, long j2, long j3, long j4, long j5, long j6) {
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
        if (obj == null || !(obj instanceof gke)) {
            return false;
        }
        long j = this.a;
        gke gkeVar = (gke) obj;
        long j2 = gkeVar.a;
        long j3 = ije.a;
        return fcts.a(j, j2) && fcts.a(this.b, gkeVar.b) && fcts.a(this.c, gkeVar.c) && fcts.a(this.d, gkeVar.d) && fcts.a(this.e, gkeVar.e) && fcts.a(this.f, gkeVar.f);
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
