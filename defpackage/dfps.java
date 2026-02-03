package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfps extends dfoc {
    public static final /* synthetic */ int b = 0;
    private static volatile dfps e;
    private static final Object f = new Object();
    public final dfpr a;

    private dfps() {
        super("SocketSettings__");
        this.a = new dfpr(this);
    }

    public static long a() {
        return ((Long) c().a.a.a()).longValue();
    }

    public static dfps c() {
        if (e == null) {
            d();
        }
        return e;
    }

    static void d() {
        synchronized (f) {
            if (e == null) {
                e = new dfps();
                e.l();
            }
        }
    }

    @Override // defpackage.dfoc
    protected final ekgb b() {
        dfpr dfprVar = this.a;
        return ekgb.u(dfprVar.a, dfprVar.b, dfprVar.c, dfprVar.d);
    }
}
