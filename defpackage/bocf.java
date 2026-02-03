package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bocf extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new boce(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        ap(new dqpj("conversation_participants.conversation_id", 1, Long.valueOf(barn.a(conversationIdType))));
    }

    public final void c(long j) {
        ap(new dqty("conversation_participants.participant_id", 1, Long.valueOf(j)));
    }

    public final void d(Iterable iterable) {
        ap(new dqpm("conversation_participants.participant_id", 3, as(iterable), true));
    }
}
