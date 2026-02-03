package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpcx extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bpcw(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        ap(new dqpj("drafts.conversation_id", 1, Long.valueOf(barn.a(conversationIdType))));
    }
}
