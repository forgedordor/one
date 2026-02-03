package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class spi extends spp {
    private final String a;
    private final float b;
    private final int c;

    public spi(String str, float f, int i) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.a = str;
        this.b = f;
        this.c = i;
    }

    @Override // defpackage.spp
    public final float a() {
        return this.b;
    }

    @Override // defpackage.spp
    public final int b() {
        return this.c;
    }

    @Override // defpackage.spp
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof spp) {
            spp sppVar = (spp) obj;
            if (this.a.equals(sppVar.c()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(sppVar.a()) && this.c == sppVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "SmartReplySuggestion{text=" + this.a + ", score=" + this.b + ", safetyClassificationResult=" + this.c + "}";
    }
}
