package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dau {
    public final float a;
    public final float b;
    public final long c;

    public dau(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dau)) {
            return false;
        }
        dau dauVar = (dau) obj;
        return Float.compare(this.a, dauVar.a) == 0 && Float.compare(this.b, dauVar.b) == 0 && this.c == dauVar.c;
    }

    public final int hashCode() {
        int iFloatToIntBits = (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
        long j = this.c;
        return (iFloatToIntBits * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
    }
}
