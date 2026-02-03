package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfou extends dfoc {
    private static volatile dfou b;
    private static final Object e = new Object();
    public final dfot a;

    protected dfou() {
        super("Rbm__");
        this.a = new dfot(this);
    }

    public static dfou a() {
        if (b == null) {
            c();
        }
        return b;
    }

    static void c() {
        synchronized (e) {
            if (b == null) {
                b = new dfou();
                b.l();
            }
        }
    }

    public static boolean d() {
        return ((Boolean) a().a.a.a()).booleanValue();
    }

    @Override // defpackage.dfoc
    protected final ekgb b() {
        dfot dfotVar = this.a;
        return ekgb.s(dfotVar.a, dfotVar.b);
    }
}
