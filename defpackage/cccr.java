package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cccr {
    public static final /* synthetic */ ccco a(cccn cccnVar) {
        evsn evsnVarBuild = cccnVar.build();
        evsnVarBuild.getClass();
        return (ccco) evsnVarBuild;
    }

    public static final void b(evqs evqsVar, cccn cccnVar) {
        cccnVar.copyOnWrite();
        ccco cccoVar = (ccco) cccnVar.instance;
        ccco cccoVar2 = ccco.a;
        cccoVar.c = evqsVar;
    }

    public static final void c(evvp evvpVar, cccn cccnVar) {
        cccnVar.copyOnWrite();
        ccco cccoVar = (ccco) cccnVar.instance;
        ccco cccoVar2 = ccco.a;
        cccoVar.e = evvpVar;
        cccoVar.b |= 2;
    }

    public static final void d(evvp evvpVar, cccn cccnVar) {
        cccnVar.copyOnWrite();
        ccco cccoVar = (ccco) cccnVar.instance;
        ccco cccoVar2 = ccco.a;
        cccoVar.d = evvpVar;
        cccoVar.b |= 1;
    }
}
