package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gal {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public gal(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final gal a(long j, long j2, long j3, long j4) {
        if (j == 16) {
            j = this.a;
        }
        return new gal(j, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gal)) {
            return false;
        }
        long j = this.a;
        gal galVar = (gal) obj;
        long j2 = galVar.a;
        long j3 = ije.a;
        return fcts.a(j, j2) && fcts.a(this.b, galVar.b) && fcts.a(this.c, galVar.c) && fcts.a(this.d, galVar.d);
    }

    public final int hashCode() {
        long j = ije.a;
        int iA = fctr.a(this.a);
        long j2 = this.d;
        return (((((iA * 31) + fctr.a(this.b)) * 31) + fctr.a(this.c)) * 31) + fctr.a(j2);
    }
}
