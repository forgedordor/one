package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eowo extends evsf implements evui {
    public eowo() {
        super(eowp.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        eowp eowpVar = (eowp) this.instance;
        eowp eowpVar2 = eowp.a;
        evtg evtgVar = eowpVar.c;
        if (!evtgVar.c()) {
            eowpVar.c = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, eowpVar.c);
    }
}
