package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etwc extends evsn implements evui {
    public static final etwc a;
    private static volatile evuo e;
    public int b;
    public etul c;
    public ettv d;

    static {
        etwc etwcVar = new etwc();
        a = etwcVar;
        evsn.registerDefaultInstance(etwc.class, etwcVar);
    }

    private etwc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new etwc();
        }
        if (iOrdinal == 4) {
            return new etwb();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etwc.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
