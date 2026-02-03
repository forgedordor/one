package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibz implements ibx {
    public final float a;

    public ibz(float f) {
        this.a = f;
    }

    @Override // defpackage.ibx
    public final int a(int i, int i2, kji kjiVar) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ibz) && Float.compare(this.a, ((ibz) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ')';
    }
}
