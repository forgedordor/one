package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqop extends dqsx {
    public final boolean a;
    public final boolean b;

    public dqop(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.dqsx
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.dqsx
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqsx) {
            dqsx dqsxVar = (dqsx) obj;
            if (this.a == dqsxVar.b() && this.b == dqsxVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "TransactionParameters{withoutSqliteTransaction=" + this.a + ", deferredForeignKeyConstraints=" + this.b + "}";
    }
}
