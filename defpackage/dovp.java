package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dovp extends fcyz implements fdat {
    int a;
    final /* synthetic */ dowx b;
    final /* synthetic */ dovr c;
    final /* synthetic */ dpyb d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dovp(dowx dowxVar, dovr dovrVar, dpyb dpybVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dowxVar;
        this.c = dovrVar;
        this.d = dpybVar;
        this.e = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dovp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dowx dowxVar = this.b;
        dovr dovrVar = this.c;
        dpyb dpybVar = this.d;
        String str = this.e;
        this.a = 1;
        Object objF = dowxVar.f(dovrVar, dpybVar, str, 20, this);
        return objF == fcylVar ? fcylVar : objF;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dovp(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
