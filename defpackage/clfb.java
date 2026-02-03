package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public interface clfb {
    kvf a(ConversationIdType conversationIdType, MessageIdType messageIdType);

    eiju b(String[] strArr);

    eiju c();

    eiju d();

    eiju e(String str);

    eiju f();

    eiju g(MessageIdType messageIdType, ConversationIdType conversationIdType);

    ListenableFuture h(ConversationId conversationId, String str);

    void i();

    void j(acxn acxnVar);

    PendingIntent k(String[] strArr);

    PendingIntent l(String str);

    PendingIntent m(ConversationIdType conversationIdType, String str);

    PendingIntent n(Context context, ConversationIdType conversationIdType, String str);

    void o(acxn acxnVar);

    eiju p(MessageIdType messageIdType, ConversationIdType conversationIdType, long j, int i);

    ListenableFuture q(MessageIdType messageIdType, ConversationIdType conversationIdType, long j, int i);

    void r(int i);

    void s(int i);

    eiju t(String str, ConversationIdType conversationIdType);

    eiju u(MessageIdType messageIdType, ConversationIdType conversationIdType);

    eiju v(ConversationIdType conversationIdType, String str);
}
