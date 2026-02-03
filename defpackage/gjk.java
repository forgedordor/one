package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjk {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public gjk(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public static /* synthetic */ gjk d(gjk gjkVar, long j, long j2, long j3, int i) {
        if ((i & 1) != 0) {
            j = gjkVar.a;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = gjkVar.b;
        }
        long j5 = j2;
        long j6 = (i & 4) != 0 ? gjkVar.c : 0L;
        if ((i & 8) != 0) {
            j3 = gjkVar.d;
        }
        return gjkVar.c(j4, j5, j6, j3);
    }

    public final long a(boolean z) {
        return z ? this.a : this.c;
    }

    public final long b(boolean z) {
        return z ? this.b : this.d;
    }

    public final gjk c(long j, long j2, long j3, long j4) {
        if (j == 16) {
            j = this.a;
        }
        return new gjk(j, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gjk)) {
            return false;
        }
        long j = this.a;
        gjk gjkVar = (gjk) obj;
        long j2 = gjkVar.a;
        long j3 = ije.a;
        return fcts.a(j, j2) && fcts.a(this.b, gjkVar.b) && fcts.a(this.c, gjkVar.c) && fcts.a(this.d, gjkVar.d);
    }

    public final int hashCode() {
        long j = ije.a;
        int iA = fctr.a(this.a);
        long j2 = this.d;
        return (((((iA * 31) + fctr.a(this.b)) * 31) + fctr.a(this.c)) * 31) + fctr.a(j2);
    }
}
