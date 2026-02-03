package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epiu {
    public static final /* synthetic */ epir a(epiq epiqVar) {
        evsn evsnVarBuild = epiqVar.build();
        evsnVarBuild.getClass();
        return (epir) evsnVarBuild;
    }

    public static final void b(String str, epiq epiqVar) {
        epiqVar.copyOnWrite();
        epir epirVar = (epir) epiqVar.instance;
        epir epirVar2 = epir.a;
        epirVar.b = str;
    }

    public static final void c(int i, epiq epiqVar) {
        epiqVar.copyOnWrite();
        epir epirVar = (epir) epiqVar.instance;
        epir epirVar2 = epir.a;
        epirVar.c = i;
    }
}
