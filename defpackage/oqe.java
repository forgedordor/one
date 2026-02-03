package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oqe extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ fdau c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqe(fdpl fdplVar, fdau fdauVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = fdauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oqe) c((owr) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            owr owrVar = (owr) this.d;
            fdpl fdplVar = this.b;
            oqd oqdVar = new oqd(this.c, new opb(owrVar), null);
            this.a = 1;
            if (fdpy.b(fdplVar, oqdVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        oqe oqeVar = new oqe(this.b, this.c, fcxyVar);
        oqeVar.d = obj;
        return oqeVar;
    }
}
