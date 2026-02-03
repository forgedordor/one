package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epsc {
    public static final /* synthetic */ epsb a(epsa epsaVar) {
        evsn evsnVarBuild = epsaVar.build();
        evsnVarBuild.getClass();
        return (epsb) evsnVarBuild;
    }

    public static final void b(evqs evqsVar, epsa epsaVar) {
        epsaVar.copyOnWrite();
        epsb epsbVar = (epsb) epsaVar.instance;
        epsb epsbVar2 = epsb.a;
        epsbVar.b |= 4;
        epsbVar.e = evqsVar;
    }

    public static final void c(epsa epsaVar) {
        epsaVar.copyOnWrite();
        epsb epsbVar = (epsb) epsaVar.instance;
        epsb epsbVar2 = epsb.a;
        epsbVar.d = 1;
        epsbVar.b |= 2;
    }

    public static final void d(epsa epsaVar) {
        epsaVar.copyOnWrite();
        epsb epsbVar = (epsb) epsaVar.instance;
        epsb epsbVar2 = epsb.a;
        epsbVar.c = 1;
        epsbVar.b = 1 | epsbVar.b;
    }
}
