package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caay extends cayv {
    public static final cqce a = cqce.g("BugleCms", "CmsBackFillBnrStateForFiMdWorkHandler");
    static final cczi b = cdag.e(cdag.b, "cms_back_fill_bnr_state_for_fi_md_max_attempts", 10);
    public final aurx c;
    public final ains d;
    private final eosc e;
    private final byeq f;

    public caay(aurx aurxVar, eosc eoscVar, ains ainsVar, byeq byeqVar) {
        this.c = aurxVar;
        this.e = eoscVar;
        this.d = ainsVar;
        this.f = byeqVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(((Integer) b.e()).intValue());
        caxzVarL.b(caze.WAKELOCK);
        caxzVarL.f(pza.b);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("CmsBackFillBnrStateForFiMdWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return caxy.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final int i = ((caxm) cayyVar.a()).c;
        eiju eijuVarB = this.f.b("CmsBackFillBnrStateForFiMdWorkHandler#processPendingWorkItemAsync", new Runnable() { // from class: caav
            /* JADX WARN: Type inference failed for: r3v1, types: [cmfo, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                caay caayVar = this.a;
                try {
                    aurx aurxVar = caayVar.c;
                    boolean zAi = aurxVar.ai();
                    ecem.b();
                    boolean z = ((aumq) aurxVar.e.get().l()).q;
                    if (zAi && !z) {
                        caay.a.m("Performing back fill for the user");
                        aurxVar.X(true);
                        aurxVar.Q(auml.ENABLED);
                        caayVar.d.c("Bugle.Cms.Backfill.Success.Counts");
                        return;
                    }
                    caay.a.m("Skip back fill for the user");
                } catch (evtj e) {
                    throw new IllegalStateException(e);
                }
            }
        });
        ejvr ejvrVar = new ejvr() { // from class: caaw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = caay.a;
                return cbcw.i();
            }
        };
        eosc eoscVar = this.e;
        return eijuVarB.h(ejvrVar, eoscVar).e(Throwable.class, new ejvr() { // from class: caax
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                if (i < ((Integer) caay.b.e()).intValue()) {
                    return cbcw.m();
                }
                caay caayVar = this.a;
                caay.a.s("Exceeds max retry count, will not retry anymore", th);
                caayVar.d.c("Bugle.Cms.Backfill.Failure.Counts");
                return cbcw.k();
            }
        }, eoscVar);
    }
}
