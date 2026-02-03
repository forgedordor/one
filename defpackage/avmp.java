package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface avmp {
    void A(Context context, ConversationId conversationId, MessageIdType messageIdType, bajg bajgVar, Optional optional, int i);

    boolean B(Activity activity, int i, ConversationId conversationId, ComposeRowState composeRowState, Integer num, bajg bajgVar);

    void C(Context context, ConversationId conversationId, Integer num, batq batqVar);

    void D(Context context, ConversationId conversationId);

    void E(Context context, ConversationId conversationId, bajg bajgVar);

    void F(Context context, ConversationId conversationId, batq batqVar, Bundle bundle, Optional optional);

    int a(Intent intent, ConversationId conversationId);

    PendingIntent b(Context context, ConversationId conversationId, MessageIdType messageIdType, String str);

    PendingIntent c(Context context);

    PendingIntent d(Context context, emgo emgoVar);

    Intent e(Context context);

    Intent f(Context context);

    void g(Context context, ConversationId conversationId, MessageIdType messageIdType);

    void h(Context context, ConversationId conversationId, Optional optional);

    void i(Context context);

    void j(Context context);

    void k(Context context);

    void l(Context context, Bundle bundle);

    void m(Context context, ConversationId conversationId, batq batqVar, boolean z, Bundle bundle);

    Intent n(Context context, ConversationId conversationId, MessageIdType messageIdType, bajg bajgVar, String str);

    Intent o(Context context, ConversationId conversationId, bajg bajgVar, boolean z);

    Intent p(Context context, ConversationId conversationId);

    Intent q(Context context, ConversationId conversationId, MessageCoreData messageCoreData, boolean z, Bundle bundle);

    PendingIntent r(Context context, ConversationId conversationId);

    PendingIntent s(Context context, ConversationId conversationId, emgo emgoVar);

    void t(Context context, ConversationId conversationId, MessageId messageId, Uri uri);

    void u(Context context, ConversationId conversationId, MessageIdType messageIdType, String str);

    void v(Context context, ConversationId conversationId, MessageId messageId, Uri uri);

    void w(Context context, ConversationId conversationId, MessageIdType messageIdType, Integer num, batq batqVar, bajg bajgVar, Bundle bundle, String str);

    void x(Context context, ConversationId conversationId, Integer num, MessageCoreData messageCoreData, boolean z, Bundle bundle);

    void z(Context context, ConversationId conversationId, MessageIdType messageIdType, bajg bajgVar, String str);
}
