package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaep extends fcyz implements fdat {
    int a;
    final /* synthetic */ aaeq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaep(aaeq aaeqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aaeqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaep) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aaeq aaeqVar = this.b;
            this.a = 1;
            if (aaeqVar.d.a(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aaep(this.b, fcxyVar);
    }
}
