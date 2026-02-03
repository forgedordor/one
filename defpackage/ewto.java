package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewto extends evsn implements evui {
    public static final ewto a;
    private static volatile evuo c;
    public evtg b = evsn.emptyProtobufList();

    static {
        ewto ewtoVar = new ewto();
        a = ewtoVar;
        evsn.registerDefaultInstance(ewto.class, ewtoVar);
    }

    private ewto() {
    }

    public final void a() {
        evtg evtgVar = this.b;
        if (evtgVar.c()) {
            return;
        }
        this.b = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new ewto();
        }
        if (iOrdinal == 4) {
            return new ewtn();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewto.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
