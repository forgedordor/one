package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etol extends evsf implements evui {
    public etol() {
        super(etom.a);
    }

    public final void a(etmf etmfVar) {
        copyOnWrite();
        etom etomVar = (etom) this.instance;
        etmi etmiVar = (etmi) etmfVar.build();
        etom etomVar2 = etom.a;
        etmiVar.getClass();
        evtg evtgVar = etomVar.f;
        if (!evtgVar.c()) {
            etomVar.f = evsn.mutableCopy(evtgVar);
        }
        etomVar.f.add(etmiVar);
    }
}
