package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaib extends evsn implements evui {
    public static final eaib a;
    private static volatile evuo d;
    public eahz b;
    public int c;
    private int e;

    static {
        eaib eaibVar = new eaib();
        a = eaibVar;
        evsn.registerDefaultInstance(eaib.class, eaibVar);
    }

    private eaib() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new eaib();
        }
        if (iOrdinal == 4) {
            return new eaia();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eaib.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
