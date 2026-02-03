package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejio extends evsf implements evui {
    public ejio() {
        super(ejip.a);
    }

    public final void a(ejis ejisVar) {
        copyOnWrite();
        ejip ejipVar = (ejip) this.instance;
        ejit ejitVar = (ejit) ejisVar.build();
        ejip ejipVar2 = ejip.a;
        ejitVar.getClass();
        evtg evtgVar = ejipVar.b;
        if (!evtgVar.c()) {
            ejipVar.b = evsn.mutableCopy(evtgVar);
        }
        ejipVar.b.add(ejitVar);
    }
}
