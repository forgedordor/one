package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqom extends dqrs {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final ekgb f;
    public final int g;
    private final dqrr h;

    public dqom(String str, String str2, int i, int i2, boolean z, ekgb ekgbVar, dqrr dqrrVar, int i3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = ekgbVar;
        this.h = dqrrVar;
        this.g = i3;
    }

    @Override // defpackage.dqrs
    public final int a() {
        return this.c;
    }

    @Override // defpackage.dqrs
    public final int b() {
        return this.g;
    }

    @Override // defpackage.dqrs
    public final int c() {
        return this.d;
    }

    @Override // defpackage.dqrs
    public final dqrr d() {
        return this.h;
    }

    @Override // defpackage.dqrs
    public final ekgb e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        dqrr dqrrVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqrs) {
            dqrs dqrsVar = (dqrs) obj;
            if (this.a.equals(dqrsVar.g()) && this.b.equals(dqrsVar.f()) && this.c == dqrsVar.a() && this.d == dqrsVar.c() && this.e == dqrsVar.h() && ekjz.h(this.f, dqrsVar.e()) && ((dqrrVar = this.h) != null ? dqrrVar.equals(dqrsVar.d()) : dqrsVar.d() == null) && this.g == dqrsVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dqrs
    public final String f() {
        return this.b;
    }

    @Override // defpackage.dqrs
    public final String g() {
        return this.a;
    }

    @Override // defpackage.dqrs
    public final boolean h() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int iHashCode2 = (((((((iHashCode * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode();
        dqrr dqrrVar = this.h;
        return (((iHashCode2 * 1000003) ^ (dqrrVar == null ? 0 : dqrrVar.hashCode())) * 1000003) ^ this.g;
    }

    public final String toString() {
        dqrr dqrrVar = this.h;
        return "DatabaseConstructionParameters{storageFileName=" + this.a + ", handleName=" + this.b + ", currentSchemaVersion=" + this.c + ", transactionOrderingPosition=" + this.d + ", ignoreDowngrade=" + this.e + ", invalidRanges=" + this.f.toString() + ", onOpenCallback=" + String.valueOf(dqrrVar) + ", maxAllowableSchemaVersionForUniqueIndex=" + this.g + "}";
    }
}
