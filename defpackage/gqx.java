package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqx {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public gqx(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqx)) {
            return false;
        }
        long j = this.a;
        gqx gqxVar = (gqx) obj;
        long j2 = gqxVar.a;
        long j3 = ije.a;
        return fcts.a(j, j2) && fcts.a(this.b, gqxVar.b) && fcts.a(this.c, gqxVar.c) && fcts.a(this.d, gqxVar.d);
    }

    public final int hashCode() {
        long j = ije.a;
        int iA = fctr.a(this.a);
        long j2 = this.d;
        return (((((iA * 31) + fctr.a(this.b)) * 31) + fctr.a(this.c)) * 31) + fctr.a(j2);
    }
}
