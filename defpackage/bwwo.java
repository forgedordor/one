package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwwo extends bwzp {
    private final dqsb a;
    private final long b;
    private final long c;
    private final boolean d;

    public bwwo(dqsb dqsbVar, long j, long j2, boolean z) {
        this.a = dqsbVar;
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    @Override // defpackage.bwzp
    public final long a() {
        return this.b;
    }

    @Override // defpackage.bwzp
    public final long b() {
        return this.c;
    }

    @Override // defpackage.bwzp
    public final dqsb c() {
        return this.a;
    }

    @Override // defpackage.bwzp
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bwzp) {
            bwzp bwzpVar = (bwzp) obj;
            if (this.a.equals(bwzpVar.c()) && this.b == bwzpVar.a() && this.c == bwzpVar.b() && this.d == bwzpVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = true != this.d ? 1237 : 1231;
        long j = this.b;
        long j2 = this.c;
        return (((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ i;
    }

    public final String toString() {
        return "HistoryLogItem{loggingTag=" + this.a.toString() + ", threadId=" + this.b + ", timeStamp=" + this.c + ", enter=" + this.d + "}";
    }
}
