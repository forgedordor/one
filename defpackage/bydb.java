package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public interface bydb {
    eiju b(ConversationIdType conversationIdType, boolean z, int i);

    eiju c(ConversationIdType conversationIdType);

    void g(MessageCoreData messageCoreData);

    void i(MessageCoreData messageCoreData);

    void j(ConversationIdType conversationIdType, MessageCoreData messageCoreData);

    void k(List list);

    void l(MessageCoreData messageCoreData);

    boolean n(MessageCoreData messageCoreData, brdu brduVar, Optional optional);

    eiju o(ConversationIdType conversationIdType, alqm alqmVar, boolean z, int i);
}
