package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abdt extends fcyz implements fdat {
    int a;
    final /* synthetic */ abdu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abdt(abdu abduVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = abduVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abdt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        abdu abduVar = this.b;
        this.a = 1;
        Object objA = fdin.a(eicg.a(abduVar.c), new abds(null, abduVar), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new abdt(this.b, fcxyVar);
    }
}
