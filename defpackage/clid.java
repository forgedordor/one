package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clid {
    private final aimb a;

    public clid(aimb aimbVar) {
        aimbVar.getClass();
        this.a = aimbVar;
    }

    public final void a(eoal eoalVar) {
        ailn ailnVarA = this.a.a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.SATELLITE_EVENT, ellgVar);
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.cf = eoalVar;
        ellhVar.h |= 65536;
        ailnVarA.h((ellg) elgr.a(ellgVar).toBuilder(), aioj.LOG_SPEC_SATELLITE_EVENTS);
    }
}
