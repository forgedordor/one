package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezaz extends evsf implements evui {
    public ezaz() {
        super(ezba.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ezba ezbaVar = (ezba) this.instance;
        ezba ezbaVar2 = ezba.a;
        evtg evtgVar = ezbaVar.c;
        if (!evtgVar.c()) {
            ezbaVar.c = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, ezbaVar.c);
    }
}
