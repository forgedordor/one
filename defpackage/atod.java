package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atod extends cayv {
    private static final eksp a = eksp.c("BugleGroupManagement");
    private final cifw b;
    private final ardx c;
    private final armi d;

    public atod(cifw cifwVar, ardx ardxVar, armi armiVar) {
        this.b = cifwVar;
        this.c = ardxVar;
        this.d = armiVar;
    }

    private final cbqz k(augg auggVar) {
        return this.d.a() ? new cbqz(auggVar.g) : cbqz.a;
    }

    private static boolean l(augg auggVar) {
        return (auggVar.b & 2) == 0;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("OnRemoveUserFromGroupChatCompleteHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return augk.a.getParserForType();
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final String f() {
        return "incoming_chat_api_queue";
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        augk augkVar = (augk) evuhVar;
        aubl aublVar = augkVar.c;
        if (aublVar == null) {
            aublVar = aubl.a;
        }
        augg auggVar = augg.a;
        Optional optionalEmpty = Optional.empty();
        try {
            auggVar = (augg) evsn.parseFrom(auggVar, augkVar.d, evrr.a());
        } catch (evtj e) {
            optionalEmpty = Optional.of(e);
        }
        aubk aubkVar = aubk.OK;
        aubk aubkVarB = aubk.b(aublVar.c);
        if (aubkVarB == null) {
            aubkVarB = aubk.UNKNOWN_STATUS;
        }
        if (!aubkVar.equals(aubkVarB)) {
            eksl ekslVar = (eksl) a.j();
            ekslVar.X(atnw.a, aublVar);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/groups/OnRemoveUserFromGroupChatCompleteHandler", "processPendingWorkItemAsync", 98, "OnRemoveUserFromGroupChatCompleteHandler.java")).q("RemoveUserFromGroupChatResponse failed.");
            if (!l(auggVar)) {
                cifw cifwVar = this.b;
                auib auibVar = auggVar.f;
                if (auibVar == null) {
                    auibVar = auib.a;
                }
                auib auibVar2 = auibVar;
                cbqz cbqzVarK = k(auggVar);
                auibVar2.getClass();
                aublVar.getClass();
                cbqzVarK.getClass();
                cifw.v(cifwVar, 19, 3, null, auibVar2, null, cifwVar.m(3, aublVar), 0, cbqzVarK, null, 340);
            } else if (this.c.a()) {
                cifw cifwVar2 = this.b;
                auib auibVar3 = auggVar.f;
                if (auibVar3 == null) {
                    auibVar3 = auib.a;
                }
                cifwVar2.x(auibVar3, aublVar, 1, k(auggVar));
            } else {
                cifw cifwVar3 = this.b;
                String str = auggVar.e;
                str.getClass();
                cifwVar3.r(str, aublVar, 3, 1);
            }
            return eijx.e(cbcw.k());
        }
        if (optionalEmpty.isEmpty()) {
            ekrw ekrwVarN = a.n();
            ekrz ekrzVar = cqnc.N;
            augg auggVar2 = augg.a;
            ekrwVarN.X(ekrzVar, auggVar2.c.equals(auggVar.c) ? "missing-rcs-group-id" : auggVar.c);
            ekrwVarN.X(cqnc.p, auggVar2.d.equals(auggVar.d) ? "missing-participant-id" : auggVar.d);
            ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/chatapi/groups/OnRemoveUserFromGroupChatCompleteHandler", "processPendingWorkItemAsync", 140, "OnRemoveUserFromGroupChatCompleteHandler.java")).q("RCS backend has successfully processed the request to remove user from the group chat.");
        } else {
            ((eksl) ((eksl) a.n().g((Throwable) optionalEmpty.get())).h("com/google/android/apps/messaging/shared/chatapi/groups/OnRemoveUserFromGroupChatCompleteHandler", "processPendingWorkItemAsync", 144, "OnRemoveUserFromGroupChatCompleteHandler.java")).q("RCS backend has successfully processed the request to remove user from the group chat but we are unable to parse the opaque data in the response.");
        }
        if (!l(auggVar)) {
            cifw cifwVar4 = this.b;
            auib auibVar4 = auggVar.f;
            if (auibVar4 == null) {
                auibVar4 = auib.a;
            }
            auib auibVar5 = auibVar4;
            cbqz cbqzVarK2 = k(auggVar);
            auibVar5.getClass();
            cbqzVarK2.getClass();
            cifw.v(cifwVar4, 19, 2, null, auibVar5, null, null, 0, cbqzVarK2, null, 372);
        } else if (this.c.a()) {
            cifw cifwVar5 = this.b;
            auib auibVar6 = auggVar.f;
            if (auibVar6 == null) {
                auibVar6 = auib.a;
            }
            cifwVar5.k(auibVar6, k(auggVar));
        } else {
            this.b.j(auggVar.e);
        }
        return eijx.e(cbcw.i());
    }
}
