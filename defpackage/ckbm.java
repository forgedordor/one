package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckbm extends fcyz implements fdat {
    int a;
    final /* synthetic */ ckbr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckbm(ckbr ckbrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ckbrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckbm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ckbr ckbrVar = this.b;
        this.a = 1;
        Object objJ = ckbrVar.a.j(this);
        return objJ == fcylVar ? fcylVar : objJ;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ckbm(this.b, fcxyVar);
    }
}
