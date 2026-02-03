package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpmf {
    public final long a;
    private final long b;

    public dpmf(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpmf)) {
            return false;
        }
        dpmf dpmfVar = (dpmf) obj;
        return kjg.e(this.a, dpmfVar.a) && kjb.f(this.b, dpmfVar.b);
    }

    public final int hashCode() {
        return (kjf.a(this.a) * 31) + kja.a(this.b);
    }

    public final String toString() {
        long j = this.b;
        return "LayerCoordinates(size=" + kjg.c(this.a) + ", offset=" + kjb.e(j) + ")";
    }
}
