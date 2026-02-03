package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bnat extends dqpg {
    public int a;
    public byte[] b;
    public int c;
    public String d;
    public String e;

    public bnat() {
        super(bncb.e());
        this.a = 0;
        this.c = 0;
    }

    public final bnar a() {
        bnas bnasVar = new bnas();
        bnasVar.aD(aB());
        bnasVar.a = this.a;
        bnasVar.b = this.b;
        bnasVar.c = this.c;
        bnasVar.d = this.d;
        bnasVar.e = this.e;
        bnasVar.cM = aC();
        return bnasVar;
    }

    public final void b(String str) {
        int i = this.aB;
        if (i < 42060) {
            dqru.x("cms_correlation_id", i);
        }
        aE(3);
        this.d = str;
    }

    public final void c(String str) {
        int i = this.aB;
        if (i < 35020) {
            dqru.x("cms_id", i);
        }
        aE(4);
        this.e = str;
    }

    public final void d(byte[] bArr) {
        aE(1);
        this.b = bArr;
    }

    public final void e(int i) {
        aE(0);
        this.a = i;
    }

    public final void f(int i) {
        aE(2);
        this.c = i;
    }
}
