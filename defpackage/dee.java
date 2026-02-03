package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dee extends deh {
    public float a;
    public float b;

    public dee(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.deh
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.deh
    public final int b() {
        return 2;
    }

    @Override // defpackage.deh
    public final /* synthetic */ deh c() {
        return new dee(0.0f, 0.0f);
    }

    @Override // defpackage.deh
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.deh
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dee)) {
            return false;
        }
        dee deeVar = (dee) obj;
        return deeVar.a == this.a && deeVar.b == this.b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
