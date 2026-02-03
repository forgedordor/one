package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjpu extends evsf implements evui {
    public cjpu() {
        super(cjpv.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        cjpv cjpvVar = (cjpv) this.instance;
        cjpv cjpvVar2 = cjpv.a;
        evtg evtgVar = cjpvVar.b;
        if (!evtgVar.c()) {
            cjpvVar.b = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, cjpvVar.b);
    }
}
