package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfpc extends dfoc {
    private static volatile dfpc b;
    private static final Object e = new Object();
    public final dfpb a;

    private dfpc() {
        super("RcsCpmFlags__");
        this.a = new dfpb(this);
    }

    public static dfpc a() {
        if (b == null) {
            c();
        }
        return b;
    }

    public static void c() {
        synchronized (e) {
            if (b == null) {
                b = new dfpc();
                b.l();
            }
        }
    }

    public static boolean d() {
        return ((Boolean) a().a.a.a()).booleanValue();
    }

    public static boolean n() {
        return ((Boolean) a().a.d.a()).booleanValue();
    }

    @Override // defpackage.dfoc
    protected final ekgb b() {
        dfpb dfpbVar = this.a;
        return ekgb.v(dfpbVar.a, dfpbVar.b, dfpbVar.c, dfpbVar.d, dfpbVar.e);
    }
}
