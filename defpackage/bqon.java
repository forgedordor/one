package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqon extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bqom(this);
    }

    public final void b(MessageIdType messageIdType) {
        ap(new dqpj("message_send_receive_attempt.message_id", 1, Long.valueOf(bary.a(messageIdType))));
    }
}
