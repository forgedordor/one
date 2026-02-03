package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crvw implements ajzi {
    public final fcsu a;
    public final fcsu b;
    private final fdjx c;
    private final cohg d;

    public crvw(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        this.c = fdjxVar;
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.d = new cohf("ChatbotSubscriptionOpenConversationListener::onConversationOpened");
    }

    @Override // defpackage.ajzi
    public final eieu a() {
        return this.d.a();
    }

    @Override // defpackage.ajzi
    public final eiju b(BugleConversation bugleConversation, ajlm ajlmVar) {
        ajlmVar.getClass();
        if (((Boolean) ((cczi) crvx.a.get()).e()).booleanValue()) {
            return auvw.a(eicj.c(this.c, new crvv(bugleConversation, this, null)));
        }
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }
}
