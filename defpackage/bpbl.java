package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bpbl extends dqpg {
    public ConversationIdType a;
    public String b;
    public wry c;
    public String d;
    public boolean e;
    public String f;
    public boolean g;

    public bpbl() {
        super(bpcy.e());
        this.a = barn.a;
        this.e = false;
        this.g = false;
    }

    public final bpbj a() {
        bpbk bpbkVar = new bpbk();
        bpbkVar.aD(aB());
        bpbkVar.a = this.a;
        bpbkVar.b = this.b;
        bpbkVar.c = this.c;
        bpbkVar.d = this.d;
        bpbkVar.e = this.e;
        bpbkVar.f = this.f;
        bpbkVar.g = this.g;
        bpbkVar.cM = aC();
        return bpbkVar;
    }

    public final void b(wry wryVar) {
        int i = this.aB;
        if (i < 59420) {
            dqru.x("attachments", i);
        }
        aE(2);
        this.c = wryVar;
    }

    public final void c(ConversationIdType conversationIdType) {
        aE(0);
        this.a = conversationIdType;
    }

    public final void d(boolean z) {
        int i = this.aB;
        if (i < 59720) {
            dqru.x("is_encrypted", i);
        }
        aE(6);
        this.g = z;
    }

    public final void e(boolean z) {
        int i = this.aB;
        if (i < 59170) {
            dqru.x("is_urgent", i);
        }
        aE(4);
        this.e = z;
    }

    public final void f(String str) {
        int i = this.aB;
        if (i < 59540) {
            dqru.x("replied_to_message_id", i);
        }
        aE(5);
        this.f = str;
    }

    public final void g(String str) {
        int i = this.aB;
        if (i < 59170) {
            dqru.x("subject", i);
        }
        aE(3);
        this.d = str;
    }

    public final void h(String str) {
        aE(1);
        this.b = str;
    }
}
