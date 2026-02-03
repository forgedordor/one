package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfok extends dfoc {
    private static volatile dfok b;
    private static final Object e = new Object();
    public final dfoj a;

    private dfok() {
        super("Etouffee__");
        this.a = new dfoj(this);
    }

    public static dfok a() {
        if (b == null) {
            c();
        }
        return b;
    }

    static void c() {
        synchronized (e) {
            if (b == null) {
                b = new dfok();
                b.l();
            }
        }
    }

    @Override // defpackage.dfoc
    protected final ekgb b() {
        return ekgb.r(this.a.a);
    }
}
