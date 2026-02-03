package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aadm implements aadp {
    public final float a;

    public aadm(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aadm) && Float.compare(this.a, ((aadm) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Changed(value=" + this.a + ")";
    }
}
