package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmkx extends dqpg {
    public long a;
    public ConversationIdType b;
    public aslb c;
    public int d;
    public asqe e;
    public long f;

    public bmkx() {
        super(bmmf.e());
        this.b = barn.a;
        this.c = aslb.b(0);
        this.e = asqe.b(0);
    }

    public final bmkv a() {
        bmkw bmkwVar = new bmkw();
        bmkwVar.aD(aB());
        bmkwVar.a = this.a;
        bmkwVar.b = this.b;
        bmkwVar.c = this.c;
        bmkwVar.d = this.d;
        bmkwVar.e = this.e;
        bmkwVar.f = this.f;
        bmkwVar.cM = aC();
        return bmkwVar;
    }

    public final void b(aslb aslbVar) {
        aE(2);
        this.c = aslbVar;
    }

    public final void c(ConversationIdType conversationIdType) {
        aE(1);
        this.b = conversationIdType;
    }

    public final void d(asqe asqeVar) {
        int i = this.aB;
        if (i < 59050) {
            dqru.x("conversation_toolstone_state", i);
        }
        aE(4);
        this.e = asqeVar;
    }

    public final void e(long j) {
        int i = this.aB;
        if (i < 59050) {
            dqru.x("conversation_toolstone_timestamp_ms", i);
        }
        aE(5);
        this.f = j;
    }
}
