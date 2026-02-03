package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aucm extends evsf implements evui {
    public aucm() {
        super(aucn.a);
    }

    public final void a(auaw auawVar) {
        copyOnWrite();
        aucn aucnVar = (aucn) this.instance;
        auax auaxVar = (auax) auawVar.build();
        aucn aucnVar2 = aucn.a;
        auaxVar.getClass();
        evtg evtgVar = aucnVar.b;
        if (!evtgVar.c()) {
            aucnVar.b = evsn.mutableCopy(evtgVar);
        }
        aucnVar.b.add(auaxVar);
    }

    public final void b(augb augbVar) {
        copyOnWrite();
        aucn aucnVar = (aucn) this.instance;
        augc augcVar = (augc) augbVar.build();
        aucn aucnVar2 = aucn.a;
        augcVar.getClass();
        evtg evtgVar = aucnVar.c;
        if (!evtgVar.c()) {
            aucnVar.c = evsn.mutableCopy(evtgVar);
        }
        aucnVar.c.add(augcVar);
    }
}
