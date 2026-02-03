package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bjjt extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bjjq(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        ap(new dqpj("messages.conversation_id", 1, Long.valueOf(barn.a(conversationIdType))));
    }

    public final void c() {
        ap(new dqty("messages.message_status", 8, Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED)));
    }
}
