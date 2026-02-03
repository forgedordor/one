package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axzx extends fcyz implements fdat {
    int a;
    final /* synthetic */ aymo b;
    final /* synthetic */ aybe c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axzx(fcxy fcxyVar, aymo aymoVar, aybe aybeVar) {
        super(2, fcxyVar);
        this.b = aymoVar;
        this.c = aybeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axzx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aymo aymoVar = this.b;
            aybe aybeVar = this.c;
            int iB = aymoVar.b("sub_id", -1);
            String strL = aymoVar.l("transaction_id");
            String strL2 = aymoVar.l("content_location");
            long jD = aymoVar.d("message_logging_id");
            fcyh fcyhVarA = eicg.a(aybeVar.J);
            axzy axzyVar = new axzy(null, aybeVar, iB, strL, strL2, jD);
            this.a = 1;
            if (fdin.a(fcyhVarA, axzyVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        aybe.a.l("MMS receiving END");
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        axzx axzxVar = new axzx(fcxyVar, this.b, this.c);
        axzxVar.d = obj;
        return axzxVar;
    }
}
