package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfkh extends fcyz implements fdat {
    int a;
    final /* synthetic */ cfki b;
    final /* synthetic */ eoys c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfkh(cfki cfkiVar, eoys eoysVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cfkiVar;
        this.c = eoysVar;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfkh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cfki cfkiVar = this.b;
        eoys eoysVar = this.c;
        String str = this.d;
        this.a = 1;
        Object objB = cfkiVar.b(eoysVar, str, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cfkh(this.b, this.c, this.d, fcxyVar);
    }
}
