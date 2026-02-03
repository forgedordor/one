package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dat {
    public final float a;
    public final dew b;

    public dat(float f, dew dewVar) {
        this.a = f;
        this.b = dewVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dat)) {
            return false;
        }
        dat datVar = (dat) obj;
        return Float.compare(this.a, datVar.a) == 0 && fdbq.f(this.b, datVar.b);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Fade(alpha=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
