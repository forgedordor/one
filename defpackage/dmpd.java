package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmpd extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmpe b;
    final /* synthetic */ dmnr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmpd(dmpe dmpeVar, dmnr dmnrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmpeVar;
        this.c = dmnrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmpd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmpe dmpeVar = this.b;
            dmnr dmnrVar = this.c;
            this.a = 1;
            if (dmpeVar.d.fO(dmnrVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmpd(this.b, this.c, fcxyVar);
    }
}
