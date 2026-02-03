package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfpk extends dfoc {
    public static volatile dfpk a;
    private static final Object e = new Object();
    public final dfpj b;

    private dfpk() {
        super("RcsSettings__");
        this.b = new dfpj(this);
    }

    public static dfpk a() {
        if (a == null) {
            d();
        }
        return a;
    }

    public static String c() {
        return (String) a().b.c.a();
    }

    static void d() {
        synchronized (e) {
            if (a == null) {
                a = new dfpk();
                a.l();
            }
        }
    }

    public static boolean n() {
        return ((Boolean) a().b.f.a()).booleanValue();
    }

    public static boolean o() {
        return ((Boolean) a().b.r.a()).booleanValue();
    }

    public static boolean p() {
        return ((Boolean) a().b.p.a()).booleanValue();
    }

    public static boolean q() {
        return ((Boolean) a().b.a.a()).booleanValue();
    }

    public static boolean r() {
        return ((Boolean) a().b.w.a()).booleanValue();
    }

    public static boolean s() {
        return ((Boolean) a().b.n.a()).booleanValue();
    }

    public static boolean t() {
        return ((Boolean) a().b.m.a()).booleanValue();
    }

    public static boolean u() {
        return ((Boolean) a().b.g.a()).booleanValue();
    }

    public static boolean v() {
        return ((Boolean) a().b.b.a()).booleanValue();
    }

    public static boolean w() {
        return ((Boolean) a().b.q.a()).booleanValue();
    }

    public static boolean x() {
        return ((Boolean) a().b.i.a()).booleanValue();
    }

    public static boolean y() {
        return ((Boolean) a().b.l.a()).booleanValue();
    }

    @Override // defpackage.dfoc
    protected final ekgb b() {
        dfpj dfpjVar = this.b;
        return ekgb.C(dfpjVar.a, dfpjVar.b, dfpjVar.c, dfpjVar.d, dfpjVar.e, dfpjVar.h, dfpjVar.i, dfpjVar.j, dfpjVar.k, dfpjVar.l, dfpjVar.m, dfpjVar.n, dfpjVar.o, dfpjVar.p, dfpjVar.q, dfpjVar.r, dfpjVar.s, dfpjVar.t, dfpjVar.u, dfpjVar.v, dfpjVar.w, dfpjVar.x);
    }
}
