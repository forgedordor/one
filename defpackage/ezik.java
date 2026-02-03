package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezik extends evsn implements evui {
    public static final ezik a;
    private static volatile evuo c;
    public boolean b;

    static {
        ezik ezikVar = new ezik();
        a = ezikVar;
        evsn.registerDefaultInstance(ezik.class, ezikVar);
    }

    private ezik() {
        evqs evqsVar = evqs.b;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0007", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new ezik();
        }
        if (iOrdinal == 4) {
            return new ezij();
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
        synchronized (ezik.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
