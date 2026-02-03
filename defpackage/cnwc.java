package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnwc extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnwh b;
    final /* synthetic */ enqq c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnwc(fcxy fcxyVar, cnwh cnwhVar, enqq enqqVar) {
        super(2, fcxyVar);
        this.b = cnwhVar;
        this.c = enqqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnwc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cnwh cnwhVar = this.b;
            enqq enqqVar = this.c;
            this.a = 1;
            if (cnwhVar.x(enqqVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cnwc cnwcVar = new cnwc(fcxyVar, this.b, this.c);
        cnwcVar.d = obj;
        return cnwcVar;
    }
}
