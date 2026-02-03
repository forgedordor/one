package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqog extends dqpr {
    public String a;
    public Supplier b;
    public dqps c;
    public Supplier d;
    public int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private byte m;

    @Override // defpackage.dqpr
    public final dqpt a() {
        String str;
        int i;
        dqps dqpsVar;
        Supplier supplier;
        if (this.m == 127 && (str = this.a) != null && (i = this.e) != 0 && (dqpsVar = this.c) != null && (supplier = this.d) != null) {
            return new dqoh(str, this.f, this.g, this.h, this.i, this.j, this.k, i, this.b, dqpsVar, this.l, supplier);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" columnName");
        }
        if ((this.m & 1) == 0) {
            sb.append(" isForeignKey");
        }
        if ((this.m & 2) == 0) {
            sb.append(" unique");
        }
        if ((this.m & 4) == 0) {
            sb.append(" sqlNotNull");
        }
        if ((this.m & 8) == 0) {
            sb.append(" isPartOfUniqueMultiColumnIndex");
        }
        if ((this.m & 16) == 0) {
            sb.append(" isPrimaryKey");
        }
        if ((this.m & 32) == 0) {
            sb.append(" hasIndex");
        }
        if (this.e == 0) {
            sb.append(" sqlType");
        }
        if (this.c == null) {
            sb.append(" setterForTesting");
        }
        if ((this.m & 64) == 0) {
            sb.append(" schemaVersion");
        }
        if (this.d == null) {
            sb.append(" databaseInterfaceSupplier");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dqpr
    public final void b(String str) {
        this.a = str;
    }

    @Override // defpackage.dqpr
    public final void c(Supplier supplier) {
        this.d = supplier;
    }

    @Override // defpackage.dqpr
    public final void d(boolean z) {
        this.k = z;
        this.m = (byte) (this.m | 32);
    }

    @Override // defpackage.dqpr
    public final void e(boolean z) {
        this.f = z;
        this.m = (byte) (this.m | 1);
    }

    @Override // defpackage.dqpr
    public final void f(boolean z) {
        this.i = z;
        this.m = (byte) (this.m | 8);
    }

    @Override // defpackage.dqpr
    public final void g(boolean z) {
        this.j = z;
        this.m = (byte) (this.m | 16);
    }

    @Override // defpackage.dqpr
    public final void h(Supplier supplier) {
        this.b = supplier;
    }

    @Override // defpackage.dqpr
    public final void i(int i) {
        this.l = i;
        this.m = (byte) (this.m | 64);
    }

    @Override // defpackage.dqpr
    public final void j(dqps dqpsVar) {
        this.c = dqpsVar;
    }

    @Override // defpackage.dqpr
    public final void k(boolean z) {
        this.h = z;
        this.m = (byte) (this.m | 4);
    }

    @Override // defpackage.dqpr
    public final void l(boolean z) {
        this.g = z;
        this.m = (byte) (this.m | 2);
    }

    @Override // defpackage.dqpr
    public final void m(int i) {
        this.e = i;
    }
}
