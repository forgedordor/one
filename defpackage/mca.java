package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mca {
    public static final mca a = new mca(1.0f, 1.0f);
    public final float b;
    public final float c;
    public final int d;

    static {
        mgb.O(0);
        mgb.O(1);
    }

    public mca(float f, float f2) {
        mee.a(f > 0.0f);
        mee.a(f2 > 0.0f);
        this.b = f;
        this.c = f2;
        this.d = Math.round(f * 1000.0f);
    }

    public final mca a(float f) {
        return new mca(f, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mca mcaVar = (mca) obj;
            if (this.b == mcaVar.b && this.c == mcaVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.b) + 527) * 31) + Float.floatToRawIntBits(this.c);
    }

    public final String toString() {
        return mgb.I("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.b), Float.valueOf(this.c));
    }
}
