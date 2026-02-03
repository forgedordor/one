package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djtk extends fcyz implements fdat {
    final /* synthetic */ djtg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djtk(djtg djtgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = djtgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djtk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.c().invoke();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new djtk(this.a, fcxyVar);
    }
}
