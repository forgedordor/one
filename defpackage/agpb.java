package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agpb {
    public final long a;
    public final long b;

    public agpb(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agpb)) {
            return false;
        }
        agpb agpbVar = (agpb) obj;
        return this.a == agpbVar.a && this.b == agpbVar.b;
    }

    public final int hashCode() {
        return (agpa.a(this.a) * 31) + agpa.a(this.b);
    }

    public final String toString() {
        return "P13nFeatureCalculationParams(startTimeMs=" + this.a + ", endTimeMs=" + this.b + ")";
    }
}
