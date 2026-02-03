package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnxq implements cnxc {
    private static final cqce b = cqce.g("Bugle", "PwqForwardSyncEngineStarter");
    public final fcsu a;
    private final fcyh c;

    public cnxq(fcsu fcsuVar, fcyh fcyhVar) {
        fcsuVar.getClass();
        fcyhVar.getClass();
        this.a = fcsuVar;
        this.c = fcyhVar;
    }

    @Override // defpackage.cnxc
    public final Object a(cnyz cnyzVar, enqq enqqVar, fcxy fcxyVar) {
        evqs evqsVar;
        if (cnyzVar == null && enqqVar == null) {
            b.p("PwqForwardSyncEngine started without an explicit request.");
        } else {
            cqce cqceVar = b;
            int iA = cnyzVar != null ? cobq.a(cnyzVar) : 0;
            cqceVar.p("Starting PwqForwardSyncEngine for request: \nSyncType: [" + ((Object) cobp.a(iA)) + "]\nSyncReason: [" + (enqqVar != null ? enqqVar.name() : null) + "]\nSyncId: [" + ((cnyzVar == null || (evqsVar = cnyzVar.e) == null) ? null : cobs.c(evqsVar)) + "]");
        }
        Object objA = fdin.a(eicg.a(this.c), new cnxp(null, this), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
