package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpzk {
    public final float a;
    public final long b;

    public dpzk(float f, long j) {
        this.a = f;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpzk)) {
            return false;
        }
        dpzk dpzkVar = (dpzk) obj;
        if (!kir.b(this.a, dpzkVar.a)) {
            return false;
        }
        long j = this.b;
        long j2 = dpzkVar.b;
        long j3 = ije.a;
        return fcts.a(j, j2);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.a) * 31;
        long j = ije.a;
        return iFloatToIntBits + fctr.a(this.b);
    }

    public final String toString() {
        long j = this.b;
        return "DotData(dotSize=" + kir.a(this.a) + ", dotColor=" + ije.g(j) + ")";
    }
}
