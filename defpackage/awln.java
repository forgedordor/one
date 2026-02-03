package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awln extends fcyz implements fdat {
    int a;
    final /* synthetic */ awmk b;
    final /* synthetic */ awmm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awln(awmk awmkVar, awmm awmmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awmkVar;
        this.c = awmmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awln) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        awmk awmkVar = this.b;
        fdkf fdkfVarA = ejaa.a(fdjxVar, awmkVar.h, new awlm(awmkVar, this.c, null));
        this.a = 1;
        Object objC = fdkfVarA.c(this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        awln awlnVar = new awln(this.b, this.c, fcxyVar);
        awlnVar.d = obj;
        return awlnVar;
    }
}
