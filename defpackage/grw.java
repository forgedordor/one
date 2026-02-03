package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class grw extends fcyz implements fdat {
    int a;
    final /* synthetic */ iac b;
    final /* synthetic */ ebk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grw(ebk ebkVar, iac iacVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ebkVar;
        this.b = iacVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((grw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ebk ebkVar = this.c;
            grv grvVar = new grv(this.b);
            this.a = 1;
            if (fdum.g((fdum) ebkVar.a, grvVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new grw(this.c, this.b, fcxyVar);
    }
}
