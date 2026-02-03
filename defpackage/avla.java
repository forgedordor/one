package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avla extends evsf implements evui {
    public avla() {
        super(avlb.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        avlb avlbVar = (avlb) this.instance;
        avlb avlbVar2 = avlb.a;
        evtg evtgVar = avlbVar.d;
        if (!evtgVar.c()) {
            avlbVar.d = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, avlbVar.d);
    }
}
