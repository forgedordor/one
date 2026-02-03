package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtqx extends evsf implements evui {
    public dtqx() {
        super(dtqy.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        dtqy dtqyVar = (dtqy) this.instance;
        dtqy dtqyVar2 = dtqy.a;
        evtg evtgVar = dtqyVar.p;
        if (!evtgVar.c()) {
            dtqyVar.p = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, dtqyVar.p);
    }
}
