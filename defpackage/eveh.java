package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eveh {
    public static final /* synthetic */ eveg a(evef evefVar) {
        evsn evsnVarBuild = evefVar.build();
        evsnVarBuild.getClass();
        return (eveg) evsnVarBuild;
    }

    public static final void b(evcx evcxVar, evef evefVar) {
        evcxVar.getClass();
        evefVar.copyOnWrite();
        eveg evegVar = (eveg) evefVar.instance;
        eveg evegVar2 = eveg.a;
        evegVar.d = evcxVar;
        evegVar.b |= 2;
    }

    public static final void c(String str, evef evefVar) {
        evefVar.copyOnWrite();
        eveg evegVar = (eveg) evefVar.instance;
        eveg evegVar2 = eveg.a;
        evegVar.b |= 8;
        evegVar.e = str;
    }

    public static final void d(evef evefVar) {
        evefVar.copyOnWrite();
        eveg evegVar = (eveg) evefVar.instance;
        eveg evegVar2 = eveg.a;
        evegVar.c = 3;
        evegVar.b |= 1;
    }
}
