package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzgm extends evsf implements evui {
    public dzgm() {
        super(dzgp.a);
    }

    public final void a(fejh fejhVar) {
        copyOnWrite();
        dzgp dzgpVar = (dzgp) this.instance;
        feji fejiVar = (feji) fejhVar.build();
        dzgp dzgpVar2 = dzgp.a;
        fejiVar.getClass();
        evtg evtgVar = dzgpVar.c;
        if (!evtgVar.c()) {
            dzgpVar.c = evsn.mutableCopy(evtgVar);
        }
        dzgpVar.c.add(fejiVar);
    }
}
