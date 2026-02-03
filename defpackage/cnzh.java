package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnzh {
    public static final /* synthetic */ cnyt a(cnys cnysVar) {
        evsn evsnVarBuild = cnysVar.build();
        evsnVarBuild.getClass();
        return (cnyt) evsnVarBuild;
    }

    public static final evvp b(cnys cnysVar) {
        evvp evvpVar = ((cnyt) cnysVar.instance).d;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        evvpVar.getClass();
        return evvpVar;
    }

    public static final void c(evvp evvpVar, cnys cnysVar) {
        evvpVar.getClass();
        cnysVar.copyOnWrite();
        cnyt cnytVar = (cnyt) cnysVar.instance;
        cnyt cnytVar2 = cnyt.a;
        cnytVar.e = evvpVar;
        cnytVar.b |= 2;
    }

    public static final void d(evvp evvpVar, cnys cnysVar) {
        cnysVar.copyOnWrite();
        cnyt cnytVar = (cnyt) cnysVar.instance;
        cnyt cnytVar2 = cnyt.a;
        cnytVar.f = evvpVar;
        cnytVar.b |= 4;
    }
}
