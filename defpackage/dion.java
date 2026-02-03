package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dion extends fcyz implements fdat {
    final /* synthetic */ diot a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dion(diot diotVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = diotVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dion) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.e.invoke();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dion(this.a, fcxyVar);
    }
}
