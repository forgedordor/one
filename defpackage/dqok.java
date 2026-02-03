package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqok extends dqrp {
    private final String a = "$primary";
    private final String b;
    private final String c;

    public dqok(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.dqrp
    public final String a() {
        return this.b;
    }

    @Override // defpackage.dqrp
    public final String b() {
        return this.a;
    }

    @Override // defpackage.dqrp
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqrp) {
            dqrp dqrpVar = (dqrp) obj;
            if (this.a.equals(dqrpVar.b()) && this.b.equals(dqrpVar.a()) && this.c.equals(dqrpVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ConditionalIndexData{databaseHandle=" + this.a + ", conditionName=" + this.b + ", indexCreationSql=" + this.c + "}";
    }
}
