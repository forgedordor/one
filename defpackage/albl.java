package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class albl implements anpj {
    public final fdjx a;
    public final bbmo b;
    public final fcsu c;
    public final BugleConversationId d;
    public cquc e;
    public final cqtq f;
    private final cqtp g;

    public albl(fdjx fdjxVar, cqtp cqtpVar, bbmo bbmoVar, fcsu fcsuVar, BugleConversationId bugleConversationId) {
        this.a = fdjxVar;
        this.g = cqtpVar;
        this.b = bbmoVar;
        this.c = fcsuVar;
        this.d = bugleConversationId;
        this.f = cqtpVar.a(new albi(this));
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.f.a(new cqtk() { // from class: albg
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "ScreenEffectSuggestionObservableSupplier::register", "ScreenEffectSuggestionObservableSupplier::callback", "ScreenEffectSuggestionObservableSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.a, fcyi.a, fdjz.a, new albh(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
