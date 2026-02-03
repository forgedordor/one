package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bppf extends dqpg {
    public String a;
    public int b;
    public int c;
    public String d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public long i;
    public String j;
    public long k;

    public bppf() {
        super(bprf.e());
        this.b = 3;
        this.e = -1;
        this.f = false;
        this.g = 0;
        this.h = 0;
        this.i = 0L;
        this.k = 0L;
    }

    public final bppd a() {
        bppe bppeVar = new bppe();
        bppeVar.aD(aB());
        bppeVar.a = this.a;
        bppeVar.b = this.b;
        bppeVar.c = this.c;
        bppeVar.d = this.d;
        bppeVar.e = this.e;
        bppeVar.f = this.f;
        bppeVar.g = this.g;
        bppeVar.h = this.h;
        bppeVar.i = this.i;
        bppeVar.j = this.j;
        bppeVar.k = this.k;
        bppeVar.cM = aC();
        return bppeVar;
    }

    public final void b(String str) {
        aE(3);
        this.d = str;
    }

    public final void c(int i) {
        aE(2);
        this.c = i;
    }

    public final void d(int i) {
        aE(1);
        this.b = i;
    }
}
