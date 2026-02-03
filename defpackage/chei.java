package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chei extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ chfi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chei(chfi chfiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = chfiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chei) c((chfy) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            chfy chfyVar = (chfy) this.b;
            chfi chfiVar = this.c;
            this.a = 1;
            chfyVar.a.d(chfyVar.b, chfyVar.c, chfiVar, 0, chfyVar);
            if (fctx.a == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chei cheiVar = new chei(this.c, fcxyVar);
        cheiVar.b = obj;
        return cheiVar;
    }
}
