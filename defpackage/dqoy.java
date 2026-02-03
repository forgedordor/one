package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqoy extends dqwv {
    public final boolean A;
    public final String a;
    public final boolean b;
    public final ekgb c;
    public final ekgb d;
    public final String e;
    public final ekgb f;
    public final String g;
    public final ekgb h;
    public final dqxe i;
    public final String j;
    public final String k;
    public final dqxe l;
    public final String m;
    public final String n;
    public final Boolean o;
    public final ekgb p;
    public final ekgp q;
    public final ekgb r;
    public final boolean s;
    public final dqsb t;
    public final boolean u;
    public final String v;
    public final ejxr w;
    public final String x;
    public final boolean y;
    public final boolean z;

    public dqoy(String str, boolean z, ekgb ekgbVar, ekgb ekgbVar2, String str2, ekgb ekgbVar3, String str3, ekgb ekgbVar4, dqxe dqxeVar, String str4, String str5, dqxe dqxeVar2, String str6, String str7, Boolean bool, ekgb ekgbVar5, ekgp ekgpVar, ekgb ekgbVar6, boolean z2, dqsb dqsbVar, boolean z3, String str8, ejxr ejxrVar, String str9, boolean z4, boolean z5, boolean z6) {
        this.a = str;
        this.b = z;
        this.c = ekgbVar;
        this.d = ekgbVar2;
        this.e = str2;
        this.f = ekgbVar3;
        this.g = str3;
        this.h = ekgbVar4;
        this.i = dqxeVar;
        this.j = str4;
        this.k = str5;
        this.l = dqxeVar2;
        this.m = str6;
        this.n = str7;
        this.o = bool;
        this.p = ekgbVar5;
        this.q = ekgpVar;
        this.r = ekgbVar6;
        this.s = z2;
        this.t = dqsbVar;
        this.u = z3;
        this.v = str8;
        this.w = ejxrVar;
        this.x = str9;
        this.y = z4;
        this.z = z5;
        this.A = z6;
    }

    @Override // defpackage.dqwv
    public final boolean A() {
        return this.y;
    }

    @Override // defpackage.dqwv
    public final dqsb a() {
        return this.t;
    }

    @Override // defpackage.dqwv
    public final dqxe b() {
        return this.l;
    }

    @Override // defpackage.dqwv
    public final dqxe c() {
        return this.i;
    }

    @Override // defpackage.dqwv
    public final ejxr d() {
        return this.w;
    }

    @Override // defpackage.dqwv
    public final ekgb e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        ekgb ekgbVar;
        String str;
        String str2;
        dqxe dqxeVar;
        String str3;
        String str4;
        dqxe dqxeVar2;
        String str5;
        String str6;
        Boolean bool;
        dqsb dqsbVar;
        String str7;
        ejxr ejxrVar;
        String str8;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqwv) {
            dqwv dqwvVar = (dqwv) obj;
            if (this.a.equals(dqwvVar.t()) && this.b == dqwvVar.x() && ekjz.h(this.c, dqwvVar.e()) && ((ekgbVar = this.d) != null ? ekjz.h(ekgbVar, dqwvVar.h()) : dqwvVar.h() == null) && ((str = this.e) != null ? str.equals(dqwvVar.o()) : dqwvVar.o() == null) && ekjz.h(this.f, dqwvVar.g()) && ((str2 = this.g) != null ? str2.equals(dqwvVar.s()) : dqwvVar.s() == null) && ekjz.h(this.h, dqwvVar.j()) && ((dqxeVar = this.i) != null ? dqxeVar.equals(dqwvVar.c()) : dqwvVar.c() == null) && ((str3 = this.j) != null ? str3.equals(dqwvVar.r()) : dqwvVar.r() == null) && ((str4 = this.k) != null ? str4.equals(dqwvVar.n()) : dqwvVar.n() == null) && ((dqxeVar2 = this.l) != null ? dqxeVar2.equals(dqwvVar.b()) : dqwvVar.b() == null) && ((str5 = this.m) != null ? str5.equals(dqwvVar.p()) : dqwvVar.p() == null) && ((str6 = this.n) != null ? str6.equals(dqwvVar.q()) : dqwvVar.q() == null) && ((bool = this.o) != null ? bool.equals(dqwvVar.l()) : dqwvVar.l() == null) && ekjz.h(this.p, dqwvVar.i()) && ekmi.m(this.q, dqwvVar.k()) && ekjz.h(this.r, dqwvVar.f()) && this.s == dqwvVar.y() && ((dqsbVar = this.t) != null ? dqsbVar.equals(dqwvVar.a()) : dqwvVar.a() == null) && this.u == dqwvVar.z() && ((str7 = this.v) != null ? str7.equals(dqwvVar.u()) : dqwvVar.u() == null) && ((ejxrVar = this.w) != null ? ejxrVar.equals(dqwvVar.d()) : dqwvVar.d() == null) && ((str8 = this.x) != null ? str8.equals(dqwvVar.m()) : dqwvVar.m() == null) && this.y == dqwvVar.A() && this.z == dqwvVar.w() && this.A == dqwvVar.v()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dqwv
    public final ekgb f() {
        return this.r;
    }

    @Override // defpackage.dqwv
    public final ekgb g() {
        return this.f;
    }

    @Override // defpackage.dqwv
    public final ekgb h() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
        ekgb ekgbVar = this.d;
        int iHashCode2 = ((iHashCode * 1000003) ^ (ekgbVar == null ? 0 : ekgbVar.hashCode())) * 1000003;
        String str = this.e;
        int iHashCode3 = (((iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003;
        String str2 = this.g;
        int iHashCode4 = (((iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003;
        dqxe dqxeVar = this.i;
        int iHashCode5 = (iHashCode4 ^ (dqxeVar == null ? 0 : dqxeVar.hashCode())) * 1000003;
        String str3 = this.j;
        int iHashCode6 = (iHashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.k;
        int iHashCode7 = (iHashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        dqxe dqxeVar2 = this.l;
        int iHashCode8 = (iHashCode7 ^ (dqxeVar2 == null ? 0 : dqxeVar2.hashCode())) * 1000003;
        String str5 = this.m;
        int iHashCode9 = (iHashCode8 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.n;
        int iHashCode10 = (iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        Boolean bool = this.o;
        int iHashCode11 = (((((((((iHashCode10 ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ (true != this.s ? 1237 : 1231)) * 1000003;
        dqsb dqsbVar = this.t;
        int iHashCode12 = (((iHashCode11 ^ (dqsbVar == null ? 0 : dqsbVar.hashCode())) * 1000003) ^ (true != this.u ? 1237 : 1231)) * 1000003;
        String str7 = this.v;
        int iHashCode13 = (iHashCode12 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        ejxr ejxrVar = this.w;
        int iHashCode14 = (iHashCode13 ^ (ejxrVar == null ? 0 : ejxrVar.hashCode())) * 1000003;
        String str8 = this.x;
        return ((((((iHashCode14 ^ (str8 != null ? str8.hashCode() : 0)) * 1000003) ^ (true != this.y ? 1237 : 1231)) * 1000003) ^ (true != this.z ? 1237 : 1231)) * 1000003) ^ (true == this.A ? 1231 : 1237);
    }

    @Override // defpackage.dqwv
    public final ekgb i() {
        return this.p;
    }

    @Override // defpackage.dqwv
    public final ekgb j() {
        return this.h;
    }

    @Override // defpackage.dqwv
    public final ekgp k() {
        return this.q;
    }

    @Override // defpackage.dqwv
    public final Boolean l() {
        return this.o;
    }

    @Override // defpackage.dqwv
    public final String m() {
        return this.x;
    }

    @Override // defpackage.dqwv
    public final String n() {
        return this.k;
    }

    @Override // defpackage.dqwv
    public final String o() {
        return this.e;
    }

    @Override // defpackage.dqwv
    public final String p() {
        return this.m;
    }

    @Override // defpackage.dqwv
    public final String q() {
        return this.n;
    }

    @Override // defpackage.dqwv
    public final String r() {
        return this.j;
    }

    @Override // defpackage.dqwv
    public final String s() {
        return this.g;
    }

    @Override // defpackage.dqwv
    public final String t() {
        return this.a;
    }

    public final String toString() {
        ejxr ejxrVar = this.w;
        dqsb dqsbVar = this.t;
        ekgb ekgbVar = this.r;
        ekgp ekgpVar = this.q;
        ekgb ekgbVar2 = this.p;
        dqxe dqxeVar = this.l;
        dqxe dqxeVar2 = this.i;
        ekgb ekgbVar3 = this.h;
        ekgb ekgbVar4 = this.f;
        ekgb ekgbVar5 = this.d;
        String string = this.c.toString();
        String strValueOf = String.valueOf(ekgbVar5);
        String strValueOf2 = String.valueOf(ekgbVar4);
        String strValueOf3 = String.valueOf(ekgbVar3);
        String strValueOf4 = String.valueOf(dqxeVar2);
        String strValueOf5 = String.valueOf(dqxeVar);
        String strValueOf6 = String.valueOf(ekgbVar2);
        String strValueOf7 = String.valueOf(ekgpVar);
        String strValueOf8 = String.valueOf(ekgbVar);
        String strValueOf9 = String.valueOf(dqsbVar);
        String strValueOf10 = String.valueOf(ejxrVar);
        StringBuilder sb = new StringBuilder("QueryParameters{table=");
        sb.append(this.a);
        sb.append(", distinct=");
        sb.append(this.b);
        sb.append(", defaultColumns=");
        sb.append(string);
        sb.append(", projection=");
        sb.append(strValueOf);
        sb.append(", index=");
        sb.append(this.e);
        sb.append(", expressions=");
        sb.append(strValueOf2);
        sb.append(", staticWhereClause=");
        sb.append(this.g);
        sb.append(", whereClauses=");
        sb.append(strValueOf3);
        sb.append(", orderBy=");
        sb.append(strValueOf4);
        sb.append(", orderByForUnion=");
        sb.append(this.j);
        sb.append(", groupBy=");
        sb.append(this.k);
        sb.append(", having=");
        sb.append(strValueOf5);
        sb.append(", limit=");
        sb.append(this.m);
        sb.append(", offset=");
        sb.append(this.n);
        sb.append(", disableTableFilters=");
        sb.append(this.o);
        sb.append(", unions=");
        sb.append(strValueOf6);
        sb.append(", substitutions=");
        sb.append(strValueOf7);
        sb.append(", dynamicJoins=");
        sb.append(strValueOf8);
        sb.append(", exemptFromQueryPlanChecking=");
        sb.append(this.s);
        sb.append(", loggingTag=");
        sb.append(strValueOf9);
        boolean z = this.A;
        boolean z2 = this.z;
        boolean z3 = this.y;
        String str = this.x;
        String str2 = this.v;
        boolean z4 = this.u;
        sb.append(", isEmptyProjection=");
        sb.append(z4);
        sb.append(", tableAs=");
        sb.append(str2);
        sb.append(", canonicalSql=");
        sb.append(strValueOf10);
        sb.append(", databaseName=");
        sb.append(str);
        sb.append(", queryForColumnSizes=");
        sb.append(z3);
        sb.append(", disableCaching=");
        sb.append(z2);
        sb.append(", deliverForeignKeyChangesToObservers=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.dqwv
    public final String u() {
        return this.v;
    }

    @Override // defpackage.dqwv
    public final boolean v() {
        return this.A;
    }

    @Override // defpackage.dqwv
    public final boolean w() {
        return this.z;
    }

    @Override // defpackage.dqwv
    public final boolean x() {
        return this.b;
    }

    @Override // defpackage.dqwv
    public final boolean y() {
        return this.s;
    }

    @Override // defpackage.dqwv
    public final boolean z() {
        return this.u;
    }
}
