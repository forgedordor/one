package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epvw {
    public static final /* synthetic */ epvv a(epvu epvuVar) {
        evsn evsnVarBuild = epvuVar.build();
        evsnVarBuild.getClass();
        return (epvv) evsnVarBuild;
    }

    public static final /* synthetic */ void b(evqs evqsVar, epvu epvuVar) {
        epvuVar.copyOnWrite();
        epvv epvvVar = (epvv) epvuVar.instance;
        epvv epvvVar2 = epvv.a;
        evtg evtgVar = epvvVar.b;
        if (!evtgVar.c()) {
            epvvVar.b = evsn.mutableCopy(evtgVar);
        }
        epvvVar.b.add(evqsVar);
    }
}
