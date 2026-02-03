package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auta extends fcyz implements fdat {
    final /* synthetic */ auti a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auta(fcxy fcxyVar, auti autiVar) {
        super(2, fcxyVar);
        this.a = autiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((auta) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bnar bnarVarC = ((cpqk) this.a.a.b()).c(2);
        if (bnarVarC == null) {
            throw new cpny("No backup key available");
        }
        String strP = bnarVarC.p();
        if (strP == null || strP.length() == 0) {
            throw new cpzb("Missing Cms ID for Backup Key.");
        }
        return bnarVarC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        auta autaVar = new auta(fcxyVar, this.a);
        autaVar.b = obj;
        return autaVar;
    }
}
