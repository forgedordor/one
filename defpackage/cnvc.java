package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnvc {
    private final int a;
    private final double b;

    public cnvc(int i, double d) {
        this.a = i;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnvc)) {
            return false;
        }
        cnvc cnvcVar = (cnvc) obj;
        return this.a == cnvcVar.a && Double.compare(this.b, cnvcVar.b) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.b);
        return (this.a * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "ActiveSyncUpdate(messagesSyncedSinceLastUpdateCount=" + this.a + ", estimatedPercentComplete=" + this.b + ")";
    }
}
