package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ayqn implements ayms {
    public abstract Action a(MessageIdType messageIdType, ConversationIdType conversationIdType, int i, elny elnyVar);

    public final Action b() {
        return a(bary.a, barn.a, -1, elny.UNKNOWN_BUGLE_MESSAGE_SOURCE);
    }

    public final Action d(MessageIdType messageIdType, elny elnyVar) {
        return a(messageIdType, barn.a, 1, elnyVar);
    }

    public final Action e(elny elnyVar) {
        return a(bary.a, barn.a, 4, elnyVar);
    }
}
