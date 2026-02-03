package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epur {
    public static final /* synthetic */ void a(epun epunVar, epup epupVar) {
        epupVar.copyOnWrite();
        epuq epuqVar = (epuq) epupVar.instance;
        epuq epuqVar2 = epuq.a;
        evtg evtgVar = epuqVar.b;
        if (!evtgVar.c()) {
            epuqVar.b = evsn.mutableCopy(evtgVar);
        }
        epuqVar.b.add(epunVar);
    }
}
