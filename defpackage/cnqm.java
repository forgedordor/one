package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnqm extends cnrw {
    private final long a;
    private final cmtz b;

    public cnqm(long j, cmtz cmtzVar) {
        this.a = j;
        this.b = cmtzVar;
    }

    @Override // defpackage.cnrw
    public final long a() {
        return this.a;
    }

    @Override // defpackage.cnrw
    public final cmtz b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cnrw) {
            cnrw cnrwVar = (cnrw) obj;
            if (this.a == cnrwVar.a() && this.b.equals(cnrwVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ThreadMergeData{oldThreadId=" + this.a + ", newThreadData=" + this.b.toString() + "}";
    }
}
