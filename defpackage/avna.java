package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avna extends cayv {
    public static final /* synthetic */ int a = 0;
    private static final eksp b = eksp.c("BugleBCM");
    private final fcsu c;

    public avna(fcsu fcsuVar) {
        this.c = fcsuVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.b(caze.WAKELOCK);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("ConversationThreadIdUpdaterWorker");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return ewsx.a.getParserForType();
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        eiju eijuVarB;
        ewsx ewsxVar = (ewsx) evuhVar;
        eksp ekspVar = b;
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdUpdaterWorker", "processPendingWorkItemAsync", 64, "ConversationThreadIdUpdaterWorker.java")).C("ConversationThreadIdUpdaterWorker: Processing conversation=%s, newThreadId=%s", ewsxVar.b, ewsxVar.c);
        final bojh bojhVarB = botm.b(barn.b(ewsxVar.b));
        if (bojhVarB == null) {
            ((eksl) ((eksl) ekspVar.j()).h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdUpdaterWorker", "processPendingWorkItemAsync", 71, "ConversationThreadIdUpdaterWorker.java")).t("ConversationThreadIdUpdaterWorker: Conversation does no longer exist. conversation_id=%s", ewsxVar.b);
            return eijx.e(cbcw.i());
        }
        avmy avmyVar = (avmy) this.c.b();
        final cnqj cnqjVar = new cnqj(ewsxVar.c);
        if (!((Boolean) avmy.c.e()).booleanValue()) {
            eijuVarB = eijx.e(null);
        } else if (cnqjVar.d()) {
            ((eksl) ((eksl) avmy.a.j()).h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "logMismatchAndUpdateThreadId", 306, "ConversationThreadIdGetterImpl.java")).D("BCM updating thread id for conversation failed. resolvedThread is unknown. conversationId=%s, existingThreadId=%s", bojhVarB.C(), bojhVarB.N());
            eijuVarB = ((awfv) avmyVar.d.b()).b(bojhVarB.C(), new Runnable() { // from class: avms
                @Override // java.lang.Runnable
                public final void run() {
                    eksp ekspVar2 = avmy.a;
                }
            }, emum.GET_OR_CREATE_THREAD_ID_FOR_CONVERSATION);
        } else if (bojhVarB.N().d()) {
            avmy.c(bojhVarB, cnqjVar);
            eijuVarB = eijx.e(null);
        } else {
            eijuVarB = ((awfv) avmyVar.d.b()).b(bojhVarB.C(), new Runnable() { // from class: avmt
                @Override // java.lang.Runnable
                public final void run() {
                    avmy.c(bojhVarB, cnqjVar);
                }
            }, emum.GET_OR_CREATE_THREAD_ID_FOR_CONVERSATION);
        }
        return eijuVarB.h(new ejvr() { // from class: avmz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = avna.a;
                return cbcw.i();
            }
        }, eoqg.a);
    }
}
