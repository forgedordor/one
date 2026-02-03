package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfpq extends dfoc {
    private static volatile dfpq a;
    private static final Object b = new Object();
    private final dfpp e;

    private dfpq() {
        super("SmsSharing__");
        this.e = new dfpp(this);
    }

    public static dfpq a() {
        if (a == null) {
            c();
        }
        return a;
    }

    static void c() {
        synchronized (b) {
            if (a == null) {
                a = new dfpq();
                a.l();
            }
        }
    }

    public static boolean d() {
        return ((Boolean) a().e.a.a()).booleanValue();
    }

    public static boolean n() {
        return ((Boolean) a().e.b.a()).booleanValue();
    }

    public static boolean o() {
        return ((Boolean) a().e.c.a()).booleanValue();
    }

    public static boolean p() {
        return ((Boolean) a().e.d.a()).booleanValue();
    }

    @Override // defpackage.dfoc
    protected final ekgb b() {
        dfpp dfppVar = this.e;
        return ekgb.u(dfppVar.a, dfppVar.b, dfppVar.c, dfppVar.d);
    }
}
