package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqt {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public gqt(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gqt)) {
            return false;
        }
        long j = this.a;
        gqt gqtVar = (gqt) obj;
        long j2 = gqtVar.a;
        long j3 = ije.a;
        return fcts.a(j, j2) && fcts.a(this.b, gqtVar.b) && fcts.a(this.c, gqtVar.c) && fcts.a(this.d, gqtVar.d);
    }

    public final int hashCode() {
        long j = ije.a;
        int iA = fctr.a(this.a);
        long j2 = this.d;
        return (((((iA * 31) + fctr.a(this.b)) * 31) + fctr.a(this.c)) * 31) + fctr.a(j2);
    }
}
