package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eabd extends evsf implements evui {
    public eabd() {
        super(eabe.a);
    }

    public final void a(String str) {
        copyOnWrite();
        eabe eabeVar = (eabe) this.instance;
        eabe eabeVar2 = eabe.a;
        str.getClass();
        evtg evtgVar = eabeVar.c;
        if (!evtgVar.c()) {
            eabeVar.c = evsn.mutableCopy(evtgVar);
        }
        eabeVar.c.add(str);
    }
}
