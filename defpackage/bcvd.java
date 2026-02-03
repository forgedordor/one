package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcvd extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bcuz(this);
    }

    public final void b(Function... functionArr) {
        bcvd[] bcvdVarArr = new bcvd[2];
        for (int i = 0; i < 2; i++) {
            Function function = functionArr[i];
            String[] strArr = bcve.a;
            bcvdVarArr[i] = (bcvd) function.apply(new bcvd());
        }
        aq(bcvdVarArr);
    }

    public final void c() {
        ap(new dqpn("parent_disallowed_conversations.conversation_id", 5));
    }

    public final void d(ConversationIdType conversationIdType) {
        ap(new dqpj("conversations._id", 1, Long.valueOf(barn.a(conversationIdType))));
    }

    public final void e(dqxe dqxeVar) {
        ap(new dqpk("conversations._id", 3, dqxeVar));
    }
}
