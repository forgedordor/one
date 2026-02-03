package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bprw extends dqpg {
    public long a;
    public ConversationIdType b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public cdpi g;
    public long h;
    public long i;

    public bprw() {
        super(bpto.g());
        this.b = barn.a;
        this.e = true;
        this.h = 0L;
        this.i = 0L;
    }

    public final bpru a() {
        bprv bprvVar = new bprv();
        bprvVar.aD(aB());
        bprvVar.a = this.a;
        bprvVar.b = this.b;
        bprvVar.c = this.c;
        bprvVar.d = this.d;
        bprvVar.e = this.e;
        bprvVar.f = this.f;
        bprvVar.g = this.g;
        bprvVar.h = this.h;
        bprvVar.i = this.i;
        bprvVar.cM = aC();
        return bprvVar;
    }

    public final void b(String str) {
        aE(2);
        this.c = str;
    }

    public final void c(ConversationIdType conversationIdType) {
        aE(1);
        this.b = conversationIdType;
    }

    public final void d(boolean z) {
        int i = this.aB;
        if (i < 58810) {
            dqru.x("is_last_message_outgoing", i);
        }
        aE(5);
        this.f = z;
    }

    public final void e(String str) {
        aE(3);
        this.d = str;
    }

    public final void f(boolean z) {
        int i = this.aB;
        if (i < 58700) {
            dqru.x("read", i);
        }
        aE(4);
        this.e = z;
    }

    public final void g(long j) {
        int i = this.aB;
        if (i < 59100) {
            dqru.x("sync_timestamp_ms", i);
        }
        aE(8);
        this.i = j;
    }
}
