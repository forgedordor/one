package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.EnumSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akfq implements ajsq {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/conversation/emergencysos/EmergencySosConversationRepository");
    public static final Set b = EnumSet.of(cloc.SESSION_STATUS_OFF, cloc.SESSION_STATUS_DISABLING, cloc.SESSION_STATUS_ENDING_EMERGENCY);
    public final akfg c;
    public final eosc d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    private final fcsu h;
    private final fcsu i;

    public akfq(akfg akfgVar, eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.c = akfgVar;
        this.d = eoscVar;
        this.e = fcsuVar;
        this.h = fcsuVar2;
        this.f = fcsuVar3;
        this.i = fcsuVar4;
        this.g = fcsuVar5;
    }

    @Override // defpackage.ajln
    public final eiju A(ConversationId conversationId, akbl akblVar) {
        return eijx.d(new UnsupportedOperationException("setParentalApprovalStatusLocally not supported for emergency sos conversations"));
    }

    @Override // defpackage.ajln
    public final eiju B(ConversationId conversationId, Recipient recipient, crvz crvzVar) {
        return ((ajvr) this.g.b()).B(conversationId, recipient, crvzVar);
    }

    @Override // defpackage.ajln
    public final eiju C(ConversationId conversationId, elka elkaVar) {
        ejwl.a(conversationId instanceof EmergencySosConversationId);
        return ((ajvr) this.g.b()).C(((EmergencySosConversationId) conversationId).b, elkaVar);
    }

    @Override // defpackage.ajln
    public final eiju D(ConversationId conversationId, Recipient recipient, crwz crwzVar, String str, boolean z, crvz crvzVar) {
        return ((ajvr) this.g.b()).D(conversationId, recipient, crwzVar, str, false, crvzVar);
    }

    @Override // defpackage.ajln
    public final eiju E(ConversationId conversationId, Uri uri) {
        return eijx.d(new UnsupportedOperationException("Icon update not supported for emergency sos conversations"));
    }

    @Override // defpackage.ajln
    public final eiju F(ConversationId conversationId) {
        return eijx.d(new UnsupportedOperationException("upgradeConversation not supported for emergency sos conversations"));
    }

    @Override // defpackage.ajln
    public final eiju G(ConversationId conversationId, elka elkaVar) {
        eieu eieuVarK = eiiy.k("EmergencySosConversationRepository#deleteConversation");
        try {
            ejwl.a(conversationId instanceof EmergencySosConversationId);
            eiju eijuVarG = ((ajvr) this.g.b()).G(((EmergencySosConversationId) conversationId).b, elkaVar);
            eieuVarK.close();
            return eijuVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajln
    public final anpj H(int i) {
        return ((ajvr) this.g.b()).H(i);
    }

    @Override // defpackage.ajln
    public final eiju I(ekgb ekgbVar, int i) {
        return eijx.d(new UnsupportedOperationException("markConversationsAsRead not supported for emergency sos conversations"));
    }

    @Override // defpackage.ajln
    public final eiju J(ekgb ekgbVar, int i) {
        return eijx.d(new UnsupportedOperationException("markConversationsAsUnread not supported for emergency sos conversations"));
    }

    @Override // defpackage.ajsq
    public final ConversationId K(akln aklnVar) {
        aklm aklmVarB = aklm.b(aklnVar.b);
        if (aklmVarB == null) {
            aklmVarB = aklm.UNRECOGNIZED;
        }
        ejwl.a(aklmVarB == aklm.SATELLITE);
        return new EmergencySosConversationId(barn.b(aklnVar.c));
    }

    public final eiju L(final ekgb ekgbVar, final String str, final boolean z) {
        eiju eijuVarA = ((clhd) this.h.b()).a();
        eooz eoozVar = new eooz() { // from class: akfo
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((ajvr) this.a.g.b()).m(ekgbVar, str);
            }
        };
        eosc eoscVar = this.d;
        return eijuVarA.i(eoozVar, eoscVar).i(new eooz() { // from class: akfp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Conversation conversation = (Conversation) obj;
                akfq akfqVar = this.a;
                cllw cllwVar = (cllw) akfqVar.e.b();
                auvh.f(auvw.c(cllwVar.d, fcyi.a, fdjz.a, new cllv(cllwVar, null)), "Failed to schedule questionnaire retrieval in PWQ.");
                if (z) {
                    auvh.f(((ajvr) akfqVar.g.b()).O(conversation.d(), 9), "Failed to disable emergency sos conversation.");
                }
                return eijx.e(akfqVar.c.a((BugleConversation) conversation));
            }
        }, eoscVar);
    }

    public final boolean M(alqm alqmVar, boolean z) {
        return (z ? ((alrj) this.i.b()).m() : ((alrj) this.i.b()).l()).equals(alqmVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.apps.messaging.shared.api.messaging.Conversation, com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation] */
    @Override // defpackage.ajln
    public final Conversation a(ConversationId conversationId, ajlm ajlmVar) {
        eieu eieuVarK = eiiy.k("EmergencySosConversationRepository#openConversation");
        try {
            ejwl.a(conversationId instanceof EmergencySosConversationId);
            EmergencySosConversation emergencySosConversationA = this.c.a(((ajvr) this.g.b()).a(((EmergencySosConversationId) conversationId).b, ajlmVar));
            auvh.f(((clox) this.f.b()).a(), "Failed to update satellite session status.");
            eieuVarK.close();
            return emergencySosConversationA;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajln
    public final /* synthetic */ ConversationId b(akln aklnVar) {
        return ajsp.a();
    }

    @Override // defpackage.ajln
    public final /* synthetic */ ConversationId c(byte[] bArr) {
        return ajsp.b();
    }

    @Override // defpackage.ajln
    public final eiju d(ConversationId conversationId, elka elkaVar) {
        ejwl.a(conversationId instanceof EmergencySosConversationId);
        return ((ajvr) this.g.b()).d(((EmergencySosConversationId) conversationId).b, elkaVar);
    }

    @Override // defpackage.ajln
    public final eiju e(ConversationId conversationId) {
        return ((ajvr) this.g.b()).e(((EmergencySosConversationId) conversationId).b);
    }

    @Override // defpackage.ajln
    public final eiju f(aoer aoerVar, ConversationId conversationId) {
        return eijx.d(new UnsupportedOperationException("createInviteLink not supported for emergency sos conversations"));
    }

    @Override // defpackage.ajln
    public final eiju g(aoer aoerVar, ConversationId conversationId) {
        return eijx.d(new UnsupportedOperationException("disableInviteLink not supported for emergency sos conversations"));
    }

    @Override // defpackage.ajln
    public final eiju h(akzk akzkVar) {
        return eijx.d(new UnsupportedOperationException("Find conversation not supported for emergency sos conversations"));
    }

    @Override // defpackage.ajln
    public final eiju i(awjl awjlVar) {
        return eijx.d(new UnsupportedOperationException("Find conversation not supported for emergency sos conversations"));
    }

    @Override // defpackage.ajln
    public final eiju j(ekgb ekgbVar) {
        return eijx.d(new UnsupportedOperationException("Find conversation not supported for emergency sos conversations"));
    }

    @Override // defpackage.ajln
    public final eiju k() {
        int i = ekgb.d;
        return eijx.e(ekoe.a);
    }

    @Override // defpackage.ajln
    public final eiju l(ConversationId conversationId) {
        return eijx.e(cgrc.b);
    }

    @Override // defpackage.ajln
    public final eiju m(ekgb ekgbVar, String str) {
        return ajll.a(this, Optional.empty(), ekgbVar, str);
    }

    @Override // defpackage.ajln
    public final eiju n(awjl awjlVar, aoer aoerVar, ajsm ajsmVar) {
        return eijx.d(new UnsupportedOperationException("getOrCreateConversation by destination unsupported for emergency sos conversations"));
    }

    @Override // defpackage.ajln
    public final /* synthetic */ eiju o(Optional optional, ekgb ekgbVar, String str) {
        return ajll.a(this, optional, ekgbVar, str);
    }

    @Override // defpackage.ajln
    public final eiju p(Optional optional, final ekgb ekgbVar, final String str, Uri uri) {
        eiju eijuVarI;
        if (uri != null) {
            return eijx.d(new IllegalArgumentException("Emergency SOS conversation does not support group icon."));
        }
        eieu eieuVarK = eiiy.k("EmergencySosConversationRepository#getOrCreateConversation");
        try {
            if (ekgbVar.isEmpty()) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleSatellite");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/api/messaging/conversation/emergencysos/EmergencySosConversationRepository", "getOrCreateConversation", 133, "EmergencySosConversationRepository.java")).q("Unable to getOrCreateConversation: Empty recipient list.");
                eijuVarI = eijx.d(new IllegalArgumentException("Unable to getOrCreateConversation: Empty recipient list."));
            } else {
                boolean z = true;
                if (ekgbVar.size() != 1 || !((Recipient) ekgbVar.get(0)).g().B()) {
                    z = false;
                }
                ejwl.b(z, "Only one Satellite recipient is supported.");
                ekrw ekrwVarH = a.h();
                ekrwVarH.X(eksq.a, "BugleSatellite");
                ekrd ekrdVar = (ekrd) ekrwVarH;
                ekrdVar.X(cqnc.G, ((Recipient) ekgbVar.get(0)).g());
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/emergencysos/EmergencySosConversationRepository", "getOrCreateConversation", 144, "EmergencySosConversationRepository.java")).q("Processing getOrCreate for emergency conversation.");
                eijuVarI = ((clox) this.f.b()).a().i(new eooz() { // from class: akfn
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
                    @Override // defpackage.eooz
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r9) {
                        /*
                            r8 = this;
                            clod r9 = (defpackage.clod) r9
                            int r0 = r9.c
                            cloc r0 = defpackage.cloc.b(r0)
                            if (r0 != 0) goto Lc
                            cloc r0 = defpackage.cloc.UNRECOGNIZED
                        Lc:
                            java.lang.String r1 = r3
                            ekgb r2 = r2
                            akfq r3 = r8.a
                            cloc r4 = defpackage.cloc.SESSION_STATUS_DEMO
                            r5 = 1
                            r6 = 0
                            if (r0 == r4) goto L70
                            java.lang.Object r0 = r2.get(r6)
                            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r0 = (com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient) r0
                            alqm r0 = r0.g()
                            boolean r0 = r3.M(r0, r5)
                            if (r0 == 0) goto L70
                            ekrg r0 = defpackage.akfq.a
                            ekrw r0 = r0.j()
                            ekrz r4 = defpackage.eksq.a
                            java.lang.String r5 = "BugleSatellite"
                            r0.X(r4, r5)
                            ekrd r0 = (defpackage.ekrd) r0
                            r4 = 158(0x9e, float:2.21E-43)
                            java.lang.String r5 = "EmergencySosConversationRepository.java"
                            java.lang.String r6 = "com/google/android/apps/messaging/shared/api/messaging/conversation/emergencysos/EmergencySosConversationRepository"
                            java.lang.String r7 = "getOrCreateConversation"
                            ekrw r0 = r0.h(r6, r7, r4, r5)
                            ekrd r0 = (defpackage.ekrd) r0
                            int r9 = r9.c
                            cloc r9 = defpackage.cloc.b(r9)
                            if (r9 != 0) goto L4f
                            cloc r9 = defpackage.cloc.UNRECOGNIZED
                        L4f:
                            java.lang.String r4 = "Invalid session status [%s] for creating demo conversation, trying syncing session status with Stargate"
                            java.lang.String r9 = r9.name()
                            r0.t(r4, r9)
                            fcsu r9 = r3.f
                            java.lang.Object r9 = r9.b()
                            clox r9 = (defpackage.clox) r9
                            eiju r9 = r9.b()
                            akfm r0 = new akfm
                            r0.<init>()
                            eosc r1 = r3.d
                            eiju r9 = r9.i(r0, r1)
                            return r9
                        L70:
                            java.lang.Object r0 = r2.get(r6)
                            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r0 = (com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient) r0
                            alqm r0 = r0.g()
                            boolean r0 = r3.M(r0, r6)
                            if (r0 == 0) goto L93
                            java.util.Set r0 = defpackage.akfq.b
                            int r9 = r9.c
                            cloc r9 = defpackage.cloc.b(r9)
                            if (r9 != 0) goto L8c
                            cloc r9 = defpackage.cloc.UNRECOGNIZED
                        L8c:
                            boolean r9 = r0.contains(r9)
                            if (r9 == 0) goto L93
                            goto L94
                        L93:
                            r5 = r6
                        L94:
                            eiju r9 = r3.L(r2, r1, r5)
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.akfn.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                    }
                }, this.d);
            }
            eieuVarK.close();
            return eijuVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajln
    public final eiju q(ConversationId conversationId, akcy akcyVar, Recipient recipient) {
        return eijx.d(new UnsupportedOperationException("incomingRichThemeUpdate not supported for emergency sos conversations"));
    }

    @Override // defpackage.ajln
    public final eiju r(ConversationId conversationId) {
        return eijx.d(new UnsupportedOperationException("Leave not supported for emergency sos conversation"));
    }

    @Override // defpackage.ajln
    public final eiju s(ekgb ekgbVar) {
        return eijx.d(new UnsupportedOperationException("Leave not supported for emergency sos conversation"));
    }

    @Override // defpackage.ajln
    public final eiju t(ConversationId conversationId, cgrc cgrcVar, cgra cgraVar) {
        return eijx.d(new UnsupportedOperationException("muteConversation not supported for emergency sos conversations"));
    }

    @Override // defpackage.ajln
    public final eiju u(ConversationId conversationId, akcy akcyVar) {
        return eijx.d(new UnsupportedOperationException("outgoingRichThemeUpdate not supported for emergency sos conversations"));
    }

    @Override // defpackage.ajln
    public final eiju v(Recipient recipient) {
        return eijx.d(new UnsupportedOperationException("refreshAllConversationIconsForRecipient not supported for emergency sos conversations"));
    }

    @Override // defpackage.ajln
    public final eiju w(ConversationId conversationId, String str) {
        return eijx.d(new UnsupportedOperationException("Rename not supported for emergency sos conversations"));
    }

    @Override // defpackage.ajln
    public final eiju x(ConversationId conversationId, aoer aoerVar) {
        eieu eieuVarK = eiiy.k("EmergencySosConversationRepository#setActiveSelfIdentity");
        try {
            ejwl.a(conversationId instanceof EmergencySosConversationId);
            eiju eijuVarX = ((ajvr) this.g.b()).x(((EmergencySosConversationId) conversationId).b, aoerVar);
            eieuVarK.close();
            return eijuVarX;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajln
    public final eiju y(ConversationId conversationId, String str, String str2, amsv amsvVar) {
        return ((ajvr) this.g.b()).y(((EmergencySosConversationId) conversationId).b, str, str2, amsvVar);
    }

    @Override // defpackage.ajln
    public final eiju z(ConversationId conversationId, String str, Uri uri) {
        return eijx.d(new UnsupportedOperationException("setNameAndIcon not supported for emergency sos conversations"));
    }
}
