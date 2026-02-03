package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckbj extends fcyz implements fdat {
    int a;
    final /* synthetic */ ckbk b;
    final /* synthetic */ ckbz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckbj(ckbk ckbkVar, ckbz ckbzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ckbkVar;
        this.c = ckbzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckbj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return null;
        }
        ckbk ckbkVar = this.b;
        ckbz ckbzVar = this.c;
        this.a = 1;
        if (ckbkVar.A(ckbzVar, this) == fcylVar) {
            return fcylVar;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ckbj(this.b, this.c, fcxyVar);
    }
}
