package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epit {
    public static final /* synthetic */ epis a(epip epipVar) {
        evsn evsnVarBuild = epipVar.build();
        evsnVarBuild.getClass();
        return (epis) evsnVarBuild;
    }

    public static final /* synthetic */ void b(Iterable iterable, epip epipVar) {
        iterable.getClass();
        epipVar.copyOnWrite();
        epis episVar = (epis) epipVar.instance;
        epis episVar2 = epis.a;
        evtg evtgVar = episVar.b;
        if (!evtgVar.c()) {
            episVar.b = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, episVar.b);
    }

    public static final void c(int i, epip epipVar) {
        epipVar.copyOnWrite();
        epis episVar = (epis) epipVar.instance;
        epis episVar2 = epis.a;
        episVar.c = eqqv.b(i);
    }
}
