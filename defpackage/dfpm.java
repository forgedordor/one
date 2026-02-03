package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfpm extends dfoc {
    private static volatile dfpm b;
    private static final Object e = new Object();
    public final dfpl a;

    protected dfpm() {
        super("SimStateTrackerSettings__");
        this.a = new dfpl(this);
    }

    public static dfpm a() {
        if (b == null) {
            c();
        }
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("SimStateTrackerSettings flags are not initialized!");
    }

    static void c() {
        synchronized (e) {
            if (b == null) {
                b = new dfpm();
                b.l();
            }
        }
    }

    public static boolean d() {
        return ((Boolean) a().a.d.a()).booleanValue();
    }

    @Override // defpackage.dfoc
    protected final ekgb b() {
        dfpl dfplVar = this.a;
        return ekgb.v(dfplVar.a, dfplVar.b, dfplVar.c, dfplVar.d, dfplVar.e);
    }
}
