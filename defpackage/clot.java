package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clot extends fcyz implements fdat {
    final /* synthetic */ clow a;
    final /* synthetic */ cloc b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clot(fcxy fcxyVar, clow clowVar, cloc clocVar) {
        super(2, fcxyVar);
        this.a = clowVar;
        this.b = clocVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clot) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        eieu eieuVarH = eiiy.h("EmergencyConversationTombstoneEnforcer#ensureTombstoneAlignedWithSatelliteSession");
        try {
            clow clowVar = this.a;
            ((dqsn) clowVar.i.b()).d("EmergencyConversationTombstoneEnforcer#ensureTombstoneAlignedWithSatelliteSession", new clov(clowVar, this.b));
            fczl.a(eieuVarH, null);
            return fctx.a;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        clot clotVar = new clot(fcxyVar, this.a, this.b);
        clotVar.c = obj;
        return clotVar;
    }
}
