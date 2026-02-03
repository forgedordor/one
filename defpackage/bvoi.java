package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvoi extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvoq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvoi(bvoq bvoqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvoqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvoi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            bvoq bvoqVar = this.b;
            this.a = 1;
            obj = bvoqVar.f.d(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return bvms.a(((bvlg) obj).c);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvoi(this.b, fcxyVar);
    }
}
