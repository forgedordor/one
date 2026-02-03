package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ugr extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ugs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugr(ugs ugsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ugsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ugr) c((bcuw) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            bcuw bcuwVar = (bcuw) this.b;
            fcyh fcyhVarA = eicg.a(this.c.a);
            ugq ugqVar = new ugq(null, bcuwVar);
            this.a = 1;
            obj = fdin.a(fcyhVarA, ugqVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        obj.getClass();
        return obj;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ugr ugrVar = new ugr(this.c, fcxyVar);
        ugrVar.b = obj;
        return ugrVar;
    }
}
