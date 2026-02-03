package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chuk extends chxv {
    private final evqs a;
    private final boolean b;

    public chuk(evqs evqsVar, boolean z) {
        if (evqsVar == null) {
            throw new NullPointerException("Null transactionId");
        }
        this.a = evqsVar;
        this.b = z;
    }

    @Override // defpackage.chxv
    public final evqs a() {
        return this.a;
    }

    @Override // defpackage.chxv
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof chxv) {
            chxv chxvVar = (chxv) obj;
            if (this.a.equals(chxvVar.a()) && this.b == chxvVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "MmsMessage{transactionId=" + this.a.toString() + ", isArbitraryDataStored=" + this.b + "}";
    }
}
