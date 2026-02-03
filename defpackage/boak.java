package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boak extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new boaj(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        ap(new dqpj("conversation_participants_audit_log.conversation_id", 1, Long.valueOf(barn.a(conversationIdType))));
    }
}
