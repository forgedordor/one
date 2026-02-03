package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rxj implements Cloneable {
    public Float A;
    public rxt B;
    public Float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public long a = 0;
    public rxt b;
    public Float c;
    public rxt d;
    public Float e;
    public rwu f;
    public Float g;
    public rwu[] h;
    public rwu i;
    public Float j;
    public rwl k;
    public List l;
    public rwu m;
    public Integer n;
    public Boolean o;
    public rwi p;
    public String q;
    public String r;
    public String s;
    public Boolean t;
    public Boolean u;
    public rxt v;
    public Float w;
    public String x;
    public String y;
    public rxt z;

    protected rxj() {
    }

    public static rxj a() {
        rxj rxjVar = new rxj();
        rxjVar.a = -1L;
        rwl rwlVar = rwl.a;
        rxjVar.b = rwlVar;
        rxjVar.D = 1;
        Float fValueOf = Float.valueOf(1.0f);
        rxjVar.c = fValueOf;
        rxjVar.d = null;
        rxjVar.e = fValueOf;
        rxjVar.f = new rwu(1.0f);
        rxjVar.E = 1;
        rxjVar.F = 1;
        rxjVar.g = Float.valueOf(4.0f);
        rxjVar.h = null;
        rxjVar.i = new rwu(0.0f);
        rxjVar.j = fValueOf;
        rxjVar.k = rwlVar;
        rxjVar.l = null;
        rxjVar.m = new rwu(12.0f, 7);
        rxjVar.n = 400;
        rxjVar.G = 1;
        rxjVar.H = 1;
        rxjVar.I = 1;
        rxjVar.J = 1;
        rxjVar.o = true;
        rxjVar.p = null;
        rxjVar.q = null;
        rxjVar.r = null;
        rxjVar.s = null;
        rxjVar.t = Boolean.TRUE;
        rxjVar.u = Boolean.TRUE;
        rxjVar.v = rwlVar;
        rxjVar.w = fValueOf;
        rxjVar.x = null;
        rxjVar.K = 1;
        rxjVar.y = null;
        rxjVar.z = null;
        rxjVar.A = fValueOf;
        rxjVar.B = null;
        rxjVar.C = fValueOf;
        rxjVar.L = 1;
        return rxjVar;
    }

    protected final Object clone() {
        try {
            rxj rxjVar = (rxj) super.clone();
            rwu[] rwuVarArr = this.h;
            if (rwuVarArr != null) {
                rxjVar.h = (rwu[]) rwuVarArr.clone();
            }
            return rxjVar;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }
}
