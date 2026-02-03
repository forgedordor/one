package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class brjg extends dqpg {
    public String a;
    public MessageIdType b;
    public long c;
    public elqn d;
    public emig e;
    public ezac f;
    public eyzv g;
    public int h;
    public int i;
    public String j;
    public String k;
    public String l;

    public brjg() {
        super(brlh.g());
        this.b = bary.a;
        this.c = 0L;
        this.d = elqn.b(0);
        this.e = emig.b(0);
        this.f = ezac.b(0);
        this.g = eyzv.b(0);
    }

    public final brje a() {
        brjf brjfVar = new brjf();
        brjfVar.aD(aB());
        brjfVar.a = this.a;
        brjfVar.b = this.b;
        brjfVar.c = this.c;
        brjfVar.d = this.d;
        brjfVar.e = this.e;
        brjfVar.f = this.f;
        brjfVar.g = this.g;
        brjfVar.h = this.h;
        brjfVar.i = this.i;
        brjfVar.j = this.j;
        brjfVar.k = this.k;
        brjfVar.l = this.l;
        brjfVar.cM = aC();
        return brjfVar;
    }

    public final void b(eyzv eyzvVar) {
        aE(6);
        this.g = eyzvVar;
    }

    public final void c(int i) {
        aE(8);
        this.i = i;
    }

    public final void d(elqn elqnVar) {
        aE(3);
        this.d = elqnVar;
    }

    public final void e(String str) {
        aE(9);
        this.j = str;
    }

    public final void f(MessageIdType messageIdType) {
        int i = this.aB;
        if (i < 51030) {
            dqru.x("message_id", i);
        }
        aE(1);
        this.b = messageIdType;
    }

    public final void g(String str) {
        int i = this.aB;
        if (i < 42030) {
            dqru.x("model_output_label", i);
        }
        aE(11);
        this.l = str;
    }

    public final void h(int i) {
        aE(7);
        this.h = i;
    }

    public final void i(ezac ezacVar) {
        aE(5);
        this.f = ezacVar;
    }

    public final void j(emig emigVar) {
        aE(4);
        this.e = emigVar;
    }

    public final void k(String str) {
        aE(10);
        this.k = str;
    }

    public final void l(long j) {
        aE(2);
        this.c = j;
    }
}
