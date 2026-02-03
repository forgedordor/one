package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezus extends evsn implements evui {
    public static final ezus a;
    private static volatile evuo b;
    private int c;
    private ezoz d;

    static {
        ezus ezusVar = new ezus();
        a = ezusVar;
        evsn.registerDefaultInstance(ezus.class, ezusVar);
    }

    private ezus() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new ezus();
        }
        if (iOrdinal == 4) {
            return new ezur();
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
        synchronized (ezus.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
