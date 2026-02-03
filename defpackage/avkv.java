package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avkv extends evsf implements evui {
    public avkv() {
        super(avkw.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        avkw avkwVar = (avkw) this.instance;
        avkw avkwVar2 = avkw.a;
        evtg evtgVar = avkwVar.c;
        if (!evtgVar.c()) {
            avkwVar.c = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, avkwVar.c);
    }
}
