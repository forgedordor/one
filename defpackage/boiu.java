package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boiu extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new boit(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        ap(new dqpj("conversation_to_participants.conversation_id", 1, Long.valueOf(barn.a(conversationIdType))));
    }

    public final void c(dqxe dqxeVar) {
        ap(new dqpk("conversation_to_participants.conversation_id", 1, dqxeVar));
    }

    public final void d(dqxe dqxeVar) {
        ap(new dqpk("conversation_to_participants.conversation_id", 3, dqxeVar));
    }

    public final void e(long j) {
        ap(new dqty("conversation_to_participants.participant_id", 1, Long.valueOf(j)));
    }

    public final void f(Iterable iterable) {
        ap(new dqpm("conversation_to_participants.participant_id", 3, as(iterable), true));
    }
}
