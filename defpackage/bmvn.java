package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmvn extends dqpg {
    public String a;
    public long b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;

    public bmvn() {
        super(bmxa.e());
        this.g = 0L;
        this.h = 0L;
    }

    public final bmvl a() {
        bmvm bmvmVar = new bmvm();
        bmvmVar.aD(aB());
        bmvmVar.a = this.a;
        bmvmVar.b = this.b;
        bmvmVar.c = this.c;
        bmvmVar.d = this.d;
        bmvmVar.e = this.e;
        bmvmVar.f = this.f;
        bmvmVar.g = this.g;
        bmvmVar.h = this.h;
        bmvmVar.cM = aC();
        return bmvmVar;
    }

    public final void b(String str) {
        aE(2);
        this.c = str;
    }

    public final void c(String str) {
        aE(0);
        this.a = str;
    }

    public final void d(long j) {
        aE(1);
        this.b = j;
    }

    public final void e(String str) {
        aE(5);
        this.f = str;
    }

    public final void f(String str) {
        aE(3);
        this.d = str;
    }

    public final void g(long j) {
        int i = this.aB;
        if (i < 46040) {
            dqru.x("message_received_timestamp", i);
        }
        aE(7);
        this.h = j;
    }

    public final void h(long j) {
        aE(6);
        this.g = j;
    }

    public final void i(String str) {
        aE(4);
        this.e = str;
    }
}
