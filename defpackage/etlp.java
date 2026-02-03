package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etlp extends evsf implements evui {
    public etlp() {
        super(etly.a);
    }

    public final void a(etnq etnqVar) {
        copyOnWrite();
        etly etlyVar = (etly) this.instance;
        etnt etntVar = (etnt) etnqVar.build();
        etly etlyVar2 = etly.a;
        etntVar.getClass();
        evtg evtgVar = etlyVar.k;
        if (!evtgVar.c()) {
            etlyVar.k = evsn.mutableCopy(evtgVar);
        }
        etlyVar.k.add(etntVar);
    }

    public final void b(etlk etlkVar) {
        copyOnWrite();
        etly etlyVar = (etly) this.instance;
        etly etlyVar2 = etly.a;
        etlkVar.getClass();
        etlyVar.a();
        etlyVar.h.add(etlkVar);
    }
}
