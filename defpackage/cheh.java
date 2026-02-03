package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cheh extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ chfi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cheh(chfi chfiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = chfiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cheh) c((chfy) obj, (fcxy) obj2)).b(fctx.a);
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
            if (chfyVar.a(chfiVar, 3) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cheh chehVar = new cheh(this.c, fcxyVar);
        chehVar.b = obj;
        return chehVar;
    }
}
