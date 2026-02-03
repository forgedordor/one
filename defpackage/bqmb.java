package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqmb extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bqma(this);
    }

    public final void b(MessageIdType messageIdType) {
        ap(new dqpj("message_replies.replied_to_message_id", 1, Long.valueOf(bary.a(messageIdType))));
    }
}
