package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmjc extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bmjb(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        ap(new dqpj("add_contact_banner.conversation_id", 1, Long.valueOf(barn.a(conversationIdType))));
    }
}
