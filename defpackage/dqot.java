package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqot extends dqts {
    public final dqwl a;
    public final dqpo b;
    public final dqpo c;
    public final String d;
    public final dqyj e;
    public final String f;
    public final boolean g;

    public dqot(dqwl dqwlVar, dqpo dqpoVar, dqpo dqpoVar2, String str, dqyj dqyjVar, String str2, boolean z) {
        this.a = dqwlVar;
        this.b = dqpoVar;
        this.c = dqpoVar2;
        this.d = str;
        this.e = dqyjVar;
        this.f = str2;
        this.g = z;
    }

    @Override // defpackage.dqts
    public final dqpo a() {
        return this.b;
    }

    @Override // defpackage.dqts
    public final dqpo b() {
        return this.c;
    }

    @Override // defpackage.dqts
    public final dqwl c() {
        return this.a;
    }

    @Override // defpackage.dqts
    public final dqyj d() {
        return this.e;
    }

    @Override // defpackage.dqts
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        dqpo dqpoVar;
        dqpo dqpoVar2;
        String str;
        dqyj dqyjVar;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqts) {
            dqts dqtsVar = (dqts) obj;
            if (this.a.equals(dqtsVar.c()) && ((dqpoVar = this.b) != null ? dqpoVar.equals(dqtsVar.a()) : dqtsVar.a() == null) && ((dqpoVar2 = this.c) != null ? dqpoVar2.equals(dqtsVar.b()) : dqtsVar.b() == null) && ((str = this.d) != null ? str.equals(dqtsVar.e()) : dqtsVar.e() == null) && ((dqyjVar = this.e) != null ? dqyjVar.equals(dqtsVar.d()) : dqtsVar.d() == null) && ((str2 = this.f) != null ? str2.equals(dqtsVar.f()) : dqtsVar.f() == null) && this.g == dqtsVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dqts
    public final String f() {
        return this.f;
    }

    @Override // defpackage.dqts
    public final boolean g() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        dqpo dqpoVar = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (dqpoVar == null ? 0 : dqpoVar.hashCode())) * 1000003;
        dqpo dqpoVar2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (dqpoVar2 == null ? 0 : dqpoVar2.hashCode())) * 1000003;
        String str = this.d;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        dqyj dqyjVar = this.e;
        int iHashCode5 = (iHashCode4 ^ (dqyjVar == null ? 0 : dqyjVar.hashCode())) * 1000003;
        String str2 = this.f;
        return ((iHashCode5 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ (true != this.g ? 1237 : 1231);
    }

    public final String toString() {
        dqyj dqyjVar = this.e;
        dqpo dqpoVar = this.c;
        dqpo dqpoVar2 = this.b;
        return "JoinSpec{query=" + this.a.toString() + ", joinColumn=" + String.valueOf(dqpoVar2) + ", parentJoinColumn=" + String.valueOf(dqpoVar) + ", onClauseComparator=" + this.d + ", onClause=" + String.valueOf(dqyjVar) + ", retrievalTag=" + this.f + ", isExemptFromIndexRequirementOnJoinedColumn=" + this.g + "}";
    }
}
