package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auem extends evsf implements evui {
    public auem() {
        super(auen.a);
    }

    public final void a(auay auayVar) {
        copyOnWrite();
        auen auenVar = (auen) this.instance;
        auaz auazVar = (auaz) auayVar.build();
        auen auenVar2 = auen.a;
        auazVar.getClass();
        evtg evtgVar = auenVar.b;
        if (!evtgVar.c()) {
            auenVar.b = evsn.mutableCopy(evtgVar);
        }
        auenVar.b.add(auazVar);
    }

    public final void b(augd augdVar) {
        copyOnWrite();
        auen auenVar = (auen) this.instance;
        auge augeVar = (auge) augdVar.build();
        auen auenVar2 = auen.a;
        augeVar.getClass();
        auenVar.a();
        auenVar.c.add(augeVar);
    }

    public final void c(auge augeVar) {
        copyOnWrite();
        auen auenVar = (auen) this.instance;
        auen auenVar2 = auen.a;
        augeVar.getClass();
        auenVar.a();
        auenVar.c.add(augeVar);
    }
}
