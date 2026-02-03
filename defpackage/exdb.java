package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exdb extends evsf implements evui {
    public exdb() {
        super(exdc.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        exdc exdcVar = (exdc) this.instance;
        exdc exdcVar2 = exdc.a;
        evsx evsxVar = exdcVar.i;
        if (!evsxVar.c()) {
            exdcVar.i = evsn.mutableCopy(evsxVar);
        }
        evpz.addAll(iterable, exdcVar.i);
    }
}
