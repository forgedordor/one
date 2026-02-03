package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bpyp extends dqpg {
    public String a;
    public ConversationIdType b;
    public MessageIdType c;
    public int d;
    public ezds e;

    public bpyp() {
        super(bpzx.g());
        this.b = barn.a;
        this.c = bary.a;
        this.d = 0;
    }

    public final bpyn a() {
        bpyo bpyoVar = new bpyo();
        bpyoVar.aD(aB());
        bpyoVar.a = this.a;
        bpyoVar.b = this.b;
        bpyoVar.c = this.c;
        bpyoVar.d = this.d;
        bpyoVar.e = this.e;
        bpyoVar.cM = aC();
        return bpyoVar;
    }

    public final void b(ezds ezdsVar) {
        aE(4);
        this.e = ezdsVar;
    }

    public final void c(int i) {
        aE(3);
        this.d = i;
    }

    public final void d(ConversationIdType conversationIdType) {
        aE(1);
        this.b = conversationIdType;
    }

    public final void e(MessageIdType messageIdType) {
        int i = this.aB;
        if (i < 20040) {
            dqru.x("message_id", i);
        }
        aE(2);
        this.c = messageIdType;
    }
}
