package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmon extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmoo b;
    final /* synthetic */ lvj c;
    final /* synthetic */ dmrk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmon(dmoo dmooVar, lvj lvjVar, dmrk dmrkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmooVar;
        this.c = lvjVar;
        this.d = dmrkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmon) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmoo dmooVar = this.b;
            if (!dmooVar.g) {
                lvj lvjVar = this.c;
                azg azgVar = azg.a;
                azgVar.getClass();
                dmooVar.d(lvjVar, azgVar);
                dmooVar.g = true;
            }
            dmlz dmlzVar = dmooVar.c;
            dmrk dmrkVar = this.d;
            this.a = 1;
            if (dmlzVar.g(dmrkVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmon(this.b, this.c, this.d, fcxyVar);
    }
}
