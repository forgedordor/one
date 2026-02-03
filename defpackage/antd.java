package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class antd implements aokq {
    final /* synthetic */ ConversationId a;
    final /* synthetic */ antf b;

    public antd(antf antfVar, ConversationId conversationId) {
        this.a = conversationId;
        this.b = antfVar;
    }

    @Override // defpackage.aokq
    public final eiju a() {
        eieu eieuVarK = eiiy.k("getAllRecipientsForConversation");
        ConversationId conversationId = this.a;
        antf antfVar = this.b;
        try {
            eiju eijuVarH = antf.m(conversationId).x().h(new anrh(antfVar), antfVar.b);
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
        return this.b.A(antf.m(this.a).z());
    }
}
