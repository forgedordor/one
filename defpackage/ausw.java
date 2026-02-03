package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ausw extends fcyz implements fdat {
    int a;
    final /* synthetic */ auti b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ausw(auti autiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = autiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ausw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        auti autiVar = this.b;
        this.a = 1;
        Object objI = autiVar.i(this);
        return objI == fcylVar ? fcylVar : objI;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ausw(this.b, fcxyVar);
    }
}
