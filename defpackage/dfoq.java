package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfoq extends dfoc {
    private static volatile dfoq b;
    private static final Object e = new Object();
    public final dfop a;

    private dfoq() {
        super("MsrpSettings__");
        this.a = new dfop(this);
    }

    public static int a() {
        return ((Integer) c().a.b.a()).intValue();
    }

    public static dfoq c() {
        if (b == null) {
            d();
        }
        return b;
    }

    static void d() {
        synchronized (e) {
            if (b == null) {
                b = new dfoq();
                b.l();
            }
        }
    }

    public static boolean n() {
        return ((Boolean) c().a.a.a()).booleanValue();
    }

    public static boolean o() {
        return ((Boolean) c().a.j.a()).booleanValue();
    }

    public static boolean p() {
        return ((Boolean) c().a.g.a()).booleanValue();
    }

    public static boolean q() {
        return ((Boolean) c().a.f.a()).booleanValue();
    }

    @Override // defpackage.dfoc
    protected final ekgb b() {
        dfop dfopVar = this.a;
        return ekgb.z(dfopVar.a, dfopVar.b, dfopVar.c, dfopVar.e, dfopVar.f, dfopVar.g, dfopVar.h, dfopVar.i, dfopVar.j);
    }
}
