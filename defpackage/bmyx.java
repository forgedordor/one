package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmyx extends dqpg {
    public long a;
    public long b;
    public String c;
    public String d;
    public long e;
    public avbk f;
    public String g;
    public long h;

    public bmyx() {
        super(bnak.a().M());
        this.e = 0L;
    }

    public final bmyv a() {
        bmyw bmywVar = new bmyw();
        bmywVar.aD(aB());
        bmywVar.a = this.a;
        bmywVar.b = this.b;
        bmywVar.c = this.c;
        bmywVar.d = this.d;
        bmywVar.e = this.e;
        bmywVar.f = this.f;
        bmywVar.g = this.g;
        bmywVar.h = this.h;
        bmywVar.cM = aC();
        return bmywVar;
    }

    public final void b(long j) {
        aE(7);
        this.h = j;
    }

    public final void c(String str) {
        aE(3);
        this.d = str;
    }

    public final void d(avbk avbkVar) {
        aE(5);
        this.f = avbkVar;
    }

    public final void e(String str) {
        aE(2);
        this.c = str;
    }

    public final void f(String str) {
        aE(6);
        this.g = str;
    }

    public final void g(long j) {
        aE(1);
        this.b = j;
    }

    public final void h(long j) {
        aE(4);
        this.e = j;
    }
}
