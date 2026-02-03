package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vpx implements ajzi {
    public final aisp a;
    public final crnp b;
    public final aika c;
    private final fdjx d;
    private final cohg e;

    public vpx(fdjx fdjxVar, aisp aispVar, crnp crnpVar, aika aikaVar) {
        fdjxVar.getClass();
        aispVar.getClass();
        crnpVar.getClass();
        aikaVar.getClass();
        this.d = fdjxVar;
        this.a = aispVar;
        this.b = crnpVar;
        this.c = aikaVar;
        this.e = new cohf("GilMetadataOpenConversationListener::onConversationOpened");
    }

    @Override // defpackage.ajzi
    public final eieu a() {
        return this.e.a();
    }

    @Override // defpackage.ajzi
    public final eiju b(BugleConversation bugleConversation, ajlm ajlmVar) {
        ajlmVar.getClass();
        fcyi fcyiVar = fcyi.a;
        fdjz fdjzVar = fdjz.a;
        return auvw.a(fdin.b(this.d, eicg.a(fcyiVar), fdjzVar, new vpw(null, bugleConversation, this)));
    }
}
