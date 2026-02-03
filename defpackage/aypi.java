package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class aypi {
    public static void a(aypj aypjVar, ConversationIdType conversationIdType, boolean z) {
        b(aypjVar, conversationIdType, bary.a, z);
    }

    public static void b(aypj aypjVar, ConversationIdType conversationIdType, MessageIdType messageIdType, boolean z) {
        c(aypjVar, conversationIdType, messageIdType, z, false).z();
    }

    public static Action c(aypj aypjVar, ConversationIdType conversationIdType, MessageIdType messageIdType, boolean z, boolean z2) {
        return ((axsc) aypjVar).h(new ConversationIdType[]{conversationIdType}, messageIdType, z, z2, -1, true);
    }
}
