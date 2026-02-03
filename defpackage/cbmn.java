package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbmn {
    public final String a;
    public final long b;
    public final int c;
    public final int d;

    public cbmn(String str, long j, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbmn)) {
            return false;
        }
        cbmn cbmnVar = (cbmn) obj;
        return fdbq.f(this.a, cbmnVar.a) && this.b == cbmnVar.b && this.c == cbmnVar.c && this.d == cbmnVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return ((((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "FinishedWorkerStats(queueName=" + this.a + ", startedAtTimeMillis=" + this.b + ", completedWorkItems=" + this.c + ", result=" + ((Object) cbmp.a(this.d)) + ")";
    }
}
