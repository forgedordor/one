package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eozh extends evsf implements evui {
    public eozh() {
        super(eozi.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        eozi eoziVar = (eozi) this.instance;
        eozi eoziVar2 = eozi.a;
        evtg evtgVar = eoziVar.b;
        if (!evtgVar.c()) {
            eoziVar.b = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, eoziVar.b);
    }
}
