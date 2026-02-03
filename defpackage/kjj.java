package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kjj implements kjq {
    private final float a;

    public kjj(float f) {
        this.a = f;
    }

    @Override // defpackage.kjq
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.kjq
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kjj) && Float.compare(this.a, ((kjj) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.a + ')';
    }
}
