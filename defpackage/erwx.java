package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erwx extends evsf implements evui {
    public erwx() {
        super(erwy.a);
    }

    public final void a(String str) {
        copyOnWrite();
        erwy erwyVar = (erwy) this.instance;
        erwy erwyVar2 = erwy.a;
        str.getClass();
        evtg evtgVar = erwyVar.c;
        if (!evtgVar.c()) {
            erwyVar.c = evsn.mutableCopy(evtgVar);
        }
        erwyVar.c.add(str);
    }
}
