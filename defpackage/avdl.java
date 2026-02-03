package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avdl extends fcyz implements fdat {
    private /* synthetic */ Object a;

    public avdl(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avdl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        eieu eieuVarH = eiiy.h("ContactsSyncDataService#deleteAllContacts");
        try {
            String[] strArr = bnfe.a;
            bnet bnetVar = new bnet();
            bnetVar.e();
            bnetVar.f("deleteAllContacts");
            Integer num = new Integer(bnetVar.d());
            fczl.a(eieuVarH, null);
            return num;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        avdl avdlVar = new avdl(fcxyVar);
        avdlVar.a = obj;
        return avdlVar;
    }
}
