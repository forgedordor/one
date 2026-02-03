package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqox extends dqwu {
    private ekgb A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private byte G;
    public String a;
    public ekgb b;
    public String c;
    public ekfw d;
    public ekgb e;
    public String f;
    public ekfw g;
    public ekgb h;
    public dqxe i;
    public String j;
    public String k;
    public dqxe l;
    public String m;
    public String n;
    public Boolean o;
    public ekfw p;
    public ekgb q;
    public ekgi r;
    public ekgp s;
    public dqsb t;
    public String u;
    public ejxr v;
    public String w;
    private boolean x;
    private ekgb y;
    private ekfw z;

    public dqox() {
    }

    @Override // defpackage.dqwu
    public final dqwv a() {
        String str;
        ekgb ekgbVar;
        ekfw ekfwVar = this.d;
        if (ekfwVar != null) {
            this.e = ekfwVar.g();
        } else if (this.e == null) {
            int i = ekgb.d;
            this.e = ekoe.a;
        }
        ekfw ekfwVar2 = this.g;
        if (ekfwVar2 != null) {
            this.h = ekfwVar2.g();
        } else if (this.h == null) {
            int i2 = ekgb.d;
            this.h = ekoe.a;
        }
        ekfw ekfwVar3 = this.p;
        if (ekfwVar3 != null) {
            this.q = ekfwVar3.g();
        } else if (this.q == null) {
            int i3 = ekgb.d;
            this.q = ekoe.a;
        }
        ekgi ekgiVar = this.r;
        if (ekgiVar != null) {
            this.s = ekgiVar.c();
        } else if (this.s == null) {
            this.s = ekoj.a;
        }
        ekfw ekfwVar4 = this.z;
        if (ekfwVar4 != null) {
            this.A = ekfwVar4.g();
        } else if (this.A == null) {
            int i4 = ekgb.d;
            this.A = ekoe.a;
        }
        if (this.G == 63 && (str = this.a) != null && (ekgbVar = this.y) != null) {
            return new dqoy(str, this.x, ekgbVar, this.b, this.c, this.e, this.f, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.s, this.A, this.B, this.t, this.C, this.u, this.v, this.w, this.D, this.E, this.F);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" table");
        }
        if ((this.G & 1) == 0) {
            sb.append(" distinct");
        }
        if (this.y == null) {
            sb.append(" defaultColumns");
        }
        if ((this.G & 2) == 0) {
            sb.append(" exemptFromQueryPlanChecking");
        }
        if ((this.G & 4) == 0) {
            sb.append(" isEmptyProjection");
        }
        if ((this.G & 8) == 0) {
            sb.append(" queryForColumnSizes");
        }
        if ((this.G & 16) == 0) {
            sb.append(" disableCaching");
        }
        if ((this.G & 32) == 0) {
            sb.append(" deliverForeignKeyChangesToObservers");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dqwu
    protected final ekfw b() {
        if (this.z == null) {
            if (this.A == null) {
                int i = ekgb.d;
                this.z = new ekfw();
            } else {
                int i2 = ekgb.d;
                ekfw ekfwVar = new ekfw();
                this.z = ekfwVar;
                ekfwVar.j(this.A);
                this.A = null;
            }
        }
        return this.z;
    }

    @Override // defpackage.dqwu
    public final void c(List list) {
        this.y = ekgb.n(list);
    }

    @Override // defpackage.dqwu
    public final void d(boolean z) {
        this.F = z;
        this.G = (byte) (this.G | 32);
    }

    @Override // defpackage.dqwu
    public final void e(boolean z) {
        this.E = z;
        this.G = (byte) (this.G | 16);
    }

    @Override // defpackage.dqwu
    public final void f(boolean z) {
        this.x = z;
        this.G = (byte) (this.G | 1);
    }

    @Override // defpackage.dqwu
    public final void g(boolean z) {
        this.B = z;
        this.G = (byte) (this.G | 2);
    }

    @Override // defpackage.dqwu
    public final void h(boolean z) {
        this.C = z;
        this.G = (byte) (this.G | 4);
    }

    @Override // defpackage.dqwu
    public final void i(boolean z) {
        this.D = z;
        this.G = (byte) (this.G | 8);
    }

    public dqox(dqwv dqwvVar) {
        dqoy dqoyVar = (dqoy) dqwvVar;
        this.a = dqoyVar.a;
        this.x = dqoyVar.b;
        this.y = dqoyVar.c;
        this.b = dqoyVar.d;
        this.c = dqoyVar.e;
        this.e = dqoyVar.f;
        this.f = dqoyVar.g;
        this.h = dqoyVar.h;
        this.i = dqoyVar.i;
        this.j = dqoyVar.j;
        this.k = dqoyVar.k;
        this.l = dqoyVar.l;
        this.m = dqoyVar.m;
        this.n = dqoyVar.n;
        this.o = dqoyVar.o;
        this.q = dqoyVar.p;
        this.s = dqoyVar.q;
        this.A = dqoyVar.r;
        this.B = dqoyVar.s;
        this.t = dqoyVar.t;
        this.C = dqoyVar.u;
        this.u = dqoyVar.v;
        this.v = dqoyVar.w;
        this.w = dqoyVar.x;
        this.D = dqoyVar.y;
        this.E = dqoyVar.z;
        this.F = dqoyVar.A;
        this.G = (byte) 63;
    }
}
