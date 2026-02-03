package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bofq extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bofp(this);
    }

    public final void b(MessageIdType messageIdType) {
        ap(new dqpj("conversation_suggestions.message_id", 1, Long.valueOf(bary.a(messageIdType))));
    }

    public final void c(dqxe dqxeVar) {
        ap(new dqpk("conversation_suggestions.message_id", 1, dqxeVar));
    }
}
