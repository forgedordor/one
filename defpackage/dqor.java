package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqor extends dqtd {
    public final String a;
    public final boolean b;
    public final dqsb c;
    public final String d;

    public dqor(String str, boolean z, dqsb dqsbVar, String str2) {
        this.a = str;
        this.b = z;
        this.c = dqsbVar;
        this.d = str2;
    }

    @Override // defpackage.dqtd
    public final dqsb a() {
        return this.c;
    }

    @Override // defpackage.dqtd
    public final String b() {
        return this.d;
    }

    @Override // defpackage.dqtd
    public final String c() {
        return this.a;
    }

    @Override // defpackage.dqtd
    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqtd) {
            dqtd dqtdVar = (dqtd) obj;
            if (this.a.equals(dqtdVar.c()) && this.b == dqtdVar.d() && this.c.equals(dqtdVar.a()) && ((str = this.d) != null ? str.equals(dqtdVar.b()) : dqtdVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
        String str = this.d;
        return (iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "DeleteParameters{tableName=" + this.a + ", exemptFromQueryPlanChecking=" + this.b + ", loggingTag=" + this.c.toString() + ", databaseName=" + this.d + "}";
    }
}
