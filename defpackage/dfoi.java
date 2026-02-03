package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfoi extends dfoc {
    private static volatile dfoi b;
    private static final Object e = new Object();
    public final dfoh a;

    private dfoi() {
        super("DiagnosticSettings__");
        this.a = new dfoh(this);
    }

    public static dfoi a() {
        if (b == null) {
            c();
        }
        return b;
    }

    static void c() {
        synchronized (e) {
            if (b == null) {
                b = new dfoi();
                b.l();
            }
        }
    }

    public static boolean d() {
        return ((Boolean) a().a.d.a()).booleanValue();
    }

    @Override // defpackage.dfoc
    protected final ekgb b() {
        dfoh dfohVar = this.a;
        return ekgb.v(dfohVar.a, dfohVar.b, dfohVar.c, dfohVar.d, dfohVar.e);
    }
}
