package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cbrg extends dqpg {
    public ConversationIdType a;
    public awjl b;
    public String c;
    public int d;
    public cbqz e;
    public cbqx f;
    public Optional g;
    public Optional h;
    public Optional i;
    public long j;

    public cbrg() {
        super(cbtb.e());
        this.a = barn.a;
        this.b = null;
        this.d = 0;
        this.e = cbqz.a;
        this.f = null;
        this.g = basb.b(0L);
        this.h = basb.b(0L);
        this.i = basb.b(0L);
        this.j = 0L;
    }

    public final cbre a() {
        cbrf cbrfVar = new cbrf();
        cbrfVar.aD(aB());
        cbrfVar.a = this.a;
        cbrfVar.b = this.b;
        cbrfVar.c = this.c;
        cbrfVar.d = this.d;
        cbrfVar.e = this.e;
        cbrfVar.f = this.f;
        cbrfVar.g = this.g;
        cbrfVar.h = this.h;
        cbrfVar.i = this.i;
        cbrfVar.j = this.j;
        cbrfVar.cM = aC();
        return cbrfVar;
    }

    public final void b(ConversationIdType conversationIdType) {
        aE(0);
        this.a = conversationIdType;
    }

    public final void c(int i) {
        int i2 = this.aB;
        if (i2 < 60890) {
            dqru.x("conv_type", i2);
        }
        aE(3);
        this.d = i;
    }

    public final void d(awjl awjlVar) {
        int i = this.aB;
        if (i < 61010) {
            dqru.x("destination_token", i);
        }
        aE(1);
        this.b = awjlVar;
    }

    public final void e(cbqx cbqxVar) {
        aE(5);
        this.f = cbqxVar;
    }

    public final void f(cbqz cbqzVar) {
        aE(4);
        this.e = cbqzVar;
    }

    public final void g(String str) {
        aE(2);
        this.c = str;
    }
}
