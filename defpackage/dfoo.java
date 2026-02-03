package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfoo extends dfoc {
    private static volatile dfoo b;
    private static final Object e = new Object();
    public final dfon a;

    private dfoo() {
        super("JibeServiceLifecyclePercents__");
        this.a = new dfon(this);
    }

    public static dfoo a() {
        if (b == null) {
            c();
        }
        return b;
    }

    static void c() {
        synchronized (e) {
            if (b == null) {
                b = new dfoo();
                b.l();
            }
        }
    }

    @Override // defpackage.dfoc
    protected final ekgb b() {
        dfon dfonVar = this.a;
        return ekgb.w(dfonVar.a, dfonVar.b, dfonVar.c, dfonVar.d, dfonVar.e, dfonVar.f);
    }
}
