package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ora extends fcyz implements fdat {
    final /* synthetic */ owc a;
    final /* synthetic */ orc b;
    final /* synthetic */ orr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ora(owc owcVar, orc orcVar, orr orrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = owcVar;
        this.b = orcVar;
        this.c = orrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ora) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        owc owcVar = this.a;
        if (owcVar instanceof owb) {
            this.b.b(this.c, (owb) owcVar);
        } else if (owcVar instanceof ovy) {
            orc orcVar = this.b;
            orr orrVar = this.c;
            Throwable th = ((ovy) owcVar).a;
            if (!orcVar.e()) {
                orcVar.d.b(orrVar, new orm(th));
            }
        } else {
            if (!(owcVar instanceof ovz)) {
                throw new fctg();
            }
            orc orcVar2 = this.b;
            orcVar2.a.e();
            orcVar2.a();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ora(this.a, this.b, this.c, fcxyVar);
    }
}
