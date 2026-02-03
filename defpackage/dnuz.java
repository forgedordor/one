package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnuz {
    public final float a;
    public final boolean b;

    public dnuz() {
        this(0.0f, false, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnuz)) {
            return false;
        }
        dnuz dnuzVar = (dnuz) obj;
        return Float.compare(this.a, dnuzVar.a) == 0 && this.b == dnuzVar.b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "Configuration(smallSegmentRatio=" + this.a + ", enableEmotifyActivityEdgeToEdgeDisplay=" + this.b + ")";
    }

    public dnuz(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public /* synthetic */ dnuz(float f, boolean z, int i) {
        this(1 == (i & 1) ? 0.0f : f, z & ((i & 2) == 0));
    }
}
