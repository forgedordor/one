package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejgs extends evsf implements evui {
    public ejgs() {
        super(ejgt.a);
    }

    public final void a(ejgu ejguVar) {
        copyOnWrite();
        ejgt ejgtVar = (ejgt) this.instance;
        ejgw ejgwVar = (ejgw) ejguVar.build();
        ejgt ejgtVar2 = ejgt.a;
        ejgwVar.getClass();
        evtg evtgVar = ejgtVar.b;
        if (!evtgVar.c()) {
            ejgtVar.b = evsn.mutableCopy(evtgVar);
        }
        ejgtVar.b.add(ejgwVar);
    }
}
