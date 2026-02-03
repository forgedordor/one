package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bthd extends dqpg {
    public String a;
    public MessageIdType b;
    public ConversationIdType c;
    public long d;
    public bvdw e;

    public bthd() {
        super(btin.g());
        this.b = bary.a;
        this.c = barn.a;
        this.d = 0L;
        this.e = bvdw.SET;
    }

    public final bthb a() {
        bthc bthcVar = new bthc();
        bthcVar.aD(aB());
        bthcVar.a = this.a;
        bthcVar.b = this.b;
        bthcVar.c = this.c;
        bthcVar.d = this.d;
        bthcVar.e = this.e;
        bthcVar.cM = aC();
        return bthcVar;
    }

    public final void b(ConversationIdType conversationIdType) {
        int i = this.aB;
        if (i < 35070) {
            dqru.x("conversation_id", i);
        }
        aE(2);
        this.c = conversationIdType;
    }

    public final void c(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void d(long j) {
        aE(3);
        this.d = j;
    }
}
