package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aneg extends fcyz implements fdat {
    final /* synthetic */ aneh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aneg(aneh anehVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = anehVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aneg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.c();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aneg(this.a, fcxyVar);
    }
}
