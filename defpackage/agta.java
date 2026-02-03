package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agta extends fcyz implements fdat {
    int a;
    final /* synthetic */ agtd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agta(agtd agtdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = agtdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agta) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            agtd agtdVar = this.b;
            this.a = 1;
            obj = agtdVar.j.g(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agta(this.b, fcxyVar);
    }
}
