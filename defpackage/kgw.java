package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class kgw {
    public final float a;

    public final boolean equals(Object obj) {
        return (obj instanceof kgw) && Float.compare(this.a, ((kgw) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ')';
    }
}
