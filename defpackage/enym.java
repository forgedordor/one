package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enym extends evsn implements evui {
    public static final enym a;
    private static volatile evuo f;
    public int b;
    public String c = "";
    public int d;
    public boolean e;

    static {
        enym enymVar = new enym();
        a = enymVar;
        evsn.registerDefaultInstance(enym.class, enymVar);
    }

    private enym() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0001\u0002ဈ\u0000\u0003ဇ\u0002", new Object[]{"b", "d", "c", "e"});
        }
        if (iOrdinal == 3) {
            return new enym();
        }
        if (iOrdinal == 4) {
            return new enyl();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (enym.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
