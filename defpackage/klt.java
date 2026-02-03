package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class klt extends fcyz implements fdat {
    final /* synthetic */ knp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klt(knp knpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = knpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((klt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.show();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new klt(this.a, fcxyVar);
    }
}
