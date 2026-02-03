package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class febv extends evsf implements evui {
    public febv() {
        super(febw.a);
    }

    public final void a(String str) {
        copyOnWrite();
        febw febwVar = (febw) this.instance;
        febw febwVar2 = febw.a;
        str.getClass();
        evtg evtgVar = febwVar.c;
        if (!evtgVar.c()) {
            febwVar.c = evsn.mutableCopy(evtgVar);
        }
        febwVar.c.add(str);
    }
}
