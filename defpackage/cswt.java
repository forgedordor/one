package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cswt extends fcyz implements fdat {
    int a;
    final /* synthetic */ cswx b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cswt(fcxy fcxyVar, cswx cswxVar) {
        super(2, fcxyVar);
        this.b = cswxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cswt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cswx cswxVar = this.b;
            this.a = 1;
            obj = csye.a(cswxVar.b, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return Boolean.valueOf(((Number) obj).intValue() != 3);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cswt cswtVar = new cswt(fcxyVar, this.b);
        cswtVar.c = obj;
        return cswtVar;
    }
}
