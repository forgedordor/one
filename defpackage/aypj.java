package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface aypj extends ayms<Void> {
    eiju a(ConversationIdType conversationIdType);

    eiju b(ConversationIdType conversationIdType, MessageIdType messageIdType);

    eiju d(ConversationIdType conversationIdType, MessageIdType messageIdType);

    void e(ConversationIdType conversationIdType);

    Action f(ConversationIdType conversationIdType, MessageIdType messageIdType, boolean z);

    Action g(ConversationIdType[] conversationIdTypeArr, MessageIdType messageIdType);

    void i(ConversationIdType conversationIdType, MessageIdType messageIdType);

    void j(ConversationIdType conversationIdType);

    Action k();
}
