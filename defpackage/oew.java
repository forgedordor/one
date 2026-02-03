package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oew {
    public static final oew a = new oev().a();
    public final int b;
    public final int d;
    public final int e;
    public final int c = 1;
    public final float f = 1.0f;
    public final int g = -1;
    public final int h = -1;
    public final long i = -1;
    public final int j = -1;
    public final int k = -1;
    public final int l = -1;

    public oew(int i, int i2, int i3) {
        this.b = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oew)) {
            return false;
        }
        oew oewVar = (oew) obj;
        if (this.b == oewVar.b) {
            int i = oewVar.c;
            if (this.d == oewVar.d && this.e == oewVar.e) {
                float f = oewVar.f;
                int i2 = oewVar.g;
                int i3 = oewVar.h;
                long j = oewVar.i;
                int i4 = oewVar.j;
                int i5 = oewVar.k;
                int i6 = oewVar.l;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.b + 217) * 31) + 1) * 31) + this.d) * 31) + this.e) * 31) + Float.floatToIntBits(1.0f)) * 31) - 1) * 31) - 1) * 31) + ((int) (-4294967296L))) * 31) - 1) * 31) - 1) * 31) - 1;
    }
}
