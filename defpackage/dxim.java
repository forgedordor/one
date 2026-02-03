package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxim extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxit b;
    final /* synthetic */ dxhe c;
    final /* synthetic */ dxid d;
    final /* synthetic */ evih e;
    final /* synthetic */ dxih f;
    final /* synthetic */ dxfy g;
    final /* synthetic */ long h;
    final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxim(dxit dxitVar, dxhe dxheVar, dxid dxidVar, evih evihVar, dxih dxihVar, dxfy dxfyVar, long j, long j2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxitVar;
        this.c = dxheVar;
        this.d = dxidVar;
        this.e = evihVar;
        this.f = dxihVar;
        this.g = dxfyVar;
        this.h = j;
        this.i = j2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxim) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dxfg dxfgVar = (dxfg) ((ejwi) ((eyig) this.b.b).a).c();
            int i2 = this.f.b;
            this.a = 1;
            if (dxfgVar.b() == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxim(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, fcxyVar);
    }
}
