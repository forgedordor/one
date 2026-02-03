package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etlb extends evsf implements evui {
    public etlb() {
        super(etlc.a);
    }

    public final void a(etkt etktVar) {
        copyOnWrite();
        etlc etlcVar = (etlc) this.instance;
        etkv etkvVar = (etkv) etktVar.build();
        etlc etlcVar2 = etlc.a;
        etkvVar.getClass();
        evtg evtgVar = etlcVar.c;
        if (!evtgVar.c()) {
            etlcVar.c = evsn.mutableCopy(evtgVar);
        }
        etlcVar.c.add(etkvVar);
    }
}
