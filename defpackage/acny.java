package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acny extends fcyz implements fdat {
    int a;
    final /* synthetic */ acnz b;
    final /* synthetic */ fdat c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acny(acnz acnzVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = acnzVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((acny) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            acnz acnzVar = this.b;
            acnx acnxVar = new acnx(acnzVar, this.c);
            this.a = 1;
            if (fdum.g((fdum) acnzVar.d.a, acnxVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new acny(this.b, this.c, fcxyVar);
    }
}
