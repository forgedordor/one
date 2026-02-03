package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bgvk extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bgvh(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        ap(new dqpj("messages.conversation_id", 1, Long.valueOf(barn.a(conversationIdType))));
    }

    public final void c(MessageIdType messageIdType) {
        ap(new dqpj("messages._id", 1, Long.valueOf(bary.a(messageIdType))));
    }

    public final void d() {
        int iIntValue = bgvl.c().intValue();
        if (iIntValue < 30010) {
            dqru.x("is_hidden", iIntValue);
        }
        ap(new dqty("messages.is_hidden", 1, 0));
    }

    public final void e(long j) {
        ap(new dqty("messages.received_timestamp", 9, Long.valueOf(j)));
    }

    public final void f(Iterable iterable) {
        ap(new dqpm("messages.message_status", 3, as(iterable), true));
    }

    public final void g(int i) {
        ap(new dqty("messages.message_status", 2, Integer.valueOf(i)));
    }
}
