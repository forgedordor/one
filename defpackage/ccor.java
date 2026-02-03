package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccor extends fcyz implements fdat {
    int a;
    final /* synthetic */ ccos b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccor(ccos ccosVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ccosVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccor) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ccos ccosVar = this.b;
        this.a = 1;
        Object objB = ccosVar.a.b(this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ccor(this.b, fcxyVar);
    }
}
