package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxip extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxit b;
    final /* synthetic */ dxid c;
    final /* synthetic */ dxfy d;
    final /* synthetic */ long e;
    final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxip(dxit dxitVar, dxid dxidVar, dxfy dxfyVar, long j, long j2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxitVar;
        this.c = dxidVar;
        this.d = dxfyVar;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxip) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dxit dxitVar = this.b;
            dxid dxidVar = this.c;
            dxfy dxfyVar = this.d;
            long j = this.e;
            long j2 = this.f;
            this.a = 1;
            if (dxitVar.g(dxidVar, dxfyVar, j, j2, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxip(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
