package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfpa extends dfoc {
    public static volatile dfpa a;
    private static final Object b = new Object();
    private final dfoz e;

    private dfpa() {
        super("RbmSpecificRcsOverrides__");
        this.e = new dfoz(this);
    }

    public static void a() {
        synchronized (b) {
            if (a == null) {
                a = new dfpa();
                a.l();
            }
        }
    }

    @Override // defpackage.dfoc
    protected final ekgb b() {
        return ekgb.r(this.e.a);
    }
}
