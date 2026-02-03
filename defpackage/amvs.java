package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amvs extends fcyz implements fdat {
    int a;
    final /* synthetic */ amvu b;
    final /* synthetic */ athh c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amvs(fcxy fcxyVar, amvu amvuVar, athh athhVar) {
        super(2, fcxyVar);
        this.b = amvuVar;
        this.c = athhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amvs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            amvu amvuVar = this.b;
            athh athhVar = this.c;
            this.a = 1;
            if (amvuVar.c.a(athhVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        amvs amvsVar = new amvs(fcxyVar, this.b, this.c);
        amvsVar.d = obj;
        return amvsVar;
    }
}
