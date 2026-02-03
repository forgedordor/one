package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfwb implements cfvh {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/machine/WaitingForRetryState");
    public final evrj b;
    public final evrj c;
    public final cfuz d;
    private final fdjx e;
    private final long f;
    private final cfvj g;
    private fdlr h;
    private final String i = "WaitingForRetry";

    public cfwb(fdjx fdjxVar, long j, evrj evrjVar, evrj evrjVar2, cfuz cfuzVar, cfvj cfvjVar) {
        this.e = fdjxVar;
        this.f = j;
        this.b = evrjVar;
        this.c = evrjVar2;
        this.d = cfuzVar;
        this.g = cfvjVar;
    }

    @Override // defpackage.cfvh
    public final Object a(fcxy fcxyVar) {
        final int iIncrementAndGet = this.g.b.incrementAndGet();
        if (iIncrementAndGet > this.f) {
            this.d.a(cfuy.h);
            return fctx.a;
        }
        fdlr fdlrVarK = auvw.k(this.e, null, null, new cfwa(this, iIncrementAndGet, null), 3);
        fdlrVarK.hK(new fdap() { // from class: cfvz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                if (((Throwable) obj) == null) {
                    cfwb cfwbVar = this;
                    int i = iIncrementAndGet;
                    ekrw ekrwVarH = cfwb.a.h();
                    ekrwVarH.X(eksq.a, "BugleBindChannelProxy");
                    ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/machine/WaitingForRetryState", "onEntry$lambda$1$lambda$0", 57, "WaitingForRetryState.kt")).r("Retry time expired. Attempting retry#%d", i);
                    cfwbVar.d.a(cfuy.b);
                }
                return fctx.a;
            }
        });
        this.h = fdlrVarK;
        return fctx.a;
    }

    @Override // defpackage.cfvh
    public final String b() {
        return this.i;
    }

    @Override // defpackage.cfvh
    public final Object c() {
        fdlr fdlrVar = this.h;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        this.h = null;
        return fctx.a;
    }
}
