package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejre extends evsf implements evui {
    public ejre() {
        super(ejrf.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ejrf ejrfVar = (ejrf) this.instance;
        ejrf ejrfVar2 = ejrf.a;
        evsx evsxVar = ejrfVar.b;
        if (!evsxVar.c()) {
            ejrfVar.b = evsn.mutableCopy(evsxVar);
        }
        evpz.addAll(iterable, ejrfVar.b);
    }
}
