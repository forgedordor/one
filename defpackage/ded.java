package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ded extends deh {
    public float a;

    public ded(float f) {
        this.a = f;
    }

    @Override // defpackage.deh
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.deh
    public final int b() {
        return 1;
    }

    @Override // defpackage.deh
    public final /* synthetic */ deh c() {
        return new ded(0.0f);
    }

    @Override // defpackage.deh
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.deh
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ded) && ((ded) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
