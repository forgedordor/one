package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ante implements aokq {
    final /* synthetic */ ConversationId a;
    final /* synthetic */ antf b;

    public ante(antf antfVar, ConversationId conversationId) {
        this.a = conversationId;
        this.b = antfVar;
    }

    @Override // defpackage.aokq
    public final eiju a() {
        eieu eieuVarK = eiiy.k("getActiveRecipientsForConversation");
        ConversationId conversationId = this.a;
        antf antfVar = this.b;
        try {
            eiju eijuVarH = antf.k(conversationId).x().h(new anrh(antfVar), antfVar.b);
            eieuVarK.b(eijuVarH);
            eieuVarK.close();
            return eijuVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aokq
    public final /* bridge */ /* synthetic */ Object b() {
        return this.b.A(antf.k(this.a).z());
    }
}
