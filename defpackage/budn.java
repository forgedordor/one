package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class budn extends dqpg {
    public String a;
    public String b;
    public String c;

    public budn() {
        super(buei.a().M());
    }

    public final budl a() {
        budm budmVar = new budm();
        budmVar.aD(aB());
        budmVar.a = this.a;
        budmVar.b = this.b;
        budmVar.c = this.c;
        budmVar.cM = aC();
        return budmVar;
    }

    public final void b(String str) {
        aE(1);
        this.b = str;
    }

    public final void c(String str) {
        aE(2);
        this.c = str;
    }

    public final void d(String str) {
        aE(0);
        this.a = str;
    }
}
