package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etlj extends evsf implements evui {
    public etlj() {
        super(etlk.a);
    }

    public final void a(etnq etnqVar) {
        copyOnWrite();
        etlk etlkVar = (etlk) this.instance;
        etnt etntVar = (etnt) etnqVar.build();
        etlk etlkVar2 = etlk.a;
        etntVar.getClass();
        evtg evtgVar = etlkVar.i;
        if (!evtgVar.c()) {
            etlkVar.i = evsn.mutableCopy(evtgVar);
        }
        etlkVar.i.add(etntVar);
    }
}
