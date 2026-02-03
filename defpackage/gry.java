package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gry {
    public final float a;

    public gry(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gry)) {
            return false;
        }
        return kir.b(0.0f, 0.0f) && kir.b(0.0f, 0.0f) && kir.b(0.0f, 0.0f) && kir.b(this.a, ((gry) obj).a) && kir.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(0.0f) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(0.0f);
    }
}
