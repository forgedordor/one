package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class kiw {
    public final long a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kiw) && this.a == ((kiw) obj).a;
    }

    public final int hashCode() {
        return kiv.a(this.a);
    }

    public final String toString() {
        long j = this.a;
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) kir.a(b(j))) + " x " + ((Object) kir.a(a(j)));
    }
}
