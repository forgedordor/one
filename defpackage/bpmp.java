package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpmp extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bpmo(this);
    }

    public final void b(MessageIdType messageIdType) {
        ap(new dqpj("flagged_messages.flagged_message_id", 1, Long.valueOf(bary.a(messageIdType))));
    }

    public final void c(Iterable iterable) {
        ekfw ekfwVar = new ekfw();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ekfwVar.h(String.valueOf(bary.a((MessageIdType) it.next())));
        }
        ap(new dqpm("flagged_messages.flagged_message_id", 3, as(ekfwVar.g()), true));
    }

    public final void d(bvdo bvdoVar) {
        ap(new dqty("flagged_messages.flagging_reason", 1, Integer.valueOf(bvdoVar == null ? 0 : bvdoVar.ordinal())));
    }
}
