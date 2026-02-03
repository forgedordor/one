package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atnx extends cayv {
    private static final eksp a = eksp.c("BugleGroupManagement");
    private final cifw b;
    private final ardw c;
    private final armi d;

    public atnx(cifw cifwVar, ardw ardwVar, armi armiVar) {
        this.b = cifwVar;
        this.c = ardwVar;
        this.d = armiVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("OnAddUserToGroupChatCompleteHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return aubf.a.getParserForType();
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final String f() {
        return "incoming_chat_api_queue";
    }

    @Override // defpackage.cayv
    protected final /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        aubf aubfVar = (aubf) evuhVar;
        aubl aublVar = aubfVar.c;
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
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/groups/OnAddUserToGroupChatCompleteHandler", "processPendingWorkItemAsync", 87, "OnAddUserToGroupChatCompleteHandler.java")).q("AddUserToGroupChatResponse failed.");
            if (this.c.a()) {
                this.b.f(aubfVar);
            } else {
                this.b.c(aubfVar);
            }
            return eijx.e(cbcw.k());
        }
        try {
            aubb aubbVar = (aubb) evsn.parseFrom(aubb.a, aubfVar.d, evrr.a());
            for (String str : aubbVar.d) {
                ekrw ekrwVarN = a.n();
                ekrwVarN.X(cqnc.N, aubbVar.c);
                ekrwVarN.X(cqnc.p, str);
                ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/chatapi/groups/OnAddUserToGroupChatCompleteHandler", "processPendingWorkItemAsync", 107, "OnAddUserToGroupChatCompleteHandler.java")).q("RCS backend has successfully processed the request to add user to the group chat.");
            }
            if (!this.c.a()) {
                cifw cifwVar = this.b;
                String str2 = aubbVar.e;
                str2.getClass();
                cifw.v(cifwVar, 17, 2, str2, null, null, null, 0, null, null, 504);
            } else if (this.d.a()) {
                cifw cifwVar2 = this.b;
                auib auibVar = aubbVar.f;
                if (auibVar == null) {
                    auibVar = auib.a;
                }
                cifwVar2.g(auibVar, new cbqz(aubbVar.g));
            } else {
                cifw cifwVar3 = this.b;
                auib auibVar2 = aubbVar.f;
                if (auibVar2 == null) {
                    auibVar2 = auib.a;
                }
                auibVar2.getClass();
                cifwVar3.g(auibVar2, cbqz.a);
            }
        } catch (evtj e) {
            ((eksl) ((eksl) a.n().g(e)).h("com/google/android/apps/messaging/shared/chatapi/groups/OnAddUserToGroupChatCompleteHandler", "processPendingWorkItemAsync", 124, "OnAddUserToGroupChatCompleteHandler.java")).q("RCS backend has successfully processed the request to add user(s) to the group chat but we are unable to parse the opaque data in the response.");
            if (this.c.a()) {
                this.b.f(aubfVar);
            }
        }
        return eijx.e(cbcw.i());
    }
}
