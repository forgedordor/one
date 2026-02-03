package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckkl extends fcyz implements fdat {
    int a;
    final /* synthetic */ ckkm b;
    final /* synthetic */ ckko c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckkl(ckkm ckkmVar, ckko ckkoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ckkmVar;
        this.c = ckkoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckkl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ckkm ckkmVar = this.b;
        ckko ckkoVar = this.c;
        this.a = 1;
        Object objK = ckkmVar.k(ckkoVar, this);
        return objK == fcylVar ? fcylVar : objK;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ckkl(this.b, this.c, fcxyVar);
    }
}
