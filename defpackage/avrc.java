package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avrc extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new avrb(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        ap(new dqpj("conversation_matcher_cache.conversation_id", 1, Long.valueOf(barn.a(conversationIdType))));
    }

    public final void c(long j) {
        ap(new dqty("conversation_matcher_cache.matcher_version", 1, Long.valueOf(j)));
    }
}
