package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfom extends dfoc {
    private static volatile dfom b;
    private static final Object e = new Object();
    public final dfol a;

    private dfom() {
        super("InstanceIdInProvisioning__");
        this.a = new dfol(this);
    }

    public static dfom a() {
        if (b == null) {
            c();
        }
        return b;
    }

    static void c() {
        synchronized (e) {
            if (b == null) {
                b = new dfom();
                b.l();
            }
        }
    }

    @Override // defpackage.dfoc
    protected final ekgb b() {
        return ekgb.r(this.a.a);
    }
}
