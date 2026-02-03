package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bnfm extends dqpg {
    public long a;
    public ConversationIdType b;
    public aukf c;
    public aukd d;
    public String e;
    public long f;
    public long g;

    public bnfm() {
        super(bngz.e());
        this.b = barn.a;
        this.c = aukf.CONVERSATION_CLASSIFICATION_TYPE_UNSPECIFIED;
        this.d = aukd.CONVERSATION_CLASSIFICATION_STATE_UNSPECIFIED;
        this.f = 0L;
        this.g = 0L;
    }

    public final bnfk a() {
        bnfl bnflVar = new bnfl();
        bnflVar.aD(aB());
        bnflVar.a = this.a;
        bnflVar.b = this.b;
        bnflVar.c = this.c;
        bnflVar.d = this.d;
        bnflVar.e = this.e;
        bnflVar.f = this.f;
        bnflVar.g = this.g;
        bnflVar.cM = aC();
        return bnflVar;
    }

    public final void b(aukd aukdVar) {
        int i = this.aB;
        if (i < 58690) {
            dqru.x("classification_state", i);
        }
        aE(3);
        this.d = aukdVar;
    }

    public final void c(aukf aukfVar) {
        aE(2);
        this.c = aukfVar;
    }

    public final void d(ConversationIdType conversationIdType) {
        aE(1);
        this.b = conversationIdType;
    }

    public final void e(String str) {
        aE(4);
        this.e = str;
    }

    public final void f(long j) {
        int i = this.aB;
        if (i < 58840) {
            dqru.x("generated_timestamp", i);
        }
        aE(6);
        this.g = j;
    }
}
