package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqrf extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bqrc(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        int iIntValue = bqrg.c().intValue();
        if (iIntValue < 59460) {
            dqru.x("conversation_id", iIntValue);
        }
        ap(new dqpj("message_spam.conversation_id", 1, Long.valueOf(barn.a(conversationIdType))));
    }

    public final void c(MessageIdType messageIdType) {
        ap(new dqpj("message_spam.message_id", 1, Long.valueOf(bary.a(messageIdType))));
    }
}
