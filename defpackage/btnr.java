package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btnr extends dqpg {
    public String a;
    public String b;

    public btnr() {
        super(bton.b());
    }

    public final btnp a() {
        btnq btnqVar = new btnq();
        btnqVar.aD(aB());
        btnqVar.a = this.a;
        btnqVar.b = this.b;
        btnqVar.cM = aC();
        return btnqVar;
    }

    public final void b(String str) {
        aE(0);
        this.a = str;
    }

    public final void c(String str) {
        aE(1);
        this.b = str;
    }
}
