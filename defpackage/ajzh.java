package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajzh implements ajzi {
    public final arkx a;
    public final cpeh b;
    private final fdjx c;
    private final cohg d;

    public ajzh(fdjx fdjxVar, cpeh cpehVar, arkx arkxVar) {
        fdjxVar.getClass();
        this.c = fdjxVar;
        this.b = cpehVar;
        this.a = arkxVar;
        this.d = new cohf("LegacyGroupProtocolSwitchOpenConversationListener::onConversationOpened");
    }

    @Override // defpackage.ajzi
    public final eieu a() {
        return this.d.a();
    }

    @Override // defpackage.ajzi
    public final eiju b(BugleConversation bugleConversation, ajlm ajlmVar) {
        ajlmVar.getClass();
        return auvw.i(this.c, new ajzg(this, ajlmVar, bugleConversation, null));
    }
}
