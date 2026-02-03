package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atob extends cayv {
    public static final ejxr a = cdag.w(200046194, "enable_populate_group_destination_on_create_group_response");
    public static final eksp b = eksp.c("BugleGroupManagement");
    public final bxlc c;
    private final cicm d;
    private final assa e;
    private final fcsu f;
    private final fcsu g;
    private final dqsn h;
    private final awng i;
    private final ardl j;

    public atob(cicm cicmVar, bxlc bxlcVar, assa assaVar, fcsu fcsuVar, dqsn dqsnVar, fcsu fcsuVar2, ardl ardlVar, awng awngVar) {
        this.d = cicmVar;
        this.c = bxlcVar;
        this.e = assaVar;
        this.f = fcsuVar;
        this.h = dqsnVar;
        this.g = fcsuVar2;
        this.j = ardlVar;
        this.i = awngVar;
    }

    private final ConversationIdType k(aucb aucbVar) {
        cicq cicqVarW = cicr.w();
        cicqVarW.j(false);
        cicqVarW.p(false);
        cicqVarW.q(true);
        cicqVarW.w(emaf.CREATE_GROUP_CHAT_COMPLETE_CALLBACK);
        cicqVarW.u(aucbVar.c);
        return this.d.a(cicqVarW.D());
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("OnCreateGroupChatCompleteHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return auch.a.getParserForType();
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final String f() {
        return "incoming_chat_api_queue";
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final aucb aucbVar;
        auch auchVar = (auch) evuhVar;
        try {
            aucbVar = (aucb) evsn.parseFrom(aucb.a, auchVar.e, evrr.a());
        } catch (evtj e) {
            ((eksl) ((eksl) b.n().g(e)).h("com/google/android/apps/messaging/shared/chatapi/groups/OnCreateGroupChatCompleteHandler", "getCreateGroupChatData", 186, "OnCreateGroupChatCompleteHandler.java")).q("RCS backend has successfully processed the request to create the group chat but we are unable to parse the opaque data in the response.");
            aucbVar = null;
        }
        if (aucbVar == null || aucbVar.c.isEmpty()) {
            ((eksl) ((eksl) b.j()).h("com/google/android/apps/messaging/shared/chatapi/groups/OnCreateGroupChatCompleteHandler", "processPendingWorkItemAsync", 121, "OnCreateGroupChatCompleteHandler.java")).q("Ignoring CreateGroupChatResponse with invalid opaque data.");
            ((cifw) this.g.b()).i();
            return eijx.e(cbcw.k());
        }
        String str = aucbVar.c;
        auib auibVar = aucbVar.e;
        if (auibVar == null) {
            auibVar = auib.a;
        }
        auib auibVar2 = auibVar;
        aubl aublVar = auchVar.c;
        if (aublVar == null) {
            aublVar = aubl.a;
        }
        aubk aubkVar = aubk.OK;
        aubk aubkVarB = aubk.b(aublVar.c);
        if (aubkVarB == null) {
            aubkVarB = aubk.UNKNOWN_STATUS;
        }
        if (!aubkVar.equals(aubkVarB)) {
            eksp ekspVar = b;
            eksl ekslVar = (eksl) ekspVar.j();
            ekslVar.X(atnw.a, aublVar);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/groups/OnCreateGroupChatCompleteHandler", "processPendingWorkItemAsync", 133, "OnCreateGroupChatCompleteHandler.java")).q("CreateGroupChatResponse failed.");
            ((cifw) this.g.b()).h(aucbVar, aublVar);
            ConversationIdType conversationIdTypeK = k(aucbVar);
            if (conversationIdTypeK.b()) {
                eksl ekslVar2 = (eksl) ekspVar.j();
                ekslVar2.X(cqnc.N, aucbVar.c);
                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/OnCreateGroupChatCompleteHandler", "disableConversationComposeBox", 238, "OnCreateGroupChatCompleteHandler.java")).q("Unable to find conversation for failed CreateGroupChatCompleteResponse. Skipping disabling compose box.");
            } else {
                String[] strArr = botm.a;
                bote boteVar = new bote();
                boteVar.ap("disableConversationComposeBox");
                boteVar.A(5);
                aubi aubiVar = aubi.GROUP_TOO_MANY_PARTICIPANTS;
                aubi aubiVarB = aubi.b(aublVar.d);
                if (aubiVarB == null) {
                    aubiVarB = aubi.UNKNOWN_CAUSE;
                }
                if (aubiVar.equals(aubiVarB)) {
                    boteVar.x(avoe.RCS_GROUP_CREATED_TOO_LARGE);
                }
                boteVar.f(conversationIdTypeK);
                this.c.d(conversationIdTypeK);
            }
            if (aucbVar.d) {
                asrz.a(2, (ains) this.e.a.b());
                assb assbVar = (assb) this.f.b();
                asry asryVar = assbVar.c;
                aubk aubkVarB2 = aubk.b(aublVar.c);
                if (aubkVarB2 == null) {
                    aubkVarB2 = aubk.UNKNOWN_STATUS;
                }
                enxk enxkVar = (enxk) asryVar.fM(aubkVarB2);
                atah atahVar = assbVar.b;
                aubi aubiVarB2 = aubi.b(aublVar.d);
                if (aubiVarB2 == null) {
                    aubiVarB2 = aubi.UNKNOWN_CAUSE;
                }
                assbVar.c(str, 3, enxkVar, (enxi) atahVar.fM(aubiVarB2), auibVar2);
            }
            return eijx.e(cbcw.i());
        }
        final aubq aubqVar = auchVar.d;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        aubp aubpVar = aubp.GROUP;
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        if (!aubpVar.equals(aubpVarB) || aubqVar.d.isEmpty()) {
            ((eksl) ((eksl) b.j()).h("com/google/android/apps/messaging/shared/chatapi/groups/OnCreateGroupChatCompleteHandler", "processPendingWorkItemAsync", 148, "OnCreateGroupChatCompleteHandler.java")).q("Ignoring CreateGroupChatResponse with invalid group destination");
            ((cifw) this.g.b()).h(aucbVar, aublVar);
            if (aucbVar.d) {
                ((assb) this.f.b()).c(str, 3, enxk.CHAT_API_FAILED_PERMANENTLY, enxi.CHAT_API_INVALID_CONFERENCE_URI, auibVar2);
            }
            return eijx.e(cbcw.k());
        }
        final ConversationIdType conversationIdTypeK2 = k(aucbVar);
        this.h.d("updateConferenceUriAndJoinState", new Runnable() { // from class: atoa
            @Override // java.lang.Runnable
            public final void run() {
                aucb aucbVar2 = aucbVar;
                ConversationIdType conversationIdType = conversationIdTypeK2;
                if (conversationIdType.b()) {
                    eksl ekslVar3 = (eksl) atob.b.j();
                    ekslVar3.X(cqnc.N, aucbVar2.c);
                    ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/chatapi/groups/OnCreateGroupChatCompleteHandler", "updateConferenceUriAndJoinState", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "OnCreateGroupChatCompleteHandler.java")).q("Unable to find conversation for successful CreateGroupChatCompleteResponse. Skipping updating conference URI and join state.");
                    return;
                }
                aubq aubqVar2 = aubqVar;
                String[] strArr2 = botm.a;
                bote boteVar2 = new bote();
                boteVar2.ap("updateConferenceUriAndJoinState");
                boteVar2.A(0);
                boteVar2.N(aubqVar2.d);
                boteVar2.f(conversationIdType);
                if (((Boolean) ((cczi) atob.a.get()).e()).booleanValue()) {
                    bxlc bxlcVar = this.a.c;
                    bxlcVar.c();
                    bxlcVar.d(conversationIdType);
                }
                ekrw ekrwVarN = atob.b.n();
                ekrwVarN.X(cqnc.r, conversationIdType.toString());
                ekrwVarN.X(cqnc.N, aucbVar2.c);
                ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/chatapi/groups/OnCreateGroupChatCompleteHandler", "updateConferenceUriAndJoinState", 223, "OnCreateGroupChatCompleteHandler.java")).q("RCS backend has successfully processed the request to add user to the group chat.");
            }
        });
        cifw cifwVar = (cifw) this.g.b();
        if (!aucbVar.d) {
            auib auibVar3 = aucbVar.e;
            if (auibVar3 == null) {
                auibVar3 = auib.a;
            }
            cifw.v(cifwVar, 3, 2, null, auibVar3, null, null, 0, null, null, 500);
        }
        if (aucbVar.d) {
            asrz.a(1, (ains) this.e.a.b());
            assb assbVar2 = (assb) this.f.b();
            ellv ellvVarA = assbVar2.a(str);
            ellvVarA.copyOnWrite();
            elmc elmcVar = (elmc) ellvVarA.instance;
            evsy evsyVar = elmc.a;
            elmcVar.d = 14;
            elmcVar.c |= 1;
            ellvVarA.copyOnWrite();
            elmc elmcVar2 = (elmc) ellvVarA.instance;
            elmcVar2.e = 1;
            elmcVar2.c |= 2;
            enrs enrsVar = (enrs) enru.a.createBuilder();
            fhaz fhazVar = (fhaz) assbVar2.a.fH().fM(auibVar2);
            enrsVar.copyOnWrite();
            enru enruVar = (enru) enrsVar.instance;
            fhazVar.getClass();
            enruVar.c = fhazVar;
            enruVar.b = 1 | enruVar.b;
            ellvVarA.copyOnWrite();
            elmc elmcVar3 = (elmc) ellvVarA.instance;
            enru enruVar2 = (enru) enrsVar.build();
            enruVar2.getClass();
            elmcVar3.n = enruVar2;
            elmcVar3.c |= 16384;
            assbVar2.b((elmc) ellvVarA.build());
        }
        if (!this.j.a()) {
            return eijx.e(cbcw.i());
        }
        awng awngVar = this.i;
        String str2 = aucbVar.c;
        str2.getClass();
        awnc awncVar = new awnc(str2);
        String str3 = aubqVar.d;
        str3.getClass();
        return awngVar.b(new awmm(awncVar, new awml(str3), fcvq.a, cigb.b())).h(new ejvr() { // from class: atnz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ejxr ejxrVar = atob.a;
                return cbcw.i();
            }
        }, eoqg.a);
    }
}
