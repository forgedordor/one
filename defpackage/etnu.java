package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etnu extends evsf implements evui {
    public etnu() {
        super(etnx.a);
    }

    public final void a(etnq etnqVar) {
        copyOnWrite();
        etnx etnxVar = (etnx) this.instance;
        etnt etntVar = (etnt) etnqVar.build();
        etnx etnxVar2 = etnx.a;
        etntVar.getClass();
        evtg evtgVar = etnxVar.m;
        if (!evtgVar.c()) {
            etnxVar.m = evsn.mutableCopy(evtgVar);
        }
        etnxVar.m.add(etntVar);
    }

    public final void b(etnq etnqVar) {
        copyOnWrite();
        etnx etnxVar = (etnx) this.instance;
        etnt etntVar = (etnt) etnqVar.build();
        etnx etnxVar2 = etnx.a;
        etntVar.getClass();
        evtg evtgVar = etnxVar.l;
        if (!evtgVar.c()) {
            etnxVar.l = evsn.mutableCopy(evtgVar);
        }
        etnxVar.l.add(etntVar);
    }
}
