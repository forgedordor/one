package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejrx extends evsn implements evui {
    public static final ejrx a;
    private static volatile evuo c;
    public long b;

    static {
        ejrx ejrxVar = new ejrx();
        a = ejrxVar;
        evsn.registerDefaultInstance(ejrx.class, ejrxVar);
    }

    private ejrx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new ejrx();
        }
        if (iOrdinal == 4) {
            return new ejrw();
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
        synchronized (ejrx.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
