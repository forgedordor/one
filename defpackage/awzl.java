package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awzl extends fcyz implements fdat {
    int a;
    final /* synthetic */ awzm b;
    final /* synthetic */ dggk c;
    final /* synthetic */ axcw d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awzl(awzm awzmVar, dggk dggkVar, axcw axcwVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awzmVar;
        this.c = dggkVar;
        this.d = axcwVar;
        this.e = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awzl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            awzm awzmVar = this.b;
            axcw axcwVar = this.d;
            String str = this.e;
            cmmj cmmjVarA = cmmi.a((cmmg) cmmh.a.createBuilder());
            cmmjVarA.d(axcwVar.a);
            cmmjVarA.b(axcwVar.b);
            cmmjVarA.c(str);
            cmmh cmmhVarA = cmmjVarA.a();
            dggk dggkVar = this.c;
            this.a = 1;
            if (awzmVar.b.g(cmmhVarA, dggkVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awzl(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
