package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class trh implements egps<Boolean, Void> {
    final /* synthetic */ trj a;

    public trh(trj trjVar) {
        this.a = trjVar;
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        this.a.p.G(true);
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
        trj trjVar = this.a;
        trjVar.p.G(true);
        trjVar.p.k(!((Boolean) obj).booleanValue());
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
