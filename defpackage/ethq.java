package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ethq extends evsf implements evui {
    public ethq() {
        super(ethr.a);
    }

    public final void a(etho ethoVar) {
        copyOnWrite();
        ethr ethrVar = (ethr) this.instance;
        ethp ethpVar = (ethp) ethoVar.build();
        ethr ethrVar2 = ethr.a;
        ethpVar.getClass();
        evtg evtgVar = ethrVar.c;
        if (!evtgVar.c()) {
            ethrVar.c = evsn.mutableCopy(evtgVar);
        }
        ethrVar.c.add(ethpVar);
    }
}
