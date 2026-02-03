package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etju {
    public final etiu a;

    public etju(etiu etiuVar) {
        this.a = etiuVar;
    }

    public final /* synthetic */ etjo a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (etjo) evsnVarBuild;
    }

    public final void b(String str) {
        etiu etiuVar = this.a;
        etiuVar.copyOnWrite();
        etjo etjoVar = (etjo) etiuVar.instance;
        evsy evsyVar = etjo.a;
        etjoVar.d |= 64;
        etjoVar.j = str;
    }

    public final void c(etjd etjdVar) {
        etiu etiuVar = this.a;
        etiuVar.copyOnWrite();
        etjo etjoVar = (etjo) etiuVar.instance;
        evsy evsyVar = etjo.a;
        etjoVar.t = etjdVar;
        etjoVar.d |= 65536;
    }

    public final void d(etjg etjgVar) {
        etjgVar.getClass();
        etiu etiuVar = this.a;
        etiuVar.copyOnWrite();
        etjo etjoVar = (etjo) etiuVar.instance;
        evsy evsyVar = etjo.a;
        etjoVar.o = etjgVar.G;
        etjoVar.d |= 512;
    }

    public final void e(eveg evegVar) {
        etiu etiuVar = this.a;
        etiuVar.copyOnWrite();
        etjo etjoVar = (etjo) etiuVar.instance;
        evsy evsyVar = etjo.a;
        etjoVar.u = evegVar;
        etjoVar.d |= 131072;
    }

    public final void f(etjn etjnVar) {
        etjnVar.getClass();
        etiu etiuVar = this.a;
        etiuVar.copyOnWrite();
        etjo etjoVar = (etjo) etiuVar.instance;
        evsy evsyVar = etjo.a;
        etjoVar.q = etjnVar.f;
        etjoVar.d |= 2048;
    }
}
