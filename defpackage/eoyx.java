package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoyx extends evsn implements evui {
    public static final eoyx a;
    private static volatile evuo c;
    public evtg b = evsn.emptyProtobufList();

    static {
        eoyx eoyxVar = new eoyx();
        a = eoyxVar;
        evsn.registerDefaultInstance(eoyx.class, eoyxVar);
    }

    private eoyx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new eoyx();
        }
        if (iOrdinal == 4) {
            return new eoyw();
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
        synchronized (eoyx.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
