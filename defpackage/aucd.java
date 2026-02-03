package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aucd extends evsf implements evui {
    public aucd() {
        super(auce.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        auce auceVar = (auce) this.instance;
        auce auceVar2 = auce.a;
        evtg evtgVar = auceVar.g;
        if (!evtgVar.c()) {
            auceVar.g = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, auceVar.g);
    }
}
