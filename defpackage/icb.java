package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icb implements ibx {
    private final float a;

    public icb(float f) {
        this.a = f;
    }

    @Override // defpackage.ibx
    public final int a(int i, int i2, kji kjiVar) {
        return Math.round(((i2 - i) / 2.0f) * ((kjiVar == kji.a ? this.a : -this.a) + 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof icb) && Float.compare(this.a, ((icb) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ')';
    }
}
