package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfoy extends dfoc {
    private static volatile dfoy a;
    private static final Object b = new Object();
    private final dfox e;

    private dfoy() {
        super("RbmRichCards__");
        this.e = new dfox(this);
    }

    public static dfoy a() {
        if (a == null) {
            c();
        }
        return a;
    }

    static void c() {
        synchronized (b) {
            if (a == null) {
                a = new dfoy();
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

    @Override // defpackage.dfoc
    protected final ekgb b() {
        dfox dfoxVar = this.e;
        return ekgb.s(dfoxVar.a, dfoxVar.b);
    }
}
