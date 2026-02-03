package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzbk extends fcyz implements fdat {
    final /* synthetic */ bzbx a;
    final /* synthetic */ cpyt b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzbk(fcxy fcxyVar, bzbx bzbxVar, cpyt cpytVar) {
        super(2, fcxyVar);
        this.a = bzbxVar;
        this.b = cpytVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzbk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bnar bnarVarC = ((cpqk) this.a.a.b()).c(1);
        if (bnarVarC == null) {
            cpny cpnyVar = new cpny("No encryption key available");
            cpyu.a(cpnyVar, this.b);
            throw cpnyVar;
        }
        String strP = bnarVarC.p();
        if (strP == null || strP.length() == 0) {
            throw new cpyx("Missing cms_encryption key dependency", ekgb.r(new cpyp(String.valueOf(bnarVarC.k()), 5)));
        }
        return bnarVarC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzbk bzbkVar = new bzbk(fcxyVar, this.a, this.b);
        bzbkVar.c = obj;
        return bzbkVar;
    }
}
