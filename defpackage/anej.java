package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anej {
    public final cczi a;
    private final cczi b;
    private final cczi c;
    private final cczi d;

    public anej() {
        dzzf dzzfVar = cdag.b;
        this.b = cdag.e(dzzfVar, "initial_page_size", 60);
        this.c = cdag.e(dzzfVar, "scrolling_page_size", 20);
        this.d = cdag.e(dzzfVar, "max_page_data_size", 5000);
        this.a = cdag.e(dzzfVar, "preload_page_size", 20);
    }

    public final /* bridge */ /* synthetic */ int a() {
        return ((Integer) this.b.e()).intValue();
    }

    public final int b() {
        Object objE = this.d.e();
        objE.getClass();
        return ((Number) objE).intValue();
    }

    public final /* bridge */ /* synthetic */ int c() {
        return ((Integer) this.c.e()).intValue();
    }
}
