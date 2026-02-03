package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewbz extends evsf implements evui {
    public ewbz() {
        super(ewca.a);
    }

    public final void a(evzo evzoVar) {
        copyOnWrite();
        ewca ewcaVar = (ewca) this.instance;
        ewca ewcaVar2 = ewca.a;
        evzoVar.getClass();
        evtg evtgVar = ewcaVar.b;
        if (!evtgVar.c()) {
            ewcaVar.b = evsn.mutableCopy(evtgVar);
        }
        ewcaVar.b.add(evzoVar);
    }

    public final void b(evzo evzoVar) {
        copyOnWrite();
        ewca ewcaVar = (ewca) this.instance;
        ewca ewcaVar2 = ewca.a;
        evzoVar.getClass();
        evtg evtgVar = ewcaVar.c;
        if (!evtgVar.c()) {
            ewcaVar.c = evsn.mutableCopy(evtgVar);
        }
        ewcaVar.c.add(evzoVar);
    }
}
