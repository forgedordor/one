package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emie extends evsf implements evui {
    public emie() {
        super(emih.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        emih emihVar = (emih) this.instance;
        emih emihVar2 = emih.a;
        evtg evtgVar = emihVar.i;
        if (!evtgVar.c()) {
            emihVar.i = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, emihVar.i);
    }
}
