package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uhb extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ uhc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhb(uhc uhcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = uhcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((uhb) c((ekgb) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ekgb ekgbVar = (ekgb) this.b;
            uhc uhcVar = this.c;
            fcyh fcyhVarA = eicg.a(uhcVar.a);
            uha uhaVar = new uha(null, uhcVar, ekgbVar);
            this.a = 1;
            obj = fdin.a(fcyhVarA, uhaVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        obj.getClass();
        return obj;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        uhb uhbVar = new uhb(this.c, fcxyVar);
        uhbVar.b = obj;
        return uhbVar;
    }
}
