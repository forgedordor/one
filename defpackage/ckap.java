package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckap extends fcyz implements fdat {
    int a;
    final /* synthetic */ ckbk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckap(ckbk ckbkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ckbkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckap) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ckbk ckbkVar = this.b;
        this.a = 1;
        Object objA = fdin.a(eicg.a(ckbkVar.d), new ckat(null, ckbkVar), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ckap(this.b, fcxyVar);
    }
}
