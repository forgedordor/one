package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class def extends deh {
    private float a;
    private float b;
    private float c;

    public def(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.deh
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.c;
    }

    @Override // defpackage.deh
    public final int b() {
        return 3;
    }

    @Override // defpackage.deh
    public final /* synthetic */ deh c() {
        return new def(0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.deh
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    @Override // defpackage.deh
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof def)) {
            return false;
        }
        def defVar = (def) obj;
        return defVar.a == this.a && defVar.b == this.b && defVar.c == this.c;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c;
    }
}
