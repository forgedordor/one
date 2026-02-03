package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfow extends dfoc {
    private static volatile dfow b;
    private static final Object e = new Object();
    public final dfov a;

    private dfow() {
        super("RbmInteropVodafonePlatform__");
        this.a = new dfov(this);
    }

    public static dfow a() {
        if (b == null) {
            c();
        }
        return b;
    }

    static void c() {
        synchronized (e) {
            if (b == null) {
                b = new dfow();
                b.l();
            }
        }
    }

    @Override // defpackage.dfoc
    protected final ekgb b() {
        dfov dfovVar = this.a;
        return ekgb.s(dfovVar.a, dfovVar.b);
    }
}
