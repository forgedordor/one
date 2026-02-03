package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bsux extends dqpg {
    public String a;
    public String b;
    public avbl c;
    public String d;
    public String e;
    public String f;

    public bsux() {
        super(bswf.e());
    }

    public final bsuv a() {
        bsuw bsuwVar = new bsuw();
        bsuwVar.aD(aB());
        bsuwVar.a = this.a;
        bsuwVar.b = this.b;
        bsuwVar.c = this.c;
        bsuwVar.d = this.d;
        bsuwVar.e = this.e;
        bsuwVar.f = this.f;
        bsuwVar.cM = aC();
        return bsuwVar;
    }

    public final void b(String str) {
        aE(3);
        this.d = str;
    }

    public final void c(String str) {
        aE(5);
        this.f = str;
    }

    public final void d(String str) {
        int i = this.aB;
        if (i < 51020) {
            dqru.x("rbm_bot_id", i);
        }
        aE(1);
        this.b = str;
    }

    public final void e(String str) {
        aE(4);
        this.e = str;
    }

    public final void f(avbl avblVar) {
        aE(2);
        this.c = avblVar;
    }
}
