package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqoh extends dqpt {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final Supplier g;
    public final int h;
    public final Supplier i;
    public final int j;
    private final boolean k;
    private final dqps l;

    public dqoh(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, Supplier supplier, dqps dqpsVar, int i2, Supplier supplier2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.k = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.j = i;
        this.g = supplier;
        this.l = dqpsVar;
        this.h = i2;
        this.i = supplier2;
    }

    @Override // defpackage.dqpt
    public final int a() {
        return this.h;
    }

    @Override // defpackage.dqpt
    public final dqps b() {
        return this.l;
    }

    @Override // defpackage.dqpt
    public final String c() {
        return this.a;
    }

    @Override // defpackage.dqpt
    public final Supplier d() {
        return this.i;
    }

    @Override // defpackage.dqpt
    public final Supplier e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        Supplier supplier;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqpt) {
            dqpt dqptVar = (dqpt) obj;
            if (this.a.equals(dqptVar.c()) && this.b == dqptVar.g() && this.c == dqptVar.k() && this.k == dqptVar.j() && this.d == dqptVar.h() && this.e == dqptVar.i() && this.f == dqptVar.f() && this.j == dqptVar.l() && ((supplier = this.g) != null ? supplier.equals(dqptVar.e()) : dqptVar.e() == null) && this.l.equals(dqptVar.b()) && this.h == dqptVar.a() && this.i.equals(dqptVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dqpt
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.dqpt
    public final boolean g() {
        return this.b;
    }

    @Override // defpackage.dqpt
    public final boolean h() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        Supplier supplier = this.g;
        return (((((((((((((((((((((iHashCode * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true == this.f ? 1231 : 1237)) * 1000003) ^ this.j) * 1000003) ^ (supplier == null ? 0 : supplier.hashCode())) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.dqpt
    public final boolean i() {
        return this.e;
    }

    @Override // defpackage.dqpt
    public final boolean j() {
        return this.k;
    }

    @Override // defpackage.dqpt
    public final boolean k() {
        return this.c;
    }

    @Override // defpackage.dqpt
    public final int l() {
        return this.j;
    }

    public final String toString() {
        String str;
        switch (this.j) {
            case 1:
                str = "INT";
                break;
            case 2:
                str = "INTEGER";
                break;
            case 3:
                str = "REAL";
                break;
            case 4:
                str = "TEXT";
                break;
            case 5:
                str = "BLOB";
                break;
            case 6:
                str = "NUMERIC";
                break;
            case 7:
                str = "DEPRECATED_STRING";
                break;
            default:
                str = "NOT_SPECIFIED";
                break;
        }
        Supplier supplier = this.g;
        dqps dqpsVar = this.l;
        Supplier supplier2 = this.i;
        return "ColumnReferenceData{columnName=" + this.a + ", isForeignKey=" + this.b + ", unique=" + this.c + ", sqlNotNull=" + this.k + ", isPartOfUniqueMultiColumnIndex=" + this.d + ", isPrimaryKey=" + this.e + ", hasIndex=" + this.f + ", sqlType=" + str + ", parent=" + String.valueOf(supplier) + ", setterForTesting=" + dqpsVar.toString() + ", schemaVersion=" + this.h + ", databaseInterfaceSupplier=" + supplier2.toString() + "}";
    }
}
