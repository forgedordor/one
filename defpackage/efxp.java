package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efxp extends evsf<efxs, efxp> implements evui {
    public efxp() {
        super(efxs.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        efxs efxsVar = (efxs) this.instance;
        efxs efxsVar2 = efxs.a;
        evtg evtgVar = efxsVar.f;
        if (!evtgVar.c()) {
            efxsVar.f = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, efxsVar.f);
    }
}
