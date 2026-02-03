package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bngy extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bngx(this);
    }

    public final void b(aukd aukdVar) {
        int iIntValue = bngz.c().intValue();
        if (iIntValue < 58690) {
            dqru.x("classification_state", iIntValue);
        }
        ap(new dqty("conversation_classifications_table.classification_state", 2, Integer.valueOf(aukdVar == null ? 0 : aukdVar.a())));
    }

    public final void c(aukf aukfVar) {
        ap(new dqty("conversation_classifications_table.classification_type", 1, Integer.valueOf(aukfVar == null ? 0 : aukfVar.a())));
    }

    public final void d(ConversationIdType conversationIdType) {
        ap(new dqpj("conversation_classifications_table.conversation_id", 1, Long.valueOf(barn.a(conversationIdType))));
    }

    public final void e(String str) {
        ap(new dqpj("conversation_classifications_table.date", 1, String.valueOf(str)));
    }
}
