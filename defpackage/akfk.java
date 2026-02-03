package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akfk implements anpj {
    public final ConversationId a;
    public final anpj b;
    private final fdjx c;

    public akfk(fdjx fdjxVar, ConversationId conversationId, anpj anpjVar) {
        this.c = fdjxVar;
        this.a = conversationId;
        this.b = anpjVar;
    }

    @Override // defpackage.anpj
    public final cquc a(anpi anpiVar) {
        return this.b.a(anpiVar);
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.c, fcyi.a, fdjz.a, new akfj(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
