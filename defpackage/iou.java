package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iou extends iph {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public iou(float f, float f2, float f3, float f4) {
        super(true, false, 2);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iou)) {
            return false;
        }
        iou iouVar = (iou) obj;
        return Float.compare(this.a, iouVar.a) == 0 && Float.compare(this.b, iouVar.b) == 0 && Float.compare(this.c, iouVar.c) == 0 && Float.compare(this.d, iouVar.d) == 0;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "ReflectiveCurveTo(x1=" + this.a + ", y1=" + this.b + ", x2=" + this.c + ", y2=" + this.d + ')';
    }
}
