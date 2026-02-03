package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exxm extends evsn implements evui {
    public static final exxm a;
    private static volatile evuo b;
    private int c;
    private exya d;

    static {
        exxm exxmVar = new exxm();
        a = exxmVar;
        evsn.registerDefaultInstance(exxm.class, exxmVar);
    }

    private exxm() {
        emptyIntList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new exxm();
        }
        if (iOrdinal == 4) {
            return new exxl();
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
        synchronized (exxm.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
