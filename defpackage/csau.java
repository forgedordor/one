package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csau extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new csat(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        ap(new dqpj("spam_logging_ids_table.conversation_id", 1, Long.valueOf(barn.a(conversationIdType))));
    }

    public final void c() {
        ap(new dqpn("spam_logging_ids_table.conversation_logging_id", 6));
    }

    public final void d() {
        ap(new dqpj("spam_logging_ids_table.conversation_logging_id", 2, ""));
    }
}
