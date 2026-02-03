package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfpe extends dfoc {
    private static volatile dfpe b;
    private static final Object e = new Object();
    public final dfpd a;

    protected dfpe() {
        super("RcsFileTransfer__");
        this.a = new dfpd(this);
    }

    public static int a() {
        return ((Integer) c().a.a.a()).intValue();
    }

    public static dfpe c() {
        if (b == null) {
            d();
        }
        return b;
    }

    static void d() {
        synchronized (e) {
            if (b == null) {
                b = new dfpe();
                b.l();
            }
        }
    }

    public static boolean n() {
        return ((Boolean) c().a.c.a()).booleanValue();
    }

    public static boolean o() {
        return ((Boolean) c().a.d.a()).booleanValue();
    }

    @Override // defpackage.dfoc
    protected final ekgb b() {
        dfpd dfpdVar = this.a;
        return ekgb.u(dfpdVar.a, dfpdVar.b, dfpdVar.c, dfpdVar.d);
    }
}
