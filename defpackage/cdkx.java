package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdkx extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdla b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdkx(cdla cdlaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cdlaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdkx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cdla cdlaVar = this.b;
            this.a = 1;
            Object objA = fdin.a(eicg.a(cdlaVar.a), new cdkw(null, cdlaVar), this);
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdkx(this.b, fcxyVar);
    }
}
