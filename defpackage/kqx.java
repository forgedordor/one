package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kqx implements krg {
    public Object a;
    public float ab;
    public float ac;
    public kre ad;
    public kre ae;
    public Object af;
    public krz ag;
    public final HashMap ah;
    public HashMap ai;
    kqm aj;
    final krj b;
    public krn c = null;
    public int d = 0;
    public int e = 0;
    public float f = -1.0f;
    public float g = -1.0f;
    protected float h = 0.5f;
    protected float i = 0.5f;
    protected int j = 0;
    protected int k = 0;
    protected int l = 0;
    protected int m = 0;
    protected int n = 0;
    protected int o = 0;
    protected int p = 0;
    protected int q = 0;
    protected int r = 0;
    protected int s = 0;
    protected int t = 0;
    protected int u = 0;
    int v = 0;
    int w = 0;
    float x = Float.NaN;
    float y = Float.NaN;
    float z = Float.NaN;
    float A = Float.NaN;
    float B = Float.NaN;
    float C = Float.NaN;
    float D = Float.NaN;
    float E = Float.NaN;
    float F = Float.NaN;
    float G = Float.NaN;
    float H = Float.NaN;
    int I = 0;
    protected Object J = null;
    protected Object K = null;
    protected Object L = null;
    protected Object M = null;
    protected Object N = null;
    protected Object O = null;
    protected Object P = null;
    protected Object Q = null;
    protected Object R = null;
    protected Object S = null;
    Object T = null;
    protected Object U = null;
    protected Object V = null;
    Object W = null;
    Object X = null;
    Object Y = null;
    Object Z = null;
    Object aa = null;
    public int ak = 0;

    public kqx(krj krjVar) {
        Object obj = kre.b;
        this.ad = kre.b(obj);
        this.ae = kre.b(obj);
        this.ah = new HashMap();
        this.ai = new HashMap();
        this.aj = null;
        this.b = krjVar;
    }

    private final void x(krz krzVar, Object obj, int i) {
        krz krzVarB = obj instanceof krg ? ((krg) obj).b() : null;
        if (krzVarB == null) {
            return;
        }
        int i2 = i - 1;
        int i3 = kqw.b;
        if (i2 == 19) {
            krzVar.r(krzVarB, this.ab, (int) this.ac);
            return;
        }
        switch (i2) {
            case 0:
                krzVar.V(2).n(krzVarB.V(2), this.j, this.p, false);
                break;
            case 1:
                krzVar.V(2).n(krzVarB.V(4), this.j, this.p, false);
                break;
            case 2:
                krzVar.V(4).n(krzVarB.V(2), this.k, this.q, false);
                break;
            case 3:
                krzVar.V(4).n(krzVarB.V(4), this.k, this.q, false);
                break;
            case 4:
                krzVar.V(2).n(krzVarB.V(2), this.l, this.r, false);
                break;
            case 5:
                krzVar.V(2).n(krzVarB.V(4), this.l, this.r, false);
                break;
            case 6:
                krzVar.V(4).n(krzVarB.V(2), this.m, this.s, false);
                break;
            case 7:
                krzVar.V(4).n(krzVarB.V(4), this.m, this.s, false);
                break;
            case 8:
                krzVar.V(3).n(krzVarB.V(3), this.n, this.t, false);
                break;
            case 9:
                krzVar.V(3).n(krzVarB.V(5), this.n, this.t, false);
                break;
            case 10:
                krzVar.aa(3, krzVarB, 6, this.n, this.t);
                break;
            case 11:
                krzVar.V(5).n(krzVarB.V(3), this.o, this.u, false);
                break;
            case 12:
                krzVar.V(5).n(krzVarB.V(5), this.o, this.u, false);
                break;
            case 13:
                krzVar.aa(5, krzVarB, 6, this.o, this.u);
                break;
            case 14:
                krzVar.aa(6, krzVarB, 6, this.v, this.w);
                break;
            case 15:
                krzVar.aa(6, krzVarB, 3, this.v, this.w);
                break;
            case 16:
                krzVar.aa(6, krzVarB, 5, this.v, this.w);
                break;
        }
    }

    @Override // defpackage.krg
    public final krn a() {
        return this.c;
    }

    @Override // defpackage.krg
    public krz b() {
        krz krzVar = this.ag;
        if (krzVar != null) {
            return krzVar;
        }
        krz krzVar2 = new krz(this.ad.j, this.ae.j);
        this.ag = krzVar2;
        krzVar2.aq = this.af;
        return krzVar2;
    }

    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof kqx) ? (krg) this.b.e.get(obj) : obj;
    }

    @Override // defpackage.krg
    public final Object d() {
        return this.a;
    }

    @Override // defpackage.krg
    public void e() {
        if (this.ag == null) {
            return;
        }
        krn krnVar = this.c;
        if (krnVar != null) {
            krnVar.e();
        }
        this.ad.d(this.ag, 0);
        this.ae.d(this.ag, 1);
        this.J = c(this.J);
        this.K = c(this.K);
        this.L = c(this.L);
        this.M = c(this.M);
        this.N = c(this.N);
        this.O = c(this.O);
        this.P = c(this.P);
        this.Q = c(this.Q);
        this.R = c(this.R);
        this.S = c(this.S);
        this.U = c(this.U);
        this.V = c(this.V);
        this.X = c(this.X);
        this.Y = c(this.Y);
        this.Z = c(this.Z);
        x(this.ag, this.J, 1);
        x(this.ag, this.K, 2);
        x(this.ag, this.L, 3);
        x(this.ag, this.M, 4);
        x(this.ag, this.N, 5);
        x(this.ag, this.O, 6);
        x(this.ag, this.P, 7);
        x(this.ag, this.Q, 8);
        x(this.ag, this.R, 9);
        x(this.ag, this.S, 10);
        x(this.ag, this.T, 11);
        x(this.ag, this.U, 12);
        x(this.ag, this.V, 13);
        x(this.ag, this.W, 14);
        x(this.ag, this.X, 15);
        x(this.ag, this.Y, 16);
        x(this.ag, this.Z, 17);
        x(this.ag, this.aa, 20);
        int i = this.d;
        if (i != 0) {
            this.ag.at = i;
        }
        int i2 = this.e;
        if (i2 != 0) {
            this.ag.au = i2;
        }
        float f = this.f;
        if (f != -1.0f) {
            this.ag.E(f);
        }
        float f2 = this.g;
        if (f2 != -1.0f) {
            this.ag.M(f2);
        }
        krz krzVar = this.ag;
        krzVar.ao = this.h;
        krzVar.ap = this.i;
        krk krkVar = krzVar.u;
        krkVar.f = this.x;
        krkVar.g = this.y;
        krkVar.h = this.z;
        krkVar.i = this.A;
        krkVar.j = this.B;
        krkVar.k = this.C;
        krkVar.l = this.D;
        krkVar.m = this.E;
        krkVar.n = this.G;
        krkVar.o = this.H;
        krkVar.p = this.F;
        int i3 = this.I;
        krkVar.q = i3;
        krzVar.ar = i3;
        krkVar.s = this.aj;
        HashMap map = this.ah;
        for (String str : map.keySet()) {
            Integer num = (Integer) map.get(str);
            krk krkVar2 = this.ag.u;
            int iIntValue = num.intValue();
            HashMap map2 = krkVar2.r;
            if (map2.containsKey(str)) {
                ((kqk) map2.get(str)).c = iIntValue;
            } else {
                map2.put(str, new kqk(str, iIntValue));
            }
        }
        HashMap map3 = this.ai;
        if (map3 != null) {
            for (String str2 : map3.keySet()) {
                float fFloatValue = ((Float) this.ai.get(str2)).floatValue();
                HashMap map4 = this.ag.u.r;
                if (map4.containsKey(str2)) {
                    ((kqk) map4.get(str2)).d = fFloatValue;
                } else {
                    map4.put(str2, new kqk(str2, fFloatValue));
                }
            }
        }
    }

    @Override // defpackage.krg
    public final void f(krz krzVar) {
        if (krzVar == null) {
            return;
        }
        this.ag = krzVar;
        krzVar.aq = this.af;
    }

    public final void g(krn krnVar) {
        this.c = krnVar;
        f(krnVar.b());
    }

    public final void h(Object obj) {
        this.ak = 15;
        this.X = obj;
    }

    public final void i(Object obj) {
        this.ak = 13;
        this.V = obj;
    }

    public final void j(Object obj) {
        this.ak = 12;
        this.U = obj;
    }

    public final void k() {
        int i = this.ak;
        if (i == 0) {
            this.J = null;
            this.K = null;
            this.j = 0;
            this.L = null;
            this.M = null;
            this.k = 0;
            this.N = null;
            this.O = null;
            this.l = 0;
            this.P = null;
            this.Q = null;
            this.m = 0;
            this.R = null;
            this.S = null;
            this.n = 0;
            this.U = null;
            this.V = null;
            this.o = 0;
            this.X = null;
            this.aa = null;
            this.h = 0.5f;
            this.i = 0.5f;
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 0;
            return;
        }
        int i2 = i - 1;
        if (i2 == 19) {
            this.aa = null;
            return;
        }
        switch (i2) {
            case 0:
            case 1:
                this.J = null;
                this.K = null;
                this.j = 0;
                this.p = 0;
                break;
            case 2:
            case 3:
                this.L = null;
                this.M = null;
                this.k = 0;
                this.q = 0;
                break;
            case 4:
            case 5:
                this.N = null;
                this.O = null;
                this.l = 0;
                this.r = 0;
                break;
            case 6:
            case 7:
                this.P = null;
                this.Q = null;
                this.m = 0;
                this.s = 0;
                break;
            case 8:
            case 9:
            case 10:
                this.R = null;
                this.S = null;
                this.T = null;
                this.n = 0;
                this.t = 0;
                break;
            case 11:
            case 12:
            case 13:
                this.U = null;
                this.V = null;
                this.W = null;
                this.o = 0;
                this.u = 0;
                break;
            case 14:
                this.X = null;
                break;
        }
    }

    public final void l(Object obj) {
        this.ak = 8;
        this.Q = obj;
    }

    public final void m(Object obj) {
        this.ak = 7;
        this.P = obj;
    }

    public final void n(Object obj) {
        this.ak = 1;
        this.J = obj;
    }

    public void o(int i) {
        int i2 = this.ak;
        if (i2 == 0) {
            this.j = i;
            this.k = i;
            this.l = i;
            this.m = i;
            this.n = i;
            this.o = i;
            return;
        }
        int i3 = i2 - 1;
        if (i3 == 19) {
            this.ac = i;
            return;
        }
        switch (i3) {
            case 0:
            case 1:
                this.j = i;
                break;
            case 2:
            case 3:
                this.k = i;
                break;
            case 4:
            case 5:
                this.l = i;
                break;
            case 6:
            case 7:
                this.m = i;
                break;
            case 8:
            case 9:
            case 10:
                this.n = i;
                break;
            case 11:
            case 12:
            case 13:
                this.o = i;
                break;
            case 14:
            case 15:
            case 16:
                this.v = i;
                break;
        }
    }

    public final void p(int i) {
        int i2 = this.ak;
        if (i2 == 0) {
            this.p = i;
            this.q = i;
            this.r = i;
            this.s = i;
            this.t = i;
            this.u = i;
            return;
        }
        switch (i2 - 1) {
            case 0:
            case 1:
                this.p = i;
                break;
            case 2:
            case 3:
                this.q = i;
                break;
            case 4:
            case 5:
                this.r = i;
                break;
            case 6:
            case 7:
                this.s = i;
                break;
            case 8:
            case 9:
            case 10:
                this.t = i;
                break;
            case 11:
            case 12:
            case 13:
                this.u = i;
                break;
            case 14:
            case 15:
            case 16:
                this.w = i;
                break;
        }
    }

    public final void q(Object obj) {
        p(this.b.a(obj));
    }

    public final void r(Object obj) {
        this.ak = 4;
        this.M = obj;
    }

    public final void s(Object obj) {
        this.ak = 6;
        this.O = obj;
    }

    public final void t(Object obj) {
        this.ak = 5;
        this.N = obj;
    }

    public final void u(Object obj) {
        this.ak = 10;
        this.S = obj;
    }

    public final void v(Object obj) {
        this.ak = 9;
        this.R = obj;
    }

    public void w(Object obj) {
        o(this.b.a(obj));
    }
}
