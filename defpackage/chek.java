package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chek extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ chfi c;
    final /* synthetic */ chfq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chek(chfi chfiVar, chfq chfqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = chfiVar;
        this.d = chfqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chek) c((chfy) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            chfy chfyVar = (chfy) this.b;
            chfi chfiVar = this.c;
            chfq chfqVar = this.d;
            this.a = 1;
            if (chfyVar.a(chfiVar, chfqVar.a) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chek chekVar = new chek(this.c, this.d, fcxyVar);
        chekVar.b = obj;
        return chekVar;
    }
}
