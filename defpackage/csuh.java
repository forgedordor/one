package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csuh extends evsn implements evui {
    public static final csuh a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        csuh csuhVar = new csuh();
        a = csuhVar;
        evsn.registerDefaultInstance(csuh.class, csuhVar);
    }

    private csuh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", csvg.class});
        }
        if (iOrdinal == 3) {
            return new csuh();
        }
        if (iOrdinal == 4) {
            return new csug();
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
        synchronized (csuh.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
