package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipf extends iph {
    public final float a;

    public ipf(float f) {
        super(false, false, 3);
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ipf) && Float.compare(this.a, ((ipf) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "RelativeVerticalTo(dy=" + this.a + ')';
    }
}
