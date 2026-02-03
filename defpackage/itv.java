package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class itv {
    private final float a;
    private final float b;
    private final long c;
    private final int d;

    public itv(float f, float f2, long j, int i) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof itv)) {
            return false;
        }
        itv itvVar = (itv) obj;
        return itvVar.a == this.a && itvVar.b == this.b && itvVar.c == this.c && itvVar.d == this.d;
    }

    public final int hashCode() {
        int iFloatToIntBits = (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
        long j = this.c;
        return (((iFloatToIntBits * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.d;
    }

    public final String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.a + ",horizontalScrollPixels=" + this.b + ",uptimeMillis=" + this.c + ",deviceId=" + this.d + ')';
    }
}
