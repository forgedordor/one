package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfpg extends dfoc {
    private static volatile dfpg b;
    private static final Object e = new Object();
    public final dfpf a;

    private dfpg() {
        super("RcsGroupManagementFlags__");
        this.a = new dfpf(this);
    }

    public static dfpg a() {
        if (b == null) {
            c();
        }
        return b;
    }

    public static void c() {
        synchronized (e) {
            if (b == null) {
                b = new dfpg();
                b.l();
            }
        }
    }

    public static boolean d() {
        return ((Boolean) a().a.a.a()).booleanValue();
    }

    public static boolean n() {
        return ((Boolean) a().a.c.a()).booleanValue();
    }

    @Override // defpackage.dfoc
    protected final ekgb b() {
        dfpf dfpfVar = this.a;
        return ekgb.t(dfpfVar.a, dfpfVar.b, dfpfVar.c);
    }
}
