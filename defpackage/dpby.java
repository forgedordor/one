package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpby extends fcyz implements fdat {
    int a;
    final /* synthetic */ dpcf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpby(dpcf dpcfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dpcfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpby) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dpcf dpcfVar = this.b;
            dpbx dpbxVar = new dpbx(dpcfVar);
            this.a = 1;
            if (dpcfVar.i.a(dpbxVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpby(this.b, fcxyVar);
    }
}
