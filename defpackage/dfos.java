package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfos extends dfoc {
    private static volatile dfos a;
    private static final Object b = new Object();
    private final dfor e;

    private dfos() {
        super("MultiSimSettings__");
        this.e = new dfor(this);
    }

    public static dfos a() {
        if (a == null) {
            c();
        }
        return a;
    }

    static void c() {
        synchronized (b) {
            if (a == null) {
                a = new dfos();
                a.l();
            }
        }
    }

    @Override // defpackage.dfoc
    protected final ekgb b() {
        return ekgb.r(this.e.a);
    }
}
