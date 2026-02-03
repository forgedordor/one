package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezfd extends evsn implements evui {
    public static final ezfd a;
    private static volatile evuo b;

    static {
        ezfd ezfdVar = new ezfd();
        a = ezfdVar;
        evsn.registerDefaultInstance(ezfd.class, ezfdVar);
    }

    private ezfd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ezfd();
        }
        if (iOrdinal == 4) {
            return new ezfc();
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
        synchronized (ezfd.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
