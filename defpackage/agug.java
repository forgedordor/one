package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agug implements ajzi {
    public final fcsu a;
    private final fdjx b;
    private final cohg c;

    public agug(fdjx fdjxVar, fcsu fcsuVar) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        this.b = fdjxVar;
        this.a = fcsuVar;
        this.c = new cohf("PenpalOpenConversationListener::onConversationOpened");
    }

    @Override // defpackage.ajzi
    public final eieu a() {
        return this.c.a();
    }

    @Override // defpackage.ajzi
    public final eiju b(BugleConversation bugleConversation, ajlm ajlmVar) {
        ajlmVar.getClass();
        if (!((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue()) {
            eiju eijuVarE = eijx.e(null);
            eijuVarE.getClass();
            return eijuVarE;
        }
        fdjx fdjxVar = this.b;
        fcyi fcyiVar = fcyi.a;
        return auvw.a(fdin.b(fdjxVar, eicg.a(fcyiVar), fdjz.a, new aguf(null, bugleConversation, this)));
    }
}
