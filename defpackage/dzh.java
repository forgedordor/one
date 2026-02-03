package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dzh extends fcyz implements fdat {
    int a;
    final /* synthetic */ isn b;
    final /* synthetic */ fdau c;
    final /* synthetic */ fdap d;
    final /* synthetic */ fdap e;
    final /* synthetic */ fdap f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzh(isn isnVar, fdau fdauVar, fdap fdapVar, fdap fdapVar2, fdap fdapVar3, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = isnVar;
        this.c = fdauVar;
        this.d = fdapVar;
        this.e = fdapVar2;
        this.f = fdapVar3;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dzh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.g;
            isn isnVar = this.b;
            dzg dzgVar = new dzg(fdjxVar, this.c, this.d, this.e, this.f, new dwr(isnVar), null);
            this.a = 1;
            if (dvn.b(isnVar, dzgVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dzh dzhVar = new dzh(this.b, this.c, this.d, this.e, this.f, fcxyVar);
        dzhVar.g = obj;
        return dzhVar;
    }
}
