package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cirz extends evsf implements evui {
    public cirz() {
        super(cisa.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        cisa cisaVar = (cisa) this.instance;
        cisa cisaVar2 = cisa.a;
        evtg evtgVar = cisaVar.f;
        if (!evtgVar.c()) {
            cisaVar.f = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, cisaVar.f);
    }
}
