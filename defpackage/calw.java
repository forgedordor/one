package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class calw {
    public static final /* synthetic */ cang a(canf canfVar) {
        evsn evsnVarBuild = canfVar.build();
        evsnVarBuild.getClass();
        return (cang) evsnVarBuild;
    }

    public static final /* synthetic */ evwn b(canf canfVar) {
        return new evwn(new evsz(((cang) canfVar.instance).k, cang.a));
    }

    public static final void c(int i, canf canfVar) {
        canfVar.copyOnWrite();
        cang cangVar = (cang) canfVar.instance;
        evsy evsyVar = cang.a;
        cangVar.c |= 1;
        cangVar.d = i;
    }

    public static final void d(int i, canf canfVar) {
        canfVar.copyOnWrite();
        cang cangVar = (cang) canfVar.instance;
        evsy evsyVar = cang.a;
        cangVar.c |= 16;
        cangVar.h = i;
    }

    public static final void e(boolean z, canf canfVar) {
        canfVar.copyOnWrite();
        cang cangVar = (cang) canfVar.instance;
        evsy evsyVar = cang.a;
        cangVar.c |= 8;
        cangVar.g = z;
    }

    public static final void f(String str, canf canfVar) {
        canfVar.copyOnWrite();
        cang cangVar = (cang) canfVar.instance;
        evsy evsyVar = cang.a;
        cangVar.c |= 4;
        cangVar.f = str;
    }

    public static final void g(evvp evvpVar, canf canfVar) {
        canfVar.copyOnWrite();
        cang cangVar = (cang) canfVar.instance;
        evsy evsyVar = cang.a;
        cangVar.j = evvpVar;
        cangVar.c |= 64;
    }

    public static final void h(evvp evvpVar, canf canfVar) {
        canfVar.copyOnWrite();
        cang cangVar = (cang) canfVar.instance;
        evsy evsyVar = cang.a;
        cangVar.i = evvpVar;
        cangVar.c |= 32;
    }

    public static final void i(cank cankVar, canf canfVar) {
        cankVar.getClass();
        canfVar.copyOnWrite();
        cang cangVar = (cang) canfVar.instance;
        evsy evsyVar = cang.a;
        cangVar.e = cankVar.g;
        cangVar.c |= 2;
    }

    public static final void j(boolean z, canf canfVar) {
        canfVar.copyOnWrite();
        cang cangVar = (cang) canfVar.instance;
        evsy evsyVar = cang.a;
        cangVar.c |= 128;
        cangVar.l = z;
    }

    public static final /* synthetic */ void k(cank cankVar, canf canfVar) {
        cankVar.getClass();
        canfVar.a(cankVar);
    }
}
