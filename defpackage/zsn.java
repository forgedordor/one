package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zsn extends fcyz implements fdat {
    int a;
    final /* synthetic */ ztv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsn(ztv ztvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ztvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zsn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            xgc xgcVarD = this.b.d();
            if (xgcVarD != null) {
                this.a = 1;
                obj = xgcVarD.a(3, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zsn(this.b, fcxyVar);
    }
}
