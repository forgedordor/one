package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akmw implements anpj {
    public final fcsu a;
    public final ConversationId b;
    public final anpj c;
    public final anpj d;
    private final fdjx e;

    public akmw(fdjx fdjxVar, fcsu fcsuVar, ConversationId conversationId, anpj anpjVar, anpj anpjVar2) {
        this.e = fdjxVar;
        this.a = fcsuVar;
        this.b = conversationId;
        this.c = anpjVar;
        this.d = anpjVar2;
    }

    @Override // defpackage.anpj
    public final cquc a(anpi anpiVar) {
        return this.c.a(anpiVar);
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.e, fcyi.a, fdjz.a, new akmv(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException("RbmConversationLocalIdentitiesSupplier.getBlocking is not supported.");
    }
}
