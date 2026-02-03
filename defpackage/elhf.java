package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elhf {
    public static final /* synthetic */ elpg a(elof elofVar) {
        evsn evsnVarBuild = elofVar.build();
        evsnVarBuild.getClass();
        return (elpg) evsnVarBuild;
    }

    public static final void b(long j, elof elofVar) {
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        evsy evsyVar = elpg.a;
        elpgVar.c |= 1073741824;
        elpgVar.G = j;
    }

    public static final void c(boolean z, elof elofVar) {
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        evsy evsyVar = elpg.a;
        elpgVar.d |= 1073741824;
        elpgVar.ag = z;
    }

    public static final void d(long j, elof elofVar) {
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        evsy evsyVar = elpg.a;
        elpgVar.c |= 128;
        elpgVar.o = j;
    }

    public static final void e(enxu enxuVar, elof elofVar) {
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        evsy evsyVar = elpg.a;
        elpgVar.M = enxuVar;
        elpgVar.d |= 1024;
    }

    public static final void f(String str, elof elofVar) {
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        evsy evsyVar = elpg.a;
        elpgVar.c |= Integer.MIN_VALUE;
        elpgVar.H = str;
    }

    public static final void g(enyw enywVar, elof elofVar) {
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        evsy evsyVar = elpg.a;
        elpgVar.Y = enywVar.h;
        elpgVar.d |= 2097152;
    }

    public static final void h(int i, elof elofVar) {
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        evsy evsyVar = elpg.a;
        elpgVar.i = i - 1;
        elpgVar.c |= 2;
    }

    public static final void i(int i, elof elofVar) {
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        evsy evsyVar = elpg.a;
        elpgVar.h = i - 1;
        elpgVar.c |= 1;
    }
}
