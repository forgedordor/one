package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgza extends fcyz implements fdat {
    int a;
    final /* synthetic */ cgzi b;
    final /* synthetic */ String c;
    final /* synthetic */ cgzx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgza(cgzi cgziVar, String str, cgzx cgzxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cgziVar;
        this.c = str;
        this.d = cgzxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgza) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cgzi cgziVar = this.b;
        cgzx cgzxVar = this.d;
        cgyc cgycVar = (cgyc) cgyd.a.createBuilder();
        cgycVar.getClass();
        String strA = cgzxVar.a();
        cgycVar.copyOnWrite();
        ((cgyd) cgycVar.instance).b = strA;
        cgyd cgydVarA = cgye.a(cgycVar);
        caxr caxrVar = new caxr();
        caxrVar.a = this.c;
        eiju eijuVarB = ((cazj) cgziVar.b.a.b()).a(cbcu.g("pipeline_work_handler", cgydVarA, caxrVar.a())).b();
        eijuVarB.getClass();
        this.a = 1;
        Object objC = fdxs.c(eijuVarB, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cgza(this.b, this.c, this.d, fcxyVar);
    }
}
