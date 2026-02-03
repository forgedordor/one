package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gba {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public gba(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final long a(boolean z) {
        return z ? this.a : this.c;
    }

    public final long b(boolean z) {
        return z ? this.b : this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gba)) {
            return false;
        }
        long j = this.a;
        gba gbaVar = (gba) obj;
        long j2 = gbaVar.a;
        long j3 = ije.a;
        return fcts.a(j, j2) && fcts.a(this.b, gbaVar.b) && fcts.a(this.c, gbaVar.c) && fcts.a(this.d, gbaVar.d);
    }

    public final int hashCode() {
        long j = ije.a;
        int iA = fctr.a(this.a);
        long j2 = this.d;
        return (((((iA * 31) + fctr.a(this.b)) * 31) + fctr.a(this.c)) * 31) + fctr.a(j2);
    }
}
