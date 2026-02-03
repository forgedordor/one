package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evrv extends evsf implements evui {
    public evrv() {
        super(evrw.a);
    }

    public final void a(String str) {
        copyOnWrite();
        evrw evrwVar = (evrw) this.instance;
        evrw evrwVar2 = evrw.a;
        evtg evtgVar = evrwVar.b;
        if (!evtgVar.c()) {
            evrwVar.b = evsn.mutableCopy(evtgVar);
        }
        evrwVar.b.add(str);
    }
}
