package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etsd extends evsf implements evui {
    public etsd() {
        super(etse.a);
    }

    public final void a(etsa etsaVar) {
        copyOnWrite();
        etse etseVar = (etse) this.instance;
        etse etseVar2 = etse.a;
        etsaVar.getClass();
        evtg evtgVar = etseVar.g;
        if (!evtgVar.c()) {
            etseVar.g = evsn.mutableCopy(evtgVar);
        }
        etseVar.g.add(etsaVar);
    }
}
