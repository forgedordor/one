package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejgo extends evsf implements evui {
    public ejgo() {
        super(ejgp.a);
    }

    public final void a(ejgq ejgqVar) {
        copyOnWrite();
        ejgp ejgpVar = (ejgp) this.instance;
        ejgr ejgrVar = (ejgr) ejgqVar.build();
        ejgp ejgpVar2 = ejgp.a;
        ejgrVar.getClass();
        evtg evtgVar = ejgpVar.b;
        if (!evtgVar.c()) {
            ejgpVar.b = evsn.mutableCopy(evtgVar);
        }
        ejgpVar.b.add(ejgrVar);
    }
}
