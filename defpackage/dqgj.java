package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqgj {
    public final fdvc a;
    public final fdae b;

    public dqgj(fdvc fdvcVar, fdae fdaeVar) {
        this.a = fdvcVar;
        this.b = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqgj)) {
            return false;
        }
        dqgj dqgjVar = (dqgj) obj;
        return fdbq.f(this.a, dqgjVar.a) && fdbq.f(this.b, dqgjVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "NoiseCancellationUiData(noiseCancellationEnabledFlow=" + this.a + ", onNoiseCancellationClick=" + this.b + ")";
    }
}
