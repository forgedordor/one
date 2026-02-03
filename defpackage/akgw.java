package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akgw implements anpj {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/conversation/group/GroupObservableSupplier");
    public final fcyh b;
    public final fdjx c;
    public final awnf d;
    public final fdap e;
    public final cqtq f;
    public final akgn g;

    public akgw(BugleConversationId bugleConversationId, fcyh fcyhVar, fdjx fdjxVar, awnf awnfVar, cqtp cqtpVar, awlc awlcVar) {
        fcyhVar.getClass();
        fdjxVar.getClass();
        awnfVar.getClass();
        cqtpVar.getClass();
        awlcVar.getClass();
        this.b = fcyhVar;
        this.c = fdjxVar;
        this.d = awnfVar;
        this.e = new elge(new akgv(this, bugleConversationId, null));
        this.g = new akgn(this);
        this.f = cqtpVar.a(new akgo(awlcVar, this));
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.f.a(new cqtk() { // from class: akgm
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "GroupObservableSupplier::register", "GroupObservableSupplier::callback", "GroupObservableSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.c, fcyi.a, fdjz.a, new akgp(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
