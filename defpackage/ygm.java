package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ygm {
    public final float a;
    public final float b;

    public ygm(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygm)) {
            return false;
        }
        ygm ygmVar = (ygm) obj;
        return Float.compare(this.a, ygmVar.a) == 0 && Float.compare(this.b, ygmVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "ContentOffset(previous=" + this.a + ", current=" + this.b + ")";
    }
}
