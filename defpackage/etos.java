package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etos extends evsf implements evui {
    public etos() {
        super(etot.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        etot etotVar = (etot) this.instance;
        etot etotVar2 = etot.a;
        evsx evsxVar = etotVar.c;
        if (!evsxVar.c()) {
            etotVar.c = evsn.mutableCopy(evsxVar);
        }
        evpz.addAll(iterable, etotVar.c);
    }
}
