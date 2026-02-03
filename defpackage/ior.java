package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ior extends iph {
    public final float a;
    public final float b;

    public ior(float f, float f2) {
        super(false, false, 3);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ior)) {
            return false;
        }
        ior iorVar = (ior) obj;
        return Float.compare(this.a, iorVar.a) == 0 && Float.compare(this.b, iorVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "LineTo(x=" + this.a + ", y=" + this.b + ')';
    }
}
