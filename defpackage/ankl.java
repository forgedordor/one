package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ankl implements ejvr {
    final /* synthetic */ ConversationId a;
    final /* synthetic */ MessageIdType b;
    final /* synthetic */ String c;
    final /* synthetic */ ankn d;
    final /* synthetic */ int e;

    public ankl(ankn anknVar, ConversationId conversationId, MessageIdType messageIdType, String str, int i) {
        this.a = conversationId;
        this.b = messageIdType;
        this.c = str;
        this.e = i;
        this.d = anknVar;
    }

    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        ConversationId conversationId = this.a;
        MessageIdType messageIdType = this.b;
        String str = this.c;
        this.d.a.b(this.e, ankn.f(conversationId, messageIdType, str, 3));
        return null;
    }
}
