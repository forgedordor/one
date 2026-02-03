package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwwp extends bwzx {
    public final Thread a;
    public final dqsb b;
    public final long c;

    public bwwp(Thread thread, dqsb dqsbVar, long j) {
        this.a = thread;
        this.b = dqsbVar;
        this.c = j;
    }

    @Override // defpackage.bwzx
    public final long a() {
        return this.c;
    }

    @Override // defpackage.bwzx
    public final dqsb b() {
        return this.b;
    }

    @Override // defpackage.bwzx
    public final Thread c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bwzx) {
            bwzx bwzxVar = (bwzx) obj;
            if (this.a.equals(bwzxVar.c()) && this.b.equals(bwzxVar.b()) && this.c == bwzxVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.c;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        dqsb dqsbVar = this.b;
        return "WriteLockHolder{thread=" + this.a.toString() + ", loggingTag=" + dqsbVar.toString() + ", startTime=" + this.c + "}";
    }
}
