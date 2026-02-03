package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehvy extends ehwd {
    private final ehwe a;
    private final long b;

    public ehvy(ehwe ehweVar, long j) {
        if (ehweVar == null) {
            throw new NullPointerException("Null constraintType");
        }
        this.a = ehweVar;
        this.b = j;
    }

    @Override // defpackage.ehwd
    public final long a() {
        return this.b;
    }

    @Override // defpackage.ehwd
    public final ehwe b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ehwd) {
            ehwd ehwdVar = (ehwd) obj;
            if (this.a.equals(ehwdVar.b()) && this.b == ehwdVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "SyncConstraint{constraintType=" + this.a.toString() + ", applicablePeriod=" + this.b + "}";
    }
}
