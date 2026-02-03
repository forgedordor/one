package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fot extends fcyz implements fdat {
    int a;
    final /* synthetic */ fqa b;
    final /* synthetic */ fox c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fot(fqa fqaVar, fox foxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fqaVar;
        this.c = foxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fot) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fqa fqaVar = this.b;
            this.a = 1;
            fqaVar.a = 6.0f;
            fqaVar.b = 12.0f;
            fqaVar.c = 8.0f;
            fqaVar.d = 8.0f;
            Object objB = fqaVar.b(this);
            if (objB != fcylVar) {
                objB = fctx.a;
            }
            if (objB == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fot(this.b, this.c, fcxyVar);
    }
}
