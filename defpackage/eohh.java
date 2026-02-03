package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eohh extends evsf implements evui {
    public eohh() {
        super(eohi.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        eohi eohiVar = (eohi) this.instance;
        eohi eohiVar2 = eohi.a;
        evtg evtgVar = eohiVar.b;
        if (!evtgVar.c()) {
            eohiVar.b = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, eohiVar.b);
    }
}
