package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etdi extends evsf implements evui {
    public etdi() {
        super(etdj.a);
    }

    public final void a(String str) {
        copyOnWrite();
        etdj etdjVar = (etdj) this.instance;
        etdj etdjVar2 = etdj.a;
        str.getClass();
        evtg evtgVar = etdjVar.d;
        if (!evtgVar.c()) {
            etdjVar.d = evsn.mutableCopy(evtgVar);
        }
        etdjVar.d.add(str);
    }
}
