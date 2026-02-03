package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mde {
    public static final mde a = new mde(0, 0);
    public final int b;
    public final int c;
    public final float d;

    static {
        mgb.O(0);
        mgb.O(1);
        mgb.O(3);
    }

    public mde(int i, int i2, float f) {
        this.b = i;
        this.c = i2;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mde) {
            mde mdeVar = (mde) obj;
            if (this.b == mdeVar.b && this.c == mdeVar.c && this.d == mdeVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b + 217) * 31) + this.c) * 31) + Float.floatToRawIntBits(this.d);
    }

    public mde(int i, int i2) {
        this(i, i2, 1.0f);
    }
}
