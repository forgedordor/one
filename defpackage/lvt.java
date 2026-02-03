package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lvt extends lvu implements lvh {
    final lvj a;
    final /* synthetic */ lvv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvt(lvv lvvVar, lvj lvjVar, lvz lvzVar) {
        super(lvvVar, lvzVar);
        this.b = lvvVar;
        this.a = lvjVar;
    }

    @Override // defpackage.lvu
    public final void b() {
        this.a.P().d(this);
    }

    @Override // defpackage.lvu
    public final boolean c(lvj lvjVar) {
        return this.a == lvjVar;
    }

    @Override // defpackage.lvu
    public final boolean eA() {
        return this.a.P().a().a(lvb.d);
    }

    @Override // defpackage.lvh
    public final void gL(lvj lvjVar, lva lvaVar) {
        lvj lvjVar2 = this.a;
        lvb lvbVarA = lvjVar2.P().a();
        if (lvbVarA == lvb.a) {
            this.b.k(this.c);
            return;
        }
        lvb lvbVar = null;
        while (lvbVar != lvbVarA) {
            d(eA());
            lvbVar = lvbVarA;
            lvbVarA = lvjVar2.P().a();
        }
    }
}
