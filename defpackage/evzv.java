package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evzv extends evsf implements evui {
    public evzv() {
        super(evzw.a);
    }

    public final void a(evzu evzuVar) {
        copyOnWrite();
        evzw evzwVar = (evzw) this.instance;
        evzw evzwVar2 = evzw.a;
        evzuVar.getClass();
        evtg evtgVar = evzwVar.c;
        if (!evtgVar.c()) {
            evzwVar.c = evsn.mutableCopy(evtgVar);
        }
        evzwVar.c.add(evzuVar);
    }
}
