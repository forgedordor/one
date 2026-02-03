package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public interface bvus {
    MessageCoreData a(ConversationIdType conversationIdType, MessageIdType messageIdType);

    eiju b(String str);

    ekgb c(int i);

    ekgb d(ConversationIdType conversationIdType, ekgb ekgbVar);

    Optional e(MessageIdType messageIdType);

    void f(ekgb ekgbVar, ConversationIdType conversationIdType);

    void g(SelfIdentityId selfIdentityId);

    void h(aubq aubqVar, ConversationIdType conversationIdType, int i, bwvi bwviVar);

    @Deprecated
    void i(ConversationIdType conversationIdType, int i, bwvi bwviVar);

    boolean j(ConversationIdType conversationIdType);

    boolean k(MessageIdType messageIdType);
}
