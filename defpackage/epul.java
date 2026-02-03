package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epul {
    public static final /* synthetic */ epuk a(epuj epujVar) {
        evsn evsnVarBuild = epujVar.build();
        evsnVarBuild.getClass();
        return (epuk) evsnVarBuild;
    }

    public static final void b(epuv epuvVar, epuj epujVar) {
        epujVar.copyOnWrite();
        epuk epukVar = (epuk) epujVar.instance;
        epuk epukVar2 = epuk.a;
        epukVar.e = epuvVar;
        epukVar.b |= 1;
    }

    public static final void c(int i, epuj epujVar) {
        epujVar.copyOnWrite();
        epuk epukVar = (epuk) epujVar.instance;
        epuk epukVar2 = epuk.a;
        epukVar.b |= 4;
        epukVar.g = i;
    }

    public static final void d(evqs evqsVar, epuj epujVar) {
        epujVar.copyOnWrite();
        epuk epukVar = (epuk) epujVar.instance;
        epuk epukVar2 = epuk.a;
        epukVar.c = 2;
        epukVar.d = evqsVar;
    }
}
