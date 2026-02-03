package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class awjs extends dqpg {
    public awjl a;
    public String b;
    public awja c;

    public awjs() {
        super(awko.a().M());
        this.a = null;
    }

    public final awjq a() {
        awjr awjrVar = new awjr();
        awjrVar.aD(aB());
        awjrVar.a = this.a;
        awjrVar.b = this.b;
        awjrVar.c = this.c;
        awjrVar.cM = aC();
        return awjrVar;
    }

    public final void b(String str) {
        aE(1);
        this.b = str;
    }

    public final void c(awja awjaVar) {
        aE(2);
        this.c = awjaVar;
    }

    public final void d(awjl awjlVar) {
        aE(0);
        this.a = awjlVar;
    }
}
