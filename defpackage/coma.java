package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coma extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new colz(this);
    }

    public final void b(MessageIdType messageIdType) {
        ap(new dqpj("file_transfer.message_id", 1, Long.valueOf(bary.a(messageIdType))));
    }

    public final void c(String str) {
        ap(new dqpj("file_transfer.transfer_id", 1, String.valueOf(str)));
    }

    public final void d(comc comcVar) {
        ap(new dqty("file_transfer.transfer_type", 1, Integer.valueOf(comcVar == null ? 0 : comcVar.ordinal())));
    }
}
