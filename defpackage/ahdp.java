package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahdp implements ajzi {
    private static final eksp a = eksp.c("BugleProfiles");
    private final Optional b;
    private final cohg c = new cohf("ProfileOpenConversationListener::onConversationOpened");

    public ahdp(Optional optional) {
        this.b = optional;
    }

    @Override // defpackage.ajzi
    public final eieu a() {
        return this.c.a();
    }

    @Override // defpackage.ajzi
    public final eiju b(BugleConversation bugleConversation, ajlm ajlmVar) {
        ajlmVar.getClass();
        Optional optional = this.b;
        if (optional.isEmpty()) {
            eksl ekslVar = (eksl) a.h();
            ekslVar.X(cqnc.s, ((DefaultConversation) bugleConversation).a.a);
            ekslVar.q("Unable to refresh profiles for conversation, missing refresher");
            eiju eijuVarE = eijx.e(null);
            eijuVarE.getClass();
            return eijuVarE;
        }
        if (ajlmVar != ajlm.FOR_DISPLAY) {
            eksl ekslVar2 = (eksl) a.h();
            ekslVar2.X(cqnc.s, ((DefaultConversation) bugleConversation).a.a);
            ekslVar2.q("Conversation not opened for display, not refreshing profile");
            eiju eijuVarE2 = eijx.e(null);
            eijuVarE2.getClass();
            return eijuVarE2;
        }
        eksl ekslVar3 = (eksl) a.h();
        BugleConversationId bugleConversationId = ((DefaultConversation) bugleConversation).a;
        ekrz ekrzVar = cqnc.s;
        ConversationIdType conversationIdType = bugleConversationId.a;
        ekslVar3.X(ekrzVar, conversationIdType);
        ekslVar3.q("Refresh profiles for conversation");
        chqj chqjVar = (chqj) optional.get();
        auvw.k(chqjVar.a, null, null, new chqh(chqjVar, conversationIdType, null), 3);
        eiju eijuVarE3 = eijx.e(null);
        eijuVarE3.getClass();
        return eijuVarE3;
    }
}
