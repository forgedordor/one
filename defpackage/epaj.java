package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epaj extends evsf implements evui {
    public epaj() {
        super(epak.a);
    }

    public final void a(eowm eowmVar) {
        copyOnWrite();
        epak epakVar = (epak) this.instance;
        epak epakVar2 = epak.a;
        eowmVar.getClass();
        evtg evtgVar = epakVar.c;
        if (!evtgVar.c()) {
            epakVar.c = evsn.mutableCopy(evtgVar);
        }
        epakVar.c.add(eowmVar);
    }
}
