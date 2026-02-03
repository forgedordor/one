package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eped extends evsf implements evui {
    public eped() {
        super(epee.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        epee epeeVar = (epee) this.instance;
        epee epeeVar2 = epee.a;
        evtg evtgVar = epeeVar.d;
        if (!evtgVar.c()) {
            epeeVar.d = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, epeeVar.d);
    }
}
