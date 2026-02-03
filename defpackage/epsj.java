package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epsj {
    public static final /* synthetic */ epsi a(epsh epshVar) {
        evsn evsnVarBuild = epshVar.build();
        evsnVarBuild.getClass();
        return (epsi) evsnVarBuild;
    }

    public static final void b(long j, epsh epshVar) {
        epshVar.copyOnWrite();
        epsi epsiVar = (epsi) epshVar.instance;
        epsi epsiVar2 = epsi.a;
        epsiVar.b |= 4;
        epsiVar.e = j;
    }

    public static final void c(evqs evqsVar, epsh epshVar) {
        epshVar.copyOnWrite();
        epsi epsiVar = (epsi) epshVar.instance;
        epsi epsiVar2 = epsi.a;
        epsiVar.b |= 2;
        epsiVar.d = evqsVar;
    }

    public static final void d(long j, epsh epshVar) {
        epshVar.copyOnWrite();
        epsi epsiVar = (epsi) epshVar.instance;
        epsi epsiVar2 = epsi.a;
        epsiVar.b |= 1;
        epsiVar.c = j;
    }
}
