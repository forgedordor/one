package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejqa extends evsf implements evui {
    public ejqa() {
        super(ejqb.a);
    }

    public final void a(String str) {
        copyOnWrite();
        ejqb ejqbVar = (ejqb) this.instance;
        ejqb ejqbVar2 = ejqb.a;
        evtg evtgVar = ejqbVar.f;
        if (!evtgVar.c()) {
            ejqbVar.f = evsn.mutableCopy(evtgVar);
        }
        ejqbVar.f.add(str);
    }
}
