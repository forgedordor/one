package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqpb extends dqyh {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final dqsb d;
    public final String e;
    public final ekhx f;
    public final int g;
    public final dqyg h;

    public dqpb(boolean z, boolean z2, boolean z3, dqsb dqsbVar, String str, ekhx ekhxVar, int i, dqyg dqygVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = dqsbVar;
        this.e = str;
        this.f = ekhxVar;
        this.g = i;
        this.h = dqygVar;
    }

    @Override // defpackage.dqyh
    public final int a() {
        return this.g;
    }

    @Override // defpackage.dqyh
    public final dqsb b() {
        return this.d;
    }

    @Override // defpackage.dqyh
    public final dqyg c() {
        return this.h;
    }

    @Override // defpackage.dqyh
    public final ekhx d() {
        return this.f;
    }

    @Override // defpackage.dqyh
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        dqyg dqygVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqyh) {
            dqyh dqyhVar = (dqyh) obj;
            if (this.a == dqyhVar.f() && this.b == dqyhVar.h() && this.c == dqyhVar.g() && this.d.equals(dqyhVar.b()) && ((str = this.e) != null ? str.equals(dqyhVar.e()) : dqyhVar.e() == null) && this.f.equals(dqyhVar.d()) && this.g == dqyhVar.a() && ((dqygVar = this.h) != null ? dqygVar.equals(dqyhVar.c()) : dqyhVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dqyh
    public final boolean f() {
        return this.a;
    }

    @Override // defpackage.dqyh
    public final boolean g() {
        return this.c;
    }

    @Override // defpackage.dqyh
    public final boolean h() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237)) * 1000003) ^ this.d.hashCode();
        String str = this.e;
        int iHashCode2 = ((((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003;
        dqyg dqygVar = this.h;
        return iHashCode2 ^ (dqygVar != null ? dqygVar.hashCode() : 0);
    }

    public final String toString() {
        dqyg dqygVar = this.h;
        ekhx ekhxVar = this.f;
        return "UpdateParameters{disableTableFilters=" + this.a + ", omitUnchangedRows=" + this.b + ", exemptFromQueryPlanChecking=" + this.c + ", loggingTag=" + this.d.toString() + ", databaseName=" + this.e + ", autoUpdateColumns=" + String.valueOf(ekhxVar) + ", conflictAlgorithm=" + this.g + ", valuesExpression=" + String.valueOf(dqygVar) + "}";
    }
}
