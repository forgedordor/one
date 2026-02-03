package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfoj implements cfmz {
    private static final eksp b = eksp.c("BugleGDitto");
    public final fcsu a;
    private final fdjx c;
    private final fdjx d;
    private final fcsu e;

    public cfoj(fdjx fdjxVar, fdjx fdjxVar2, fcsu fcsuVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        fdjxVar2.getClass();
        fcsuVar2.getClass();
        this.c = fdjxVar;
        this.d = fdjxVar2;
        this.e = fcsuVar;
        this.a = fcsuVar2;
    }

    @Override // defpackage.cfmz
    public final /* synthetic */ eiju a(cfmy cfmyVar) {
        return cfmx.a(this, cfmyVar);
    }

    @Override // defpackage.cfmz
    public final /* bridge */ /* synthetic */ eiju b(cfmy cfmyVar, evuh evuhVar) {
        epfp epfpVar = (epfp) evuhVar;
        epfpVar.getClass();
        if (!((cdio) this.e.b()).a()) {
            eksl ekslVar = (eksl) b.j();
            ekslVar.X(cqnc.S, "UnpairGaiaPairingDelegate");
            ekslVar.q("Gaia Pairing is disabled. Skipping handleRequestInternal in delegate.");
            return auvw.c(this.c, fcyi.a, fdjz.a, new cfog(null));
        }
        if (epfpVar.b.equals(((cfjg) cfmyVar).c.b)) {
            return auvw.c(this.d, fcyi.a, fdjz.a, new cfoi(this, cfmyVar, null));
        }
        eksl ekslVar2 = (eksl) b.h();
        ekslVar2.X(cqnc.S, "UnpairGaiaPairingDelegate");
        ekslVar2.q("Pairing attempt id doesn't match desktopId. Won't unpair.");
        return auvw.c(this.c, fcyi.a, fdjz.a, new cfoh(null));
    }

    @Override // defpackage.cfmz
    public final /* bridge */ /* synthetic */ evuh c(evqs evqsVar) {
        if (((cdio) this.e.b()).a()) {
            epfp epfpVar = (epfp) evsn.parseFrom(epfp.a, evqsVar, evrr.a());
            epfpVar.getClass();
            return epfpVar;
        }
        eksl ekslVar = (eksl) b.j();
        ekslVar.X(cqnc.S, "UnpairGaiaPairingDelegate");
        ekslVar.q("Gaia Pairing is disabled. Skipping parseRequest in delegate.");
        epfo epfoVar = (epfo) epfp.a.createBuilder();
        epfoVar.getClass();
        evsn evsnVarBuild = epfoVar.build();
        evsnVarBuild.getClass();
        return (epfp) evsnVarBuild;
    }
}
