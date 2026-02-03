package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewar extends evsf implements evui {
    public ewar() {
        super(ewas.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ewas ewasVar = (ewas) this.instance;
        ewas ewasVar2 = ewas.a;
        evtg evtgVar = ewasVar.b;
        if (!evtgVar.c()) {
            ewasVar.b = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, ewasVar.b);
    }
}
