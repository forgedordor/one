package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chpl {
    public static final /* synthetic */ chpk a(chpj chpjVar) {
        evsn evsnVarBuild = chpjVar.build();
        evsnVarBuild.getClass();
        return (chpk) evsnVarBuild;
    }

    public static final void b(boolean z, chpj chpjVar) {
        chpjVar.copyOnWrite();
        chpk chpkVar = (chpk) chpjVar.instance;
        chpk chpkVar2 = chpk.a;
        chpkVar.b |= 64;
        chpkVar.g = z;
    }

    public static final void c(boolean z, chpj chpjVar) {
        chpjVar.copyOnWrite();
        chpk chpkVar = (chpk) chpjVar.instance;
        chpk chpkVar2 = chpk.a;
        chpkVar.b |= 512;
        chpkVar.i = z;
    }

    public static final void d(evvp evvpVar, chpj chpjVar) {
        evvpVar.getClass();
        chpjVar.copyOnWrite();
        chpk chpkVar = (chpk) chpjVar.instance;
        chpk chpkVar2 = chpk.a;
        chpkVar.j = evvpVar;
        chpkVar.b |= 1024;
    }

    public static final void e(chpe chpeVar, chpj chpjVar) {
        chpjVar.copyOnWrite();
        chpk chpkVar = (chpk) chpjVar.instance;
        chpk chpkVar2 = chpk.a;
        chpkVar.c = chpeVar;
        chpkVar.b |= 1;
    }

    public static final void f(chph chphVar, chpj chpjVar) {
        chpjVar.copyOnWrite();
        chpk chpkVar = (chpk) chpjVar.instance;
        chpk chpkVar2 = chpk.a;
        chpkVar.d = chphVar;
        chpkVar.b |= 2;
    }
}
