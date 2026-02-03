package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjgk extends evsf implements evui {
    public cjgk() {
        super(cjgl.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        cjgl cjglVar = (cjgl) this.instance;
        cjgl cjglVar2 = cjgl.a;
        evtg evtgVar = cjglVar.e;
        if (!evtgVar.c()) {
            cjglVar.e = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, cjglVar.e);
    }
}
