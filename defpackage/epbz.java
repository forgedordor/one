package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epbz extends evsf implements evui {
    public epbz() {
        super(epca.a);
    }

    public final void a(epbl epblVar) {
        copyOnWrite();
        epca epcaVar = (epca) this.instance;
        epca epcaVar2 = epca.a;
        epblVar.getClass();
        evtg evtgVar = epcaVar.b;
        if (!evtgVar.c()) {
            epcaVar.b = evsn.mutableCopy(evtgVar);
        }
        epcaVar.b.add(epblVar);
    }
}
