package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eptj {
    public static final /* synthetic */ epti a(epth epthVar) {
        evsn evsnVarBuild = epthVar.build();
        evsnVarBuild.getClass();
        return (epti) evsnVarBuild;
    }

    public static final /* synthetic */ void b(Iterable iterable, epth epthVar) {
        epthVar.copyOnWrite();
        epti eptiVar = (epti) epthVar.instance;
        epti eptiVar2 = epti.a;
        evtg evtgVar = eptiVar.b;
        if (!evtgVar.c()) {
            eptiVar.b = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, eptiVar.b);
    }
}
