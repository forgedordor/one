package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejrd extends evsf implements evui {
    public ejrd() {
        super(ejrg.a);
    }

    public final void a(ejrf ejrfVar) {
        copyOnWrite();
        ejrg ejrgVar = (ejrg) this.instance;
        ejrg ejrgVar2 = ejrg.a;
        ejrfVar.getClass();
        evtg evtgVar = ejrgVar.b;
        if (!evtgVar.c()) {
            ejrgVar.b = evsn.mutableCopy(evtgVar);
        }
        ejrgVar.b.add(ejrfVar);
    }
}
