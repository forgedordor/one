package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wrz {
    public static final /* synthetic */ wry a(wrx wrxVar) {
        evsn evsnVarBuild = wrxVar.build();
        evsnVarBuild.getClass();
        return (wry) evsnVarBuild;
    }

    public static final /* synthetic */ void b(Iterable iterable, wrx wrxVar) {
        wrxVar.copyOnWrite();
        wry wryVar = (wry) wrxVar.instance;
        wry wryVar2 = wry.a;
        evtg evtgVar = wryVar.c;
        if (!evtgVar.c()) {
            wryVar.c = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, wryVar.c);
    }
}
