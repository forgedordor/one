package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doeh extends fcyz implements fdat {
    int a;
    final /* synthetic */ doem b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doeh(doem doemVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = doemVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doeh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            doem doemVar = this.b;
            fdvc fdvcVarC = doemVar.e().c(dpil.aK);
            doeg doegVar = new doeg(doemVar);
            this.a = 1;
            if (fdvcVarC.a(doegVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new doeh(this.b, fcxyVar);
    }
}
