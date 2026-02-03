package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class heo {
    public final int a;
    public final int b;
    public final float c;

    public heo(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof heo)) {
            return false;
        }
        heo heoVar = (heo) obj;
        return this.a == heoVar.a && this.b == heoVar.b && Float.compare(this.c, heoVar.c) == 0;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "ShiftPointRange(fromStepIndex=" + this.a + ", toStepIndex=" + this.b + ", steppedInterpolation=" + this.c + ')';
    }
}
