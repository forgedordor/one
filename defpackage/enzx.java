package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enzx extends evsn implements evui {
    public static final enzx a;
    private static volatile evuo b;

    static {
        enzx enzxVar = new enzx();
        a = enzxVar;
        evsn.registerDefaultInstance(enzx.class, enzxVar);
    }

    private enzx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new enzx();
        }
        if (iOrdinal == 4) {
            return new enzw();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = b;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (enzx.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
