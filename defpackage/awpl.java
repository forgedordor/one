package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awpl extends fcyz implements fdat {
    int a;
    final /* synthetic */ awpo b;
    final /* synthetic */ boolean c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awpl(awpo awpoVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awpoVar;
        this.c = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awpl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        fdjx fdjxVar = (fdjx) this.d;
        awpo awpoVar = this.b;
        fdkf fdkfVarA = ejaa.a(fdjxVar, awpoVar.i, new awpk(awpoVar, this.c, null));
        this.a = 1;
        Object objC = fdkfVarA.c(this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        awpl awplVar = new awpl(this.b, this.c, fcxyVar);
        awplVar.d = obj;
        return awplVar;
    }
}
