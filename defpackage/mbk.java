package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mbk {
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        mgb.O(0);
        mgb.O(1);
        mgb.O(2);
        mgb.O(3);
        mgb.O(4);
    }

    public mbk(mbj mbjVar) {
        long j = mbjVar.a;
        long j2 = mbjVar.b;
        long j3 = mbjVar.c;
        float f = mbjVar.d;
        float f2 = mbjVar.e;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = f;
        this.e = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbk)) {
            return false;
        }
        mbk mbkVar = (mbk) obj;
        return this.a == mbkVar.a && this.b == mbkVar.b && this.c == mbkVar.c && this.d == mbkVar.d && this.e == mbkVar.e;
    }

    public final int hashCode() {
        float f = this.d;
        int iFloatToIntBits = f != 0.0f ? Float.floatToIntBits(f) : 0;
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        float f2 = this.e;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + iFloatToIntBits) * 31) + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }
}
