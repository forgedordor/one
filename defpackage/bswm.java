package defpackage;

import com.google.android.ims.rcsservice.businessinfo.AgentUseCase;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bswm extends dqpg {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public long k;
    public AgentUseCase l;

    public bswm() {
        super(bsyn.h());
        this.l = AgentUseCase.AGENT_USE_CASE_UNSPECIFIED;
    }

    public final bswk a() {
        bswl bswlVar = new bswl();
        bswlVar.aD(aB());
        bswlVar.a = this.a;
        bswlVar.b = this.b;
        bswlVar.c = this.c;
        bswlVar.d = this.d;
        bswlVar.e = this.e;
        bswlVar.f = this.f;
        bswlVar.g = this.g;
        bswlVar.h = this.h;
        bswlVar.i = this.i;
        bswlVar.j = this.j;
        bswlVar.k = this.k;
        bswlVar.l = this.l;
        bswlVar.cM = aC();
        return bswlVar;
    }

    public final void b(AgentUseCase agentUseCase) {
        int i = this.aB;
        if (i < 59140) {
            dqru.x("agent_use_case_category", i);
        }
        aE(11);
        this.l = agentUseCase;
    }

    public final void c(String str) {
        aE(5);
        this.f = str;
    }

    public final void d(String str) {
        aE(4);
        this.e = str;
    }

    public final void e(String str) {
        aE(1);
        this.b = str;
    }

    public final void f(long j) {
        aE(10);
        this.k = j;
    }

    public final void g(String str) {
        aE(7);
        this.h = str;
    }

    public final void h(String str) {
        aE(6);
        this.g = str;
    }

    public final void i(String str) {
        aE(3);
        this.d = str;
    }

    public final void j(String str) {
        aE(2);
        this.c = str;
    }

    public final void k(String str) {
        aE(0);
        this.a = str;
    }

    public final void l(String str) {
        aE(8);
        this.i = str;
    }

    public final void m(String str) {
        aE(9);
        this.j = str;
    }
}
