package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes4.dex */
public final class dpts {
    public static final fddm b = new fddm(0.0f, 1.0f);
    public final float a;

    public static void a(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException(f + " is an invalid playback progress. Should be between 0 and 1.");
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dpts) && Float.compare(this.a, ((dpts) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "MediaPlaybackProgress(value=" + this.a + ")";
    }
}
