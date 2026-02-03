package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezjs extends evsf implements evui {
    public ezjs() {
        super(ezjt.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ezjt ezjtVar = (ezjt) this.instance;
        ezjt ezjtVar2 = ezjt.a;
        evtg evtgVar = ezjtVar.d;
        if (!evtgVar.c()) {
            ezjtVar.d = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, ezjtVar.d);
    }
}
