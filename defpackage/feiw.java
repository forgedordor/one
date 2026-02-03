package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feiw extends evsf implements evui {
    public feiw() {
        super(feix.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        feix feixVar = (feix) this.instance;
        feix feixVar2 = feix.a;
        evtg evtgVar = feixVar.u;
        if (!evtgVar.c()) {
            feixVar.u = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, feixVar.u);
    }
}
