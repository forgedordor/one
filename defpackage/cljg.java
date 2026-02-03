package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cljg implements ajzi {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/DunestarOpenConversationListener");
    public final anny b;
    private final aqtu c;
    private final fdjx d;
    private final cohg e;

    public cljg(aqtu aqtuVar, fdjx fdjxVar, anny annyVar) {
        aqtuVar.getClass();
        fdjxVar.getClass();
        annyVar.getClass();
        this.c = aqtuVar;
        this.d = fdjxVar;
        this.b = annyVar;
        this.e = new cohf("DunestarOpenConversationListener::onConversationOpened");
    }

    @Override // defpackage.ajzi
    public final eieu a() {
        return this.e.a();
    }

    @Override // defpackage.ajzi
    public final eiju b(BugleConversation bugleConversation, ajlm ajlmVar) {
        ajlmVar.getClass();
        if (this.c.a() && ajlmVar == ajlm.FOR_DISPLAY) {
            return auvw.c(this.d, fcyi.a, fdjz.a, new cljf(bugleConversation, this, null));
        }
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }
}
