package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnuq {
    public final String a;
    public final float b;
    public final boolean c;

    public dnuq(String str, float f, boolean z) {
        this.a = str;
        this.b = f;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnuq)) {
            return false;
        }
        dnuq dnuqVar = (dnuq) obj;
        return fdbq.f(this.a, dnuqVar.a) && Float.compare(this.b, dnuqVar.b) == 0 && this.c == dnuqVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + Float.floatToIntBits(this.b)) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "EmotifyActivityResultInput(uri=" + this.a + ", smallSegmentRatio=" + this.b + ", enableEmotifyActivityEdgeToEdgeDisplay=" + this.c + ")";
    }
}
