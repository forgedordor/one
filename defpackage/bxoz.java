package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBuglePartialMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxoz implements bxoy {
    public final bxoy a;

    public bxoz(bxph bxphVar) {
        this.a = bxphVar;
    }

    public final void a(MessagePartCoreData messagePartCoreData, bxqj... bxqjVarArr) {
        messagePartCoreData.getClass();
        Uri uriV = messagePartCoreData.v();
        uriV.getClass();
        ConversationIdType conversationIdTypeA = messagePartCoreData.A();
        CoreBuglePartialMessageId coreBuglePartialMessageId = new CoreBuglePartialMessageId(messagePartCoreData.B(), Long.parseLong(messagePartCoreData.W()));
        messagePartCoreData.R();
        ((bxph) this.a).b(conversationIdTypeA, coreBuglePartialMessageId, uriV, messagePartCoreData.p(), bxqjVarArr);
    }
}
