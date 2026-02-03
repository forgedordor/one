package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exoo extends evsf implements evui {
    public exoo() {
        super(exop.a);
    }

    public final void a(exow exowVar) {
        copyOnWrite();
        exop exopVar = (exop) this.instance;
        exop exopVar2 = exop.a;
        exowVar.getClass();
        evtg evtgVar = exopVar.b;
        if (!evtgVar.c()) {
            exopVar.b = evsn.mutableCopy(evtgVar);
        }
        exopVar.b.add(exowVar);
    }
}
