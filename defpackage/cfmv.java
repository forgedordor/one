package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfmv implements cfmz {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/handler/ditto/PrewarmDelegate");
    private final fdjx b;

    public cfmv(fdjx fdjxVar) {
        fdjxVar.getClass();
        this.b = fdjxVar;
    }

    @Override // defpackage.cfmz
    public final /* synthetic */ eiju a(cfmy cfmyVar) {
        return cfmx.a(this, cfmyVar);
    }

    @Override // defpackage.cfmz
    public final /* bridge */ /* synthetic */ eiju b(cfmy cfmyVar, evuh evuhVar) {
        ((epcs) evuhVar).getClass();
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleDitto");
        ekrd ekrdVar = (ekrd) ekrwVarE;
        ekrdVar.X(cqnc.S, getClass().getSimpleName());
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/net/handler/ditto/PrewarmDelegate", "handleRequestInternal", 37, "PrewarmDelegate.kt")).q("Pre-warming bugle.");
        return auvw.c(this.b, fcyi.a, fdjz.a, new cfmu(null));
    }

    @Override // defpackage.cfmz
    public final /* bridge */ /* synthetic */ evuh c(evqs evqsVar) {
        epcs epcsVar = (epcs) evsn.parseFrom(epcs.a, evqsVar, evrr.a());
        epcsVar.getClass();
        return epcsVar;
    }
}
