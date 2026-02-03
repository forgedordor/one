package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hej {
    public final float a;
    public final boolean b;

    public hej(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hej)) {
            return false;
        }
        hej hejVar = (hej) obj;
        return Float.compare(this.a, hejVar.a) == 0 && this.b == hejVar.b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "TmpKeyline(size=" + this.a + ", isAnchor=" + this.b + ')';
    }
}
