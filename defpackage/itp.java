package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class itp {
    public long a;
    public float b;

    public itp(long j, float f) {
        this.a = j;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itp)) {
            return false;
        }
        itp itpVar = (itp) obj;
        return this.a == itpVar.a && Float.compare(this.b, itpVar.b) == 0;
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "DataPointAtTime(time=" + this.a + ", dataPoint=" + this.b + ')';
    }
}
