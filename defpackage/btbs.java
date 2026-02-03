package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btbs extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new btbr(this);
    }

    public final void b(MessageIdType messageIdType) {
        ap(new dqpj("read_reports.message_id", 1, Long.valueOf(bary.a(messageIdType))));
    }

    public final void c(long j) {
        ap(new dqty("read_reports.participant_id", 1, Long.valueOf(j)));
    }
}
