package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public interface cbqj {
    ConversationIdType a(cbqx cbqxVar);

    ConversationIdType b(aubq aubqVar, String str);

    cbqx c(ConversationIdType conversationIdType);

    Instant d(ConversationIdType conversationIdType, ccpl ccplVar);

    List e(ccpl ccplVar);

    boolean f(ConversationIdType conversationIdType, awjl awjlVar, aubq aubqVar, cbqz cbqzVar, SelfIdentityId selfIdentityId, cbqx cbqxVar);

    boolean g(ConversationIdType conversationIdType, ccpl ccplVar);

    boolean h(ConversationIdType conversationIdType, aubq aubqVar, SelfIdentityId selfIdentityId, cbqz cbqzVar);

    void i(ConversationIdType conversationIdType, ccpl ccplVar);

    void j(ConversationIdType conversationIdType, ccpl ccplVar);
}
