package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxin extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxit b;
    final /* synthetic */ evih c;
    final /* synthetic */ dxhe d;
    final /* synthetic */ dxid e;
    final /* synthetic */ dxfy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxin(dxit dxitVar, evih evihVar, dxhe dxheVar, dxid dxidVar, dxfy dxfyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxitVar;
        this.c = evihVar;
        this.d = dxheVar;
        this.e = dxidVar;
        this.f = dxfyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxin) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dxit dxitVar = this.b;
            evih evihVar = this.c;
            dxhe dxheVar = this.d;
            dxid dxidVar = this.e;
            this.a = 1;
            if (dxitVar.j(evihVar, dxheVar, dxidVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxin(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
