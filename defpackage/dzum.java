package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzum extends dzuv {
    public final float a;
    private final int b;

    public dzum(int i, float f) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.dzuv
    public final float d() {
        return this.a;
    }

    @Override // defpackage.dzuv
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzuv) {
            dzuv dzuvVar = (dzuv) obj;
            if (this.b == dzuvVar.e() && Float.floatToIntBits(this.a) == Float.floatToIntBits(dzuvVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "TraceConfigurations{enablement=" + dzjw.a(this.b) + ", samplingProbability=" + this.a + "}";
    }
}
