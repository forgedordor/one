package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akkz implements anpj {
    public final PenpalBotConversationId a;
    public final BugleConversation b;
    private final fdjx c;

    public akkz(fdjx fdjxVar, PenpalBotConversationId penpalBotConversationId, BugleConversation bugleConversation) {
        this.c = fdjxVar;
        this.a = penpalBotConversationId;
        this.b = bugleConversation;
    }

    @Override // defpackage.anpj
    public final cquc a(anpi anpiVar) {
        return this.b.n().a(anpiVar);
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.c, fcyi.a, fdjz.a, new akky(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
