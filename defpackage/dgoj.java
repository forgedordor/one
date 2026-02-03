package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgoj extends fcyz implements fdat {
    int a;
    final /* synthetic */ dgom b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgoj(dgom dgomVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dgomVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dgoj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objA;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dgom dgomVar = this.b;
            this.a = 1;
            if (dgomVar.g.a()) {
                objA = dgomVar.g(this);
                if (objA != fcylVar) {
                    objA = fctx.a;
                }
            } else {
                objA = fdin.a(eicg.a(dgomVar.f), new dgoi(null, dgomVar), this);
                if (objA != fcylVar) {
                    objA = fctx.a;
                }
            }
            if (objA == fcylVar) {
                return fcylVar;
            }
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dgoj(this.b, fcxyVar);
    }
}
