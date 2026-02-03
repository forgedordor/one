package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajth implements ajzi {
    public final fcsu a;
    public final fcsu b;
    private final fdjx c;
    private final cohg d;

    public ajth(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.c = fdjxVar;
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.d = new cohf("ActiveUserMetricsOpenConversationListener::onConversationOpened");
    }

    @Override // defpackage.ajzi
    public final eieu a() {
        return this.d.a();
    }

    @Override // defpackage.ajzi
    public final eiju b(BugleConversation bugleConversation, ajlm ajlmVar) {
        ajlmVar.getClass();
        if (ajlmVar == ajlm.FOR_DISPLAY) {
            return auvw.c(this.c, fcyi.a, fdjz.a, new ajtg(bugleConversation, this, null));
        }
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }
}
