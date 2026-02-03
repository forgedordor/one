package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mcq {
    public final boolean C;
    public final ekgp D;
    public final ekhx E;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final ekgb m;
    public final ekgb n;
    public final ekgb p;
    public final int r;
    public final int s;
    public final ekgb t;
    public final mco u;
    public final ekgb v;
    public final boolean x;
    public final int y;
    public final int e = 0;
    public final int f = 0;
    public final int g = 0;
    public final int h = 0;
    public final int o = 0;
    public final int q = 0;
    public final int w = 0;
    public final boolean z = false;
    public final boolean A = false;
    public final boolean B = false;

    static {
        new mcq(new mcp());
        mgb.O(1);
        mgb.O(2);
        mgb.O(3);
        mgb.O(4);
        mgb.O(5);
        mgb.O(6);
        mgb.O(7);
        mgb.O(8);
        mgb.O(9);
        mgb.O(10);
        mgb.O(11);
        mgb.O(12);
        mgb.O(13);
        mgb.O(14);
        mgb.O(15);
        mgb.O(16);
        mgb.O(17);
        mgb.O(18);
        mgb.O(19);
        mgb.O(20);
        mgb.O(21);
        mgb.O(22);
        mgb.O(23);
        mgb.O(24);
        mgb.O(25);
        mgb.O(26);
        mgb.O(27);
        mgb.O(28);
        mgb.O(29);
        mgb.O(30);
        mgb.O(31);
        mgb.O(32);
        mgb.O(33);
        mgb.O(34);
    }

    protected mcq(mcp mcpVar) {
        this.a = mcpVar.a;
        this.b = mcpVar.b;
        this.c = mcpVar.c;
        this.d = mcpVar.d;
        this.i = mcpVar.e;
        this.j = mcpVar.f;
        this.k = mcpVar.g;
        this.l = mcpVar.h;
        this.m = mcpVar.i;
        this.n = mcpVar.j;
        this.p = mcpVar.k;
        this.r = mcpVar.l;
        this.s = mcpVar.m;
        this.t = mcpVar.n;
        this.u = mcpVar.o;
        this.v = mcpVar.p;
        this.x = mcpVar.q;
        this.y = mcpVar.r;
        this.C = mcpVar.s;
        this.D = ekgp.j(mcpVar.t);
        this.E = ekhx.o(mcpVar.u);
    }

    public mcp a() {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mcq mcqVar = (mcq) obj;
            if (this.a == mcqVar.a && this.b == mcqVar.b && this.c == mcqVar.c && this.d == mcqVar.d && this.l == mcqVar.l && this.i == mcqVar.i && this.j == mcqVar.j && this.k == mcqVar.k && ekjz.h(this.m, mcqVar.m) && ekjz.h(this.n, mcqVar.n) && ekjz.h(this.p, mcqVar.p) && this.r == mcqVar.r && this.s == mcqVar.s && ekjz.h(this.t, mcqVar.t) && this.u.equals(mcqVar.u) && ekjz.h(this.v, mcqVar.v) && this.x == mcqVar.x && this.y == mcqVar.y && this.C == mcqVar.C && this.D.equals(mcqVar.D) && this.E.equals(mcqVar.E)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 28629151) + (this.l ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31) + (this.k ? 1 : 0)) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 961) + this.p.hashCode()) * 961) + this.r) * 31) + this.s) * 31) + this.t.hashCode()) * 31) + 29791) * 31) + this.v.hashCode()) * 961) + (this.x ? 1 : 0)) * 31) + this.y) * 923521) + (this.C ? 1 : 0)) * 31) + this.D.hashCode()) * 31) + this.E.hashCode();
    }
}
