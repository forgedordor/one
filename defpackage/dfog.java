package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfog extends dfoc {
    private static volatile dfog b;
    private static final Object e = new Object();
    public final dfof a;

    private dfog() {
        super("CslibSettings__");
        this.a = new dfof(this);
    }

    public static boolean A() {
        return ((Boolean) o().a.O.a()).booleanValue();
    }

    public static boolean B() {
        return ((Boolean) o().a.aI.a()).booleanValue();
    }

    public static boolean C() {
        return ((Boolean) o().a.g.a()).booleanValue();
    }

    public static boolean D() {
        return ((Boolean) o().a.h.a()).booleanValue();
    }

    public static boolean E() {
        return ((Boolean) o().a.ar.a()).booleanValue();
    }

    public static boolean F() {
        return ((Boolean) o().a.I.a()).booleanValue();
    }

    public static boolean G() {
        return ((Boolean) o().a.k.a()).booleanValue() && !o().M();
    }

    public static boolean H() {
        return ((Boolean) o().a.m.a()).booleanValue() && !o().M();
    }

    public static boolean I() {
        return ((Boolean) o().a.n.a()).booleanValue() && !o().M();
    }

    public static boolean J() {
        return ((Boolean) o().a.aA.a()).booleanValue();
    }

    public static boolean K() {
        return ((Boolean) o().a.aJ.a()).booleanValue();
    }

    public static boolean L() {
        return ((Boolean) o().a.a.a()).booleanValue();
    }

    public static boolean N() {
        return ((Boolean) o().a.az.a()).booleanValue();
    }

    public static boolean O() {
        return ((Boolean) o().a.aq.a()).booleanValue();
    }

    public static boolean P() {
        return ((Boolean) o().a.d.a()).booleanValue();
    }

    public static boolean Q() {
        return ((Boolean) o().a.ac.a()).booleanValue();
    }

    public static boolean R() {
        return ((Boolean) o().a.ay.a()).booleanValue();
    }

    public static boolean S() {
        return ((Boolean) o().a.ab.a()).booleanValue();
    }

    public static boolean T() {
        return ((Boolean) o().a.J.a()).booleanValue();
    }

    public static int a() {
        return ((Integer) o().a.al.a()).intValue();
    }

    public static int c() {
        return ((Integer) o().a.am.a()).intValue();
    }

    public static int d() {
        return ((Integer) o().a.ah.a()).intValue();
    }

    public static long n() {
        return ((Long) o().a.w.a()).longValue();
    }

    public static dfog o() {
        if (b == null) {
            u();
        }
        return b;
    }

    public static Double p() {
        return (Double) o().a.V.a();
    }

    public static String q() {
        return (String) o().a.F.a();
    }

    public static String r() {
        return (String) o().a.C.a();
    }

    public static String s() {
        return (String) o().a.E.a();
    }

    public static String t() {
        return (String) o().a.D.a();
    }

    static void u() {
        synchronized (e) {
            if (b == null) {
                b = new dfog();
                b.l();
            }
        }
    }

    public static boolean v() {
        return ((Boolean) o().a.U.a()).booleanValue();
    }

    public static boolean w() {
        return ((Boolean) o().a.r.a()).booleanValue();
    }

    public static boolean x() {
        return ((Boolean) o().a.z.a()).booleanValue() && !o().M();
    }

    public static boolean y() {
        return ((Boolean) o().a.f.a()).booleanValue();
    }

    @Deprecated
    public static boolean z() {
        return ((Boolean) o().a.ag.a()).booleanValue();
    }

    public final boolean M() {
        return ((Boolean) this.a.aG.a()).booleanValue();
    }

    @Override // defpackage.dfoc
    protected final ekgb b() {
        dfof dfofVar = this.a;
        dfny dfnyVar = dfofVar.ap;
        dfoa dfoaVar = dfofVar.k;
        dfoa dfoaVar2 = dfofVar.j;
        dfoa dfoaVar3 = dfofVar.i;
        dfoa dfoaVar4 = dfofVar.h;
        dfoa dfoaVar5 = dfofVar.g;
        dfoa dfoaVar6 = dfofVar.f;
        dfoa dfoaVar7 = dfofVar.e;
        dfoa dfoaVar8 = dfofVar.d;
        dfoa dfoaVar9 = dfofVar.c;
        dfoa dfoaVar10 = dfofVar.b;
        return ekgb.C(dfofVar.a, dfofVar.at, dfoaVar10, dfoaVar9, dfoaVar8, dfoaVar7, dfoaVar6, dfoaVar5, dfoaVar4, dfoaVar3, dfoaVar2, dfoaVar, dfofVar.Z, dfofVar.l, dfofVar.m, dfofVar.n, dfofVar.o, dfofVar.p, dfofVar.q, dfofVar.r, dfofVar.s, dfofVar.t, dfofVar.u, dfofVar.v, dfofVar.w, dfofVar.x, dfofVar.z, dfofVar.A, dfofVar.y, dfofVar.B, dfofVar.C, dfofVar.D, dfofVar.E, dfofVar.F, dfofVar.G, dfofVar.H, dfofVar.I, dfofVar.J, dfofVar.K, dfofVar.L, dfofVar.M, dfofVar.N, dfofVar.O, dfofVar.P, dfofVar.Q, dfofVar.Y, dfofVar.R, dfofVar.S, dfofVar.T, dfofVar.U, dfofVar.V, dfofVar.W, dfofVar.X, dfofVar.aa, dfofVar.ab, dfofVar.ac, dfofVar.ad, dfofVar.ae, dfofVar.af, dfofVar.ag, dfofVar.ah, dfofVar.ai, dfofVar.aj, dfofVar.ak, dfofVar.al, dfofVar.am, dfofVar.an, dfofVar.ao, dfnyVar, dfofVar.ar, dfofVar.as, dfofVar.au, dfofVar.av, dfofVar.aw, dfofVar.ax, dfofVar.az, dfofVar.aA, dfofVar.aB, dfofVar.aC, dfofVar.aD, dfofVar.aG, dfofVar.aE, dfofVar.aF, dfofVar.aH, dfofVar.aI, dfofVar.aJ, dfofVar.aK);
    }
}
