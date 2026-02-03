package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiif extends evsf implements evui {
    public eiif() {
        super(eiii.a);
    }

    public final void a(eies eiesVar) {
        copyOnWrite();
        eiii eiiiVar = (eiii) this.instance;
        eiii eiiiVar2 = eiii.a;
        eiesVar.getClass();
        evtg evtgVar = eiiiVar.e;
        if (!evtgVar.c()) {
            eiiiVar.e = evsn.mutableCopy(evtgVar);
        }
        eiiiVar.e.add(eiesVar);
    }
}
