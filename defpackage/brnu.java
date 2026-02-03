package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class brnu extends dqpg {
    public ConversationIdType a;
    public akbk b;

    public brnu() {
        super(bros.e());
        this.a = barn.a;
        this.b = akbk.a;
    }

    public final brns a() {
        brnt brntVar = new brnt();
        brntVar.aD(aB());
        brntVar.a = this.a;
        brntVar.b = this.b;
        brntVar.cM = aC();
        return brntVar;
    }

    public final void b(ConversationIdType conversationIdType) {
        aE(0);
        this.a = conversationIdType;
    }

    public final void c(akbk akbkVar) {
        int i = this.aB;
        if (i < 60790) {
            dqru.x("conversation_parent_supervision_state", i);
        }
        aE(1);
        this.b = akbkVar;
    }
}
