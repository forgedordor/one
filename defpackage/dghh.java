package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dghh extends fcyz implements fdat {
    int a;
    final /* synthetic */ dghi b;
    final /* synthetic */ cmmh c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dghh(fcxy fcxyVar, dghi dghiVar, cmmh cmmhVar) {
        super(2, fcxyVar);
        this.b = dghiVar;
        this.c = cmmhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dghh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dghi dghiVar = this.b;
            String str = this.c.c;
            str.getClass();
            this.a = 1;
            obj = fdin.a(eicg.a(dghiVar.f), new dghc(null, dghiVar, str), this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return Boolean.valueOf(obj == enwr.AVAILABLE);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dghh dghhVar = new dghh(fcxyVar, this.b, this.c);
        dghhVar.d = obj;
        return dghhVar;
    }
}
