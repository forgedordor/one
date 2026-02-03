package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ettf extends evsf implements evui {
    public ettf() {
        super(ettg.a);
    }

    public final void a(ettd ettdVar) {
        copyOnWrite();
        ettg ettgVar = (ettg) this.instance;
        ette etteVar = (ette) ettdVar.build();
        ettg ettgVar2 = ettg.a;
        etteVar.getClass();
        evtg evtgVar = ettgVar.b;
        if (!evtgVar.c()) {
            ettgVar.b = evsn.mutableCopy(evtgVar);
        }
        ettgVar.b.add(etteVar);
    }
}
