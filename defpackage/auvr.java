package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auvr extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdat b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auvr(fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((auvr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.c;
            fdat fdatVar = this.b;
            this.a = 1;
            if (fdatVar.a(fdjxVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        auvr auvrVar = new auvr(this.b, fcxyVar);
        auvrVar.c = obj;
        return auvrVar;
    }
}
