package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epat extends evsf implements evui {
    public epat() {
        super(epau.a);
    }

    public final void a(epbl epblVar) {
        copyOnWrite();
        epau epauVar = (epau) this.instance;
        epau epauVar2 = epau.a;
        epblVar.getClass();
        evtg evtgVar = epauVar.c;
        if (!evtgVar.c()) {
            epauVar.c = evsn.mutableCopy(evtgVar);
        }
        epauVar.c.add(epblVar);
    }
}
