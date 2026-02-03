package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fecz extends evsf implements evui {
    public fecz() {
        super(feda.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        feda fedaVar = (feda) this.instance;
        feda fedaVar2 = feda.a;
        evtg evtgVar = fedaVar.c;
        if (!evtgVar.c()) {
            fedaVar.c = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, fedaVar.c);
    }

    public final void b(Iterable iterable) {
        copyOnWrite();
        feda fedaVar = (feda) this.instance;
        feda fedaVar2 = feda.a;
        evtg evtgVar = fedaVar.d;
        if (!evtgVar.c()) {
            fedaVar.d = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, fedaVar.d);
    }
}
