package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class avqa extends dqpg {
    public long a;
    public long b;
    public String c;
    public ConversationIdType d;

    public avqa() {
        super(avrd.a().M());
        this.d = barn.a;
    }

    public final avpy a() {
        avpz avpzVar = new avpz();
        avpzVar.aD(aB());
        avpzVar.a = this.a;
        avpzVar.b = this.b;
        avpzVar.c = this.c;
        avpzVar.d = this.d;
        avpzVar.cM = aC();
        return avpzVar;
    }

    public final void b(ConversationIdType conversationIdType) {
        aE(3);
        this.d = conversationIdType;
    }

    public final void c(String str) {
        aE(2);
        this.c = str;
    }

    public final void d(long j) {
        aE(1);
        this.b = j;
    }
}
