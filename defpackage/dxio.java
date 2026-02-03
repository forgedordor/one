package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxio extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxit b;
    final /* synthetic */ dxhe c;
    final /* synthetic */ evih d;
    final /* synthetic */ dxfy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxio(dxit dxitVar, dxhe dxheVar, evih evihVar, dxfy dxfyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxitVar;
        this.c = dxheVar;
        this.d = evihVar;
        this.e = dxfyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxio) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dxfg dxfgVar = (dxfg) ((ejwi) ((eyig) this.b.b).a).c();
        evju evjuVar = this.d.g;
        if (evjuVar == null) {
            evjuVar = evju.a;
        }
        evjuVar.getClass();
        this.a = 1;
        Object objC = dxfgVar.c();
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxio(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
