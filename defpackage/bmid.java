package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmid extends dqpg {
    public long a;
    public ConversationIdType b;
    public int c;

    public bmid() {
        super(bmjd.a().M());
        this.b = barn.a;
        this.c = 0;
    }

    public final bmib a() {
        bmic bmicVar = new bmic();
        bmicVar.aD(aB());
        bmicVar.a = this.a;
        bmicVar.b = this.b;
        bmicVar.c = this.c;
        bmicVar.cM = aC();
        return bmicVar;
    }

    public final void b(int i) {
        aE(2);
        this.c = i;
    }

    public final void c(ConversationIdType conversationIdType) {
        aE(1);
        this.b = conversationIdType;
    }
}
