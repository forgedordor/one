package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epiy {
    public static final /* synthetic */ epix a(epiw epiwVar) {
        evsn evsnVarBuild = epiwVar.build();
        evsnVarBuild.getClass();
        return (epix) evsnVarBuild;
    }

    public static final /* synthetic */ void b(Iterable iterable, epiw epiwVar) {
        epiwVar.copyOnWrite();
        epix epixVar = (epix) epiwVar.instance;
        epix epixVar2 = epix.a;
        evtg evtgVar = epixVar.b;
        if (!evtgVar.c()) {
            epixVar.b = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, epixVar.b);
    }

    public static final void c(int i, epiw epiwVar) {
        epiwVar.copyOnWrite();
        epix epixVar = (epix) epiwVar.instance;
        epix epixVar2 = epix.a;
        epixVar.c = eqqv.b(i);
    }
}
