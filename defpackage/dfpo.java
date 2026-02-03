package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfpo extends dfoc {
    private static volatile dfpo b;
    private static final Object e = new Object();
    public final dfpn a;

    private dfpo() {
        super("SipSettings__");
        this.a = new dfpn(this);
    }

    public static long a() {
        return ((Long) p().a.J.a()).longValue();
    }

    public static long c() {
        return ((Long) p().a.I.a()).longValue();
    }

    public static long d() {
        return ((Long) p().a.G.a()).longValue();
    }

    public static long n() {
        return ((Long) p().a.F.a()).longValue();
    }

    public static long o() {
        return ((Long) p().a.t.a()).longValue();
    }

    public static dfpo p() {
        if (b == null) {
            s();
        }
        return b;
    }

    public static String q() {
        return (String) p().a.M.a();
    }

    public static String r() {
        return (String) p().a.w.a();
    }

    static void s() {
        synchronized (e) {
            if (b == null) {
                b = new dfpo();
                b.l();
            }
        }
    }

    public static boolean t() {
        return ((Boolean) p().a.O.a()).booleanValue();
    }

    public static boolean u() {
        return ((Boolean) p().a.j.a()).booleanValue();
    }

    public static boolean v() {
        return ((Boolean) p().a.n.a()).booleanValue();
    }

    public static boolean w() {
        return ((Boolean) p().a.L.a()).booleanValue();
    }

    public static boolean x() {
        return ((Boolean) p().a.l.a()).booleanValue();
    }

    @Override // defpackage.dfoc
    protected final ekgb b() {
        dfpn dfpnVar = this.a;
        return ekgb.C(dfpnVar.a, dfpnVar.b, dfpnVar.c, dfpnVar.d, dfpnVar.e, dfpnVar.f, dfpnVar.g, dfpnVar.h, dfpnVar.i, dfpnVar.j, dfpnVar.k, dfpnVar.l, dfpnVar.m, dfpnVar.n, dfpnVar.o, dfpnVar.p, dfpnVar.q, dfpnVar.r, dfpnVar.s, dfpnVar.t, dfpnVar.u, dfpnVar.v, dfpnVar.w, dfpnVar.x, dfpnVar.y, dfpnVar.z, dfpnVar.A, dfpnVar.B, dfpnVar.C, dfpnVar.D, dfpnVar.E, dfpnVar.F, dfpnVar.G, dfpnVar.H, dfpnVar.I, dfpnVar.J, dfpnVar.K, dfpnVar.L, dfpnVar.M, dfpnVar.N, dfpnVar.O);
    }
}
