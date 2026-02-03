package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajzf implements ajzi {
    private static final eksp a = eksp.c("BugleE2eeEtouffee");
    private final cohg b;
    private final aykj c;

    public ajzf(aykj aykjVar) {
        aykjVar.getClass();
        this.c = aykjVar;
        this.b = new cohf("EtouffeeOpenConversationListener::onConversationOpened");
    }

    @Override // defpackage.ajzi
    public final eieu a() {
        return this.b.a();
    }

    @Override // defpackage.ajzi
    public final eiju b(BugleConversation bugleConversation, ajlm ajlmVar) {
        ajlmVar.getClass();
        ekrw ekrwVarN = a.n();
        BugleConversationId bugleConversationId = ((DefaultConversation) bugleConversation).a;
        ekrwVarN.t("Refresh encryption status for conversation %s.", bugleConversationId.b());
        this.c.a(bugleConversationId.a).s();
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }
}
