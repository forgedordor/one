package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gaq {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public gaq(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gaq)) {
            return false;
        }
        gaq gaqVar = (gaq) obj;
        return kir.b(this.a, gaqVar.a) && kir.b(this.b, gaqVar.b) && kir.b(this.c, gaqVar.c) && kir.b(this.d, gaqVar.d) && kir.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(0.0f);
    }
}
