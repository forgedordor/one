package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bodm extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bodl(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        ap(new dqpj("conversation_pin.conversation_id", 1, Long.valueOf(barn.a(conversationIdType))));
    }

    public final void c(Iterable iterable) {
        ekfw ekfwVar = new ekfw();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ekfwVar.h(String.valueOf(barn.a((ConversationIdType) it.next())));
        }
        ap(new dqpm("conversation_pin.conversation_id", 3, as(ekfwVar.g()), true));
    }
}
