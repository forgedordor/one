package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csdo implements Comparable {
    public static final csdo a = new csdo(0.0d);
    public static final csdo b = new csdo(0.5d);
    public static final csdo c = new csdo(1.0d);
    private final double d;

    public csdo(double d) {
        this.d = d;
        if (d < 0.0d) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (d > 1.0d) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final float a() {
        return (float) this.d;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(csdo csdoVar) {
        csdoVar.getClass();
        return Double.compare(this.d, csdoVar.d);
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof csdo) && this.d == ((csdo) obj).d;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.d);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        return String.valueOf(this.d);
    }
}
