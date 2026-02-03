package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqkk extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bqkj(this);
    }

    public final void b(MessageIdType messageIdType) {
        ap(new dqpj("message_reactions.message_id", 1, Long.valueOf(bary.a(messageIdType))));
    }

    public final void c(Iterable iterable) {
        ekfw ekfwVar = new ekfw();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ekfwVar.h(String.valueOf(bary.a((MessageIdType) it.next())));
        }
        ap(new dqpm("message_reactions.message_id", 3, as(ekfwVar.g()), true));
    }

    public final void d(Iterable iterable) {
        int iIntValue = bqkl.c().intValue();
        if (iIntValue < 46020) {
            dqru.x("reacted_message_id", iIntValue);
        }
        ekfw ekfwVar = new ekfw();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ekfwVar.h(String.valueOf(bary.a((MessageIdType) it.next())));
        }
        ap(new dqpm("message_reactions.reacted_message_id", 3, as(ekfwVar.g()), true));
    }
}
