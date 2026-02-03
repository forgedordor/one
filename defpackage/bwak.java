package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwak extends fcyz implements fdat {
    int a;
    final /* synthetic */ bwal b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwak(bwal bwalVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bwalVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwak) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            bwal bwalVar = this.b;
            this.a = 1;
            bvwz bvwzVar = bwalVar.a;
            Object objC = bvwzVar.c("syncKeys", new bvwx(bvwzVar, null), this);
            if (objC != fcylVar) {
                objC = fctx.a;
            }
            if (objC == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bwak(this.b, fcxyVar);
    }
}
