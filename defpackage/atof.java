package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atof extends cayv {
    private static final eksp a = eksp.c("BugleGroupManagement");

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("OnTriggerChatGroupFullStateUpdateCompleteHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return auik.a.getParserForType();
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final String f() {
        return "incoming_chat_api_queue";
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        auik auikVar = (auik) evuhVar;
        aubl aublVar = auikVar.c;
        if (aublVar == null) {
            aublVar = aubl.a;
        }
        aubk aubkVar = aubk.OK;
        aubk aubkVarB = aubk.b(aublVar.c);
        if (aubkVarB == null) {
            aubkVarB = aubk.UNKNOWN_STATUS;
        }
        if (!aubkVar.equals(aubkVarB)) {
            eksl ekslVar = (eksl) a.j();
            ekslVar.X(atnw.a, aublVar);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/groups/OnTriggerChatGroupFullStateUpdateCompleteHandler", "processPendingWorkItemAsync", 63, "OnTriggerChatGroupFullStateUpdateCompleteHandler.java")).q("TriggerChatGroupFullStateUpdateResponse failed.");
            return eijx.e(cbcw.k());
        }
        try {
            auig auigVar = (auig) evsn.parseFrom(auig.a, auikVar.d, evrr.a());
            ekrw ekrwVarN = a.n();
            ekrwVarN.X(cqnc.N, auigVar.c);
            ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/chatapi/groups/OnTriggerChatGroupFullStateUpdateCompleteHandler", "processPendingWorkItemAsync", 77, "OnTriggerChatGroupFullStateUpdateCompleteHandler.java")).q("Group full state successfully requested.");
        } catch (evtj e) {
            ((eksl) ((eksl) a.n().g(e)).h("com/google/android/apps/messaging/shared/chatapi/groups/OnTriggerChatGroupFullStateUpdateCompleteHandler", "processPendingWorkItemAsync", 79, "OnTriggerChatGroupFullStateUpdateCompleteHandler.java")).q("Group full state successfully requested but we were unable to parse the opaque data in the response.");
        }
        return eijx.e(cbcw.i());
    }
}
