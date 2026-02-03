package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hgd extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdau c;
    final /* synthetic */ hgn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgd(fdau fdauVar, hgn hgnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdauVar;
        this.d = hgnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hgd) c((hjj) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            hjj hjjVar = (hjj) this.b;
            fdau fdauVar = this.c;
            hgn hgnVar = this.d;
            this.a = 1;
            if (fdauVar.a(hgnVar.h, hjjVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        hgd hgdVar = new hgd(this.c, this.d, fcxyVar);
        hgdVar.b = obj;
        return hgdVar;
    }
}
