package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akex implements anpj {
    public final fdjx a;
    public final BugleConversation b;
    public final cqtq c;
    private final fdjx d;
    private final cqtp e;

    public akex(fdjx fdjxVar, fdjx fdjxVar2, cqtp cqtpVar, BugleConversation bugleConversation) {
        this.a = fdjxVar;
        this.d = fdjxVar2;
        this.e = cqtpVar;
        this.b = bugleConversation;
        this.c = cqtpVar.a(new akeu(this));
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.c.a(new cqtk() { // from class: akeq
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "EmergencyConversationPropertiesSupplier::register", "EmergencyConversationPropertiesSupplier::callback", "EmergencyConversationPropertiesSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new akes(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
