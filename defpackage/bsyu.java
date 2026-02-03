package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bsyu extends dqpg {
    public String a;
    public String b;
    public String c;
    public String d;

    public bsyu() {
        super(bszx.a().M());
    }

    public final bsys a() {
        bsyt bsytVar = new bsyt();
        bsytVar.aD(aB());
        bsytVar.a = this.a;
        bsytVar.b = this.b;
        bsytVar.c = this.c;
        bsytVar.d = this.d;
        bsytVar.cM = aC();
        return bsytVar;
    }

    public final void b(String str) {
        aE(0);
        this.a = str;
    }

    public final void c(String str) {
        aE(3);
        this.d = str;
    }

    public final void d(String str) {
        aE(2);
        this.c = str;
    }

    public final void e(String str) {
        aE(1);
        this.b = str;
    }
}
