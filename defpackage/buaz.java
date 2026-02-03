package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class buaz extends dqpg {
    public long a;
    public String b;
    public String c;
    public byte[] d;
    public long e;

    public buaz() {
        super(bucf.b());
        this.e = 0L;
    }

    public final buax a() {
        buay buayVar = new buay();
        buayVar.aD(aB());
        buayVar.a = this.a;
        buayVar.b = this.b;
        buayVar.c = this.c;
        buayVar.d = this.d;
        buayVar.e = this.e;
        buayVar.cM = aC();
        return buayVar;
    }

    public final void b(byte[] bArr) {
        aE(3);
        this.d = bArr;
    }

    public final void c(String str) {
        aE(1);
        this.b = str;
    }

    public final void d(String str) {
        aE(2);
        this.c = str;
    }
}
