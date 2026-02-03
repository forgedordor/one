package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpnz extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bpny(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        ap(new dqpj("gemini_conversation_id_mappings.conversation_id", 1, Long.valueOf(barn.a(conversationIdType))));
    }

    public final void c(axcm axcmVar) {
        ap(new dqpj("gemini_conversation_id_mappings.my_identity_token", 1, axcn.b(axcmVar)));
    }
}
