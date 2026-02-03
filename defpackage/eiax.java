package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiax extends evsf implements evui {
    public eiax() {
        super(eiay.a);
    }

    public final void a(eiaw eiawVar) {
        copyOnWrite();
        eiay eiayVar = (eiay) this.instance;
        eiay eiayVar2 = eiay.a;
        eiawVar.getClass();
        evtg evtgVar = eiayVar.d;
        if (!evtgVar.c()) {
            eiayVar.d = evsn.mutableCopy(evtgVar);
        }
        eiayVar.d.add(eiawVar);
    }
}
