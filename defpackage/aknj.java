package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aknj implements anpj {
    public final bbmo a;
    public final asqr b;
    public final fcsu c;
    public final BugleConversation d;
    public final cqtq e;
    private final fdjx f;
    private final fdjx g;
    private final cqtp h;

    public aknj(fdjx fdjxVar, fdjx fdjxVar2, cqtp cqtpVar, bbmo bbmoVar, asqr asqrVar, fcsu fcsuVar, BugleConversation bugleConversation) {
        this.f = fdjxVar;
        this.g = fdjxVar2;
        this.h = cqtpVar;
        this.a = bbmoVar;
        this.b = asqrVar;
        this.c = fcsuVar;
        this.d = bugleConversation;
        this.e = cqtpVar.a(new akng(this));
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.e.a(new cqtk() { // from class: akmz
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "RbmConversationPropertiesSupplier::register", "RbmConversationPropertiesSupplier::callback", "RbmConversationPropertiesSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.g, fcyi.a, fdjz.a, new akne(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final eiju d() {
        return auvw.c(this.f, fcyi.a, fdjz.a, new akni(this, null));
    }
}
