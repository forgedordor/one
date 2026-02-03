package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfnr extends dfoc {
    private static volatile dfnr e;
    public final dfnq b;
    private static final Object f = new Object();
    public static final dfny a = dfod.a(149510230);

    private dfnr() {
        super("BusinessInfoRetrieval__");
        this.b = new dfnq(this);
    }

    public static dfnr a() {
        if (e == null) {
            c();
        }
        return e;
    }

    static void c() {
        synchronized (f) {
            if (e == null) {
                e = new dfnr();
                e.l();
            }
        }
    }

    public static boolean d() {
        return ((Boolean) a().b.a.a()).booleanValue();
    }

    @Override // defpackage.dfoc
    protected final ekgb b() {
        dfnq dfnqVar = this.b;
        return ekgb.C(dfnqVar.a, dfnqVar.b, dfnqVar.c, dfnqVar.d, dfnqVar.e, dfnqVar.f, dfnqVar.g, dfnqVar.h, dfnqVar.i, dfnqVar.j, dfnqVar.k, dfnqVar.l, new dfny[0]);
    }
}
