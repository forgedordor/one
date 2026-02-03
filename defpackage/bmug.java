package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmug extends dqpg {
    public long a;
    public String b;
    public String c;
    public cpya d;

    public bmug() {
        super(bmvh.a().M());
    }

    public final bmue a() {
        bmuf bmufVar = new bmuf();
        bmufVar.aD(aB());
        bmufVar.a = this.a;
        bmufVar.b = this.b;
        bmufVar.c = this.c;
        bmufVar.d = this.d;
        bmufVar.cM = aC();
        return bmufVar;
    }

    public final void b(String str) {
        aE(2);
        this.c = str;
    }

    public final void c(cpya cpyaVar) {
        aE(3);
        this.d = cpyaVar;
    }

    public final void d(String str) {
        aE(1);
        this.b = str;
    }
}
