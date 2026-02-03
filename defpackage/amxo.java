package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class amxo implements amxz {
    public static amxn d() {
        amxj amxjVar = new amxj();
        amxjVar.b(0L);
        amxjVar.d(0L);
        amxjVar.c(false);
        return amxjVar;
    }

    @Override // defpackage.amxz
    public abstract long a();

    @Override // defpackage.amxz
    public abstract long b();

    @Override // defpackage.amxz
    public abstract boolean c();

    @Override // defpackage.amxz
    public final boolean e() {
        return a() > 0;
    }
}
